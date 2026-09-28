package com.serviceapp.models;

public class ServiceRequest {
    public static final String STATUS_PENDING = "pending";
    public static final String STATUS_ACCEPTED = "accepted";
    public static final String STATUS_PROVIDER_ACCEPTED = "provider_accepted";
    public static final String STATUS_CLIENT_ACCEPTED = "client_accepted";
    public static final String STATUS_ON_WAY = "on_way";
    public static final String STATUS_ARRIVED = "arrived";
    public static final String STATUS_IN_PROGRESS = "in_progress";
    public static final String STATUS_COMPLETED = "completed";
    public static final String STATUS_CANCELLED = "cancelled";

    private String requestId;
    private String clientId;
    private String providerId;
    private String serviceType;
    private String status;
    private double clientLatitude;
    private double clientLongitude;
    private double providerLatitude;
    private double providerLongitude;
    private String agreedPrice;
    private String problemDescription;
    private long createdAt;
    private long updatedAt;

    public ServiceRequest() {}

    public ServiceRequest(String requestId, String clientId, String serviceType,
                          double clientLatitude, double clientLongitude) {
        this.requestId = requestId;
        this.clientId = clientId;
        this.serviceType = serviceType;
        this.status = STATUS_PENDING;
        this.clientLatitude = clientLatitude;
        this.clientLongitude = clientLongitude;
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = System.currentTimeMillis();
    }

    // Getters
    public String getRequestId() { return requestId; }
    public String getClientId() { return clientId; }
    public String getProviderId() { return providerId; }
    public String getServiceType() { return serviceType; }
    public String getStatus() { return status; }
    public double getClientLatitude() { return clientLatitude; }
    public double getClientLongitude() { return clientLongitude; }
    public double getProviderLatitude() { return providerLatitude; }
    public double getProviderLongitude() { return providerLongitude; }
    public String getAgreedPrice() { return agreedPrice; }
    public String getProblemDescription() { return problemDescription; }
    public long getCreatedAt() { return createdAt; }
    public long getUpdatedAt() { return updatedAt; }

    // Setters
    public void setRequestId(String requestId) { this.requestId = requestId; }
    public void setClientId(String clientId) { this.clientId = clientId; }
    public void setProviderId(String providerId) { this.providerId = providerId; }
    public void setServiceType(String serviceType) { this.serviceType = serviceType; }
    public void setStatus(String status) {
        this.status = status;
        this.updatedAt = System.currentTimeMillis();
    }
    public void setClientLatitude(double clientLatitude) { this.clientLatitude = clientLatitude; }
    public void setClientLongitude(double clientLongitude) { this.clientLongitude = clientLongitude; }
    public void setProviderLatitude(double providerLatitude) { this.providerLatitude = providerLatitude; }
    public void setProviderLongitude(double providerLongitude) { this.providerLongitude = providerLongitude; }
    public void setAgreedPrice(String agreedPrice) { this.agreedPrice = agreedPrice; }
    public void setProblemDescription(String problemDescription) { this.problemDescription = problemDescription; }
    public void setCreatedAt(long createdAt) { this.createdAt = createdAt; }
    public void setUpdatedAt(long updatedAt) { this.updatedAt = updatedAt; }
}
