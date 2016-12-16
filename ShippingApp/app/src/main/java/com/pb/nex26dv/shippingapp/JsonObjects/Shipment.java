package com.pb.nex26dv.shippingapp.JsonObjects;

/**
 * Created by nex9zka on 12/9/2016.
 */

import java.util.ArrayList;
import java.util.List;

public class Shipment {
    private Address fromAddress = null;
    private Address toAddress = null;
    private Address altReturnAddress = null;
    private Address soldToAddress = null;
    private Parcel parcel = null;
    private List<Rate> rates = new ArrayList();
    private Customs customs = null;
    private String shipmentId = null;
    private String parcelTrackingNumber = null;
    private List<Document> documents = new ArrayList();
    private List<CarrierAccount> carrierAccounts = new ArrayList();
    private List<CarrierPayment> carrierPayments = new ArrayList();
    private List<Parameter> shipmentOptions = new ArrayList();

    public Shipment() {
    }

    public Address getFromAddress() {
        return this.fromAddress;
    }

    public void setFromAddress(Address fromAddress) {
        this.fromAddress = fromAddress;
    }

    public Address getToAddress() {
        return this.toAddress;
    }

    public void setToAddress(Address toAddress) {
        this.toAddress = toAddress;
    }

    public Address getAltReturnAddress() {
        return this.altReturnAddress;
    }

    public void setAltReturnAddress(Address altReturnAddress) {
        this.altReturnAddress = altReturnAddress;
    }

    public Address getSoldToAddress() {
        return this.soldToAddress;
    }

    public void setSoldToAddress(Address soldToAddress) {
        this.soldToAddress = soldToAddress;
    }

    public Parcel getParcel() {
        return this.parcel;
    }

    public void setParcel(Parcel parcel) {
        this.parcel = parcel;
    }

    public List<Rate> getRates() {
        return this.rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    public Customs getCustoms() {
        return this.customs;
    }

    public void setCustoms(Customs customs) {
        this.customs = customs;
    }

    public String getShipmentId() {
        return this.shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getParcelTrackingNumber() {
        return this.parcelTrackingNumber;
    }

    public void setParcelTrackingNumber(String parcelTrackingNumber) {
        this.parcelTrackingNumber = parcelTrackingNumber;
    }

    public List<Document> getDocuments() {
        return this.documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public List<CarrierAccount> getCarrierAccounts() {
        return this.carrierAccounts;
    }

    public void setCarrierAccounts(List<CarrierAccount> carrierAccounts) {
        this.carrierAccounts = carrierAccounts;
    }

    public List<CarrierPayment> getCarrierPayments() {
        return this.carrierPayments;
    }

    public void setCarrierPayments(List<CarrierPayment> carrierPayments) {
        this.carrierPayments = carrierPayments;
    }

    public List<Parameter> getShipmentOptions() {
        return this.shipmentOptions;
    }

    public void setShipmentOptions(List<Parameter> shipmentOptions) {
        this.shipmentOptions = shipmentOptions;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Shipment {\n");
        sb.append("  fromAddress: ").append(this.fromAddress).append("\n");
        sb.append("  toAddress: ").append(this.toAddress).append("\n");
        sb.append("  altReturnAddress: ").append(this.altReturnAddress).append("\n");
        sb.append("  soldToAddress: ").append(this.soldToAddress).append("\n");
        sb.append("  parcel: ").append(this.parcel).append("\n");
        sb.append("  rates: ").append(this.rates).append("\n");
        sb.append("  customs: ").append(this.customs).append("\n");
        sb.append("  shipmentId: ").append(this.shipmentId).append("\n");
        sb.append("  parcelTrackingNumber: ").append(this.parcelTrackingNumber).append("\n");
        sb.append("  documents: ").append(this.documents).append("\n");
        sb.append("  carrierAccounts: ").append(this.carrierAccounts).append("\n");
        sb.append("  carrierPayments: ").append(this.carrierPayments).append("\n");
        sb.append("  shipmentOptions: ").append(this.shipmentOptions).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
