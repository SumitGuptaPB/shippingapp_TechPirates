package com.pb.nex26dv.shippingapp.JsonObjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nex9zka on 12/9/2016.
 */

public class Rate {
    private String carrier = null;
    private String parcelType = null;
    private String serviceId = null;
    private String rateTypeId = null;
    private List<SpecialService> specialServices = new ArrayList();
    private String inductionPostalCode = null;
    private ParcelWeight dimensionalWeight = null;
    private Double totalCarrierCharge = null;
    private Double totalTaxAmount = null;
    private Double baseCharge = null;
    private List<Tax> baseChargeTaxes = new ArrayList();
    private List<Surcharge> surcharges = new ArrayList();
    private List<Discount> discounts = new ArrayList();
    private DeliveryCommitment deliveryCommitment = null;
    private String currencyCode = null;

    public Rate() {
    }

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

       public String getParcelType() {
        return this.parcelType;
    }

    public void setParcelType(String parcelType) {
        this.parcelType = parcelType;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getRateTypeId() {
        return this.rateTypeId;
    }

    public void setRateTypeId(String rateTypeId) {
        this.rateTypeId = rateTypeId;
    }

    public List<SpecialService> getSpecialServices() {
        return this.specialServices;
    }

    public void setSpecialServices(List<SpecialService> specialServices) {
        this.specialServices = specialServices;
    }

    public String getInductionPostalCode() {
        return this.inductionPostalCode;
    }

    public void setInductionPostalCode(String inductionPostalCode) {
        this.inductionPostalCode = inductionPostalCode;
    }

    public ParcelWeight getDimensionalWeight() {
        return this.dimensionalWeight;
    }

    public void setDimensionalWeight(ParcelWeight dimensionalWeight) {
        this.dimensionalWeight = dimensionalWeight;
    }

    public Double getTotalCarrierCharge() {
        return this.totalCarrierCharge;
    }

    public void setTotalCarrierCharge(Double totalCarrierCharge) {
        this.totalCarrierCharge = totalCarrierCharge;
    }

    public Double getTotalTaxAmount() {
        return this.totalTaxAmount;
    }

    public void setTotalTaxAmount(Double totalTaxAmount) {
        this.totalTaxAmount = totalTaxAmount;
    }

     public Double getBaseCharge() {
        return this.baseCharge;
    }

    public void setBaseCharge(Double baseCharge) {
        this.baseCharge = baseCharge;
    }

    public List<Tax> getBaseChargeTaxes() {
        return this.baseChargeTaxes;
    }

    public void setBaseChargeTaxes(List<Tax> baseChargeTaxes) {
        this.baseChargeTaxes = baseChargeTaxes;
    }

    public List<Surcharge> getSurcharges() {
        return this.surcharges;
    }

    public void setSurcharges(List<Surcharge> surcharges) {
        this.surcharges = surcharges;
    }

    public List<Discount> getDiscounts() {
        return this.discounts;
    }

    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }

    public DeliveryCommitment getDeliveryCommitment() {
        return this.deliveryCommitment;
    }

    public void setDeliveryCommitment(DeliveryCommitment deliveryCommitment) {
        this.deliveryCommitment = deliveryCommitment;
    }

   public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Rate {\n");
        sb.append("  carrier: ").append(this.carrier).append("\n");
        sb.append("  parcelType: ").append(this.parcelType).append("\n");
        sb.append("  serviceId: ").append(this.serviceId).append("\n");
        sb.append("  rateTypeId: ").append(this.rateTypeId).append("\n");
        sb.append("  specialServices: ").append(this.specialServices).append("\n");
        sb.append("  inductionPostalCode: ").append(this.inductionPostalCode).append("\n");
        sb.append("  dimensionalWeight: ").append(this.dimensionalWeight).append("\n");
        sb.append("  totalCarrierCharge: ").append(this.totalCarrierCharge).append("\n");
        sb.append("  totalTaxAmount: ").append(this.totalTaxAmount).append("\n");
        sb.append("  baseCharge: ").append(this.baseCharge).append("\n");
        sb.append("  baseChargeTaxes: ").append(this.baseChargeTaxes).append("\n");
        sb.append("  surcharges: ").append(this.surcharges).append("\n");
        sb.append("  discounts: ").append(this.discounts).append("\n");
        sb.append("  deliveryCommitment: ").append(this.deliveryCommitment).append("\n");
        sb.append("  currencyCode: ").append(this.currencyCode).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
