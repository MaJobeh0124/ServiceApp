package com.serviceapp.models;

public class User {
    private String uid;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String phone;
    private String profileImageUrl;
    private String accountType; // "client" or "provider"
    private String serviceType; // e.g. "plumbing", "electrical" — for providers only
    private double rating;
    private int totalRatings;
    private double latitude;
    private double longitude;
    private boolean isOnline;
    private long createdAt;

    public User() {
        // Required empty constructor for Firestore
    }

    public User(String uid, String firstName, String lastName, String username,
                String email, String phone, String accountType) {
        this.uid = uid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.accountType = accountType;
        this.rating = 0.0;
        this.totalRatings = 0;
        this.isOnline = false;
        this.createdAt = System.currentTimeMillis();
    }

    // Getters
    public String getUid() { return uid; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getProfileImageUrl() { return profileImageUrl; }
    public String getAccountType() { return accountType; }
    public String getServiceType() { return serviceType; }
    public double getRating() { return rating; }
    public int getTotalRatings() { return totalRatings; }
    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }
    public boolean isOnline() { return isOnline; }
    public long getCreatedAt() { return createdAt; }
    public String getFullName() { return firstName + " " + lastName; }

    // Setters
    public void setUid(String uid) { this.uid = uid; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setUsername(String username) { this.username = username; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setProfileImageUrl(String profileImageUrl) { this.profileImageUrl = profileImageUrl; }
    public void setAccountType(String accountType) { this.accountType = accountType; }
    public void setServiceType(String serviceType) { this.serviceType = serviceType; }
    public void setRating(double rating) { this.rating = rating; }
    public void setTotalRatings(int totalRatings) { this.totalRatings = totalRatings; }
    public void setLatitude(double latitude) { this.latitude = latitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }
    public void setOnline(boolean online) { isOnline = online; }
    public void setCreatedAt(long createdAt) { this.createdAt = createdAt; }
}
