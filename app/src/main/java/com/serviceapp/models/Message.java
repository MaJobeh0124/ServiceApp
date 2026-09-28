package com.serviceapp.models;

public class Message {
    public static final String TYPE_TEXT = "text";
    public static final String TYPE_IMAGE = "image";

    private String messageId;
    private String senderId;
    private String receiverId;
    private String requestId;
    private String content;
    private String imageUrl;
    private String type;
    private long timestamp;
    private boolean isRead;

    public Message() {}

    public Message(String senderId, String receiverId, String requestId,
                   String content, String type) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.requestId = requestId;
        this.content = content;
        this.type = type;
        this.timestamp = System.currentTimeMillis();
        this.isRead = false;
    }

    // Getters
    public String getMessageId() { return messageId; }
    public String getSenderId() { return senderId; }
    public String getReceiverId() { return receiverId; }
    public String getRequestId() { return requestId; }
    public String getContent() { return content; }
    public String getImageUrl() { return imageUrl; }
    public String getType() { return type; }
    public long getTimestamp() { return timestamp; }
    public boolean isRead() { return isRead; }

    // Setters
    public void setMessageId(String messageId) { this.messageId = messageId; }
    public void setSenderId(String senderId) { this.senderId = senderId; }
    public void setReceiverId(String receiverId) { this.receiverId = receiverId; }
    public void setRequestId(String requestId) { this.requestId = requestId; }
    public void setContent(String content) { this.content = content; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
    public void setType(String type) { this.type = type; }
    public void setTimestamp(long timestamp) { this.timestamp = timestamp; }
    public void setRead(boolean read) { isRead = read; }
}
