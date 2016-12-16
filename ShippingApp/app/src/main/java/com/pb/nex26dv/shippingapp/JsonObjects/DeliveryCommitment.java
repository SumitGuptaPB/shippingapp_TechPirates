package com.pb.nex26dv.shippingapp.JsonObjects;

/**
 * Created by nex9zka on 12/9/2016.
 */

public class DeliveryCommitment {
    private String minEstimatedNumberOfDays = null;
    private String maxEstimatedNumberOfDays = null;
    private String estimatedDeliveryDateTime = null;
    private String guarantee = null;
    private String additionalDetails = null;

    public DeliveryCommitment() {
    }

  public String getMinEstimatedNumberOfDays() {
        return this.minEstimatedNumberOfDays;
    }

    public void setMinEstimatedNumberOfDays(String minEstimatedNumberOfDays) {
        this.minEstimatedNumberOfDays = minEstimatedNumberOfDays;
    }
    public String getMaxEstimatedNumberOfDays() {
        return this.maxEstimatedNumberOfDays;
    }

    public void setMaxEstimatedNumberOfDays(String maxEstimatedNumberOfDays) {
        this.maxEstimatedNumberOfDays = maxEstimatedNumberOfDays;
    }

   public String getEstimatedDeliveryDateTime() {
        return this.estimatedDeliveryDateTime;
    }

    public void setEstimatedDeliveryDateTime(String estimatedDeliveryDateTime) {
        this.estimatedDeliveryDateTime = estimatedDeliveryDateTime;
    }

    public String getGuarantee() {
        return this.guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public String getAdditionalDetails() {
        return this.additionalDetails;
    }

    public void setAdditionalDetails(String additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeliveryCommitment {\n");
        sb.append("  minEstimatedNumberOfDays: ").append(this.minEstimatedNumberOfDays).append("\n");
        sb.append("  maxEstimatedNumberOfDays: ").append(this.maxEstimatedNumberOfDays).append("\n");
        sb.append("  estimatedDeliveryDateTime: ").append(this.estimatedDeliveryDateTime).append("\n");
        sb.append("  guarantee: ").append(this.guarantee).append("\n");
        sb.append("  additionalDetails: ").append(this.additionalDetails).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
