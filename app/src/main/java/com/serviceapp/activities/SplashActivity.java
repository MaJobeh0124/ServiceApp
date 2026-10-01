package com.serviceapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.serviceapp.R;

public class SplashActivity extends AppCompatActivity {

    private static final long SPLASH_DELAY = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Animate logo
        ImageView ivLogo = findViewById(R.id.iv_logo);
        TextView tvAppName = findViewById(R.id.tv_app_name);

        animateLogo(ivLogo);
        animateText(tvAppName);

        // Navigate after delay
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
            if (currentUser != null) {
                // Check account type and route accordingly
                com.google.firebase.firestore.FirebaseFirestore.getInstance()
                        .collection("users").document(currentUser.getUid()).get()
                        .addOnSuccessListener(doc -> {
                            com.serviceapp.models.User user = doc.toObject(com.serviceapp.models.User.class);
                            if (user != null && "provider".equals(user.getAccountType())) {
                                startActivity(new Intent(SplashActivity.this, ProviderDashboardActivity.class));
                            } else {
                                startActivity(new Intent(SplashActivity.this, HomeActivity.class));
                            }
                            finish();
                        })
                        .addOnFailureListener(e -> {
                            startActivity(new Intent(SplashActivity.this, HomeActivity.class));
                            finish();
                        });
            } else {
                // Not logged in, go to Welcome screen
                startActivity(new Intent(SplashActivity.this, WelcomeActivity.class));
                finish();
            }
        }, SPLASH_DELAY);
    }

    private void animateLogo(ImageView view) {
        ScaleAnimation scale = new ScaleAnimation(
                0.5f, 1.0f, 0.5f, 1.0f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        scale.setDuration(800);

        AlphaAnimation alpha = new AlphaAnimation(0f, 1f);
        alpha.setDuration(800);

        AnimationSet set = new AnimationSet(true);
        set.addAnimation(scale);
        set.addAnimation(alpha);
        set.setFillAfter(true);

        view.startAnimation(set);
    }

    private void animateText(TextView view) {
        AlphaAnimation alpha = new AlphaAnimation(0f, 1f);
        alpha.setDuration(1000);
        alpha.setStartOffset(600);
        alpha.setFillAfter(true);
        view.startAnimation(alpha);
    }
}
