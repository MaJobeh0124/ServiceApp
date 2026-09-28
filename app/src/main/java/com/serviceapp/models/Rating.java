package com.serviceapp.models;

public class Rating {
    private String ratingId;
    private String raterId;      // Who is giving the rating
    private String ratedUserId;  // Who is being rated
    private String requestId;
    private float stars;
    private String comment;
    private String raterName;
    private String raterImageUrl;
    private long timestamp;

    public Rating() {}

    public Rating(String raterId, String ratedUserId, String requestId,
                  float stars, String comment) {
        this.raterId = raterId;
        this.ratedUserId = ratedUserId;
        this.requestId = requestId;
        this.stars = stars;
        this.comment = comment;
        this.timestamp = System.currentTimeMillis();
    }

    // Getters
    public String getRatingId() { return ratingId; }
    public String getRaterId() { return raterId; }
    public String getRatedUserId() { return ratedUserId; }
    public String getRequestId() { return requestId; }
    public float getStars() { return stars; }
    public String getComment() { return comment; }
    public String getRaterName() { return raterName; }
    public String getRaterImageUrl() { return raterImageUrl; }
    public long getTimestamp() { return timestamp; }

    // Setters
    public void setRatingId(String ratingId) { this.ratingId = ratingId; }
    public void setRaterId(String raterId) { this.raterId = raterId; }
    public void setRatedUserId(String ratedUserId) { this.ratedUserId = ratedUserId; }
    public void setRequestId(String requestId) { this.requestId = requestId; }
    public void setStars(float stars) { this.stars = stars; }
    public void setComment(String comment) { this.comment = comment; }
    public void setRaterName(String raterName) { this.raterName = raterName; }
    public void setRaterImageUrl(String raterImageUrl) { this.raterImageUrl = raterImageUrl; }
    public void setTimestamp(long timestamp) { this.timestamp = timestamp; }
}
