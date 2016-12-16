package com.pb.nex26dv.shippingapp.JsonObjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nex9zka on 12/9/2016.
 */

public class Address {
    private List<String> addressLines = new ArrayList();
    private String cityTown = null;
    private String stateProvince = null;
    private String postalCode = null;
    private String countryCode = null;
    private String company = null;
    private String name = null;
    private String phone = null;
    private String email = null;
    private Boolean residential = null;
    private String taxId = null;
    private Address.StatusEnum status = null;

    public Address() {
    }

    public List<String> getAddressLines() {
        return this.addressLines;
    }

    public void setAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
    }

    public String getCityTown() {
        return this.cityTown;
    }

    public void setCityTown(String cityTown) {
        this.cityTown = cityTown;
    }

    public String getStateProvince() {
        return this.stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

   public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getResidential() {
        return this.residential;
    }

    public void setResidential(Boolean residential) {
        this.residential = residential;
    }

    public String getTaxId() {
        return this.taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public Address.StatusEnum getStatus() {
        return this.status;
    }

    public void setStatus(Address.StatusEnum status) {
        this.status = status;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Address {\n");
        sb.append("  addressLines: ").append(this.addressLines).append("\n");
        sb.append("  cityTown: ").append(this.cityTown).append("\n");
        sb.append("  stateProvince: ").append(this.stateProvince).append("\n");
        sb.append("  postalCode: ").append(this.postalCode).append("\n");
        sb.append("  countryCode: ").append(this.countryCode).append("\n");
        sb.append("  company: ").append(this.company).append("\n");
        sb.append("  name: ").append(this.name).append("\n");
        sb.append("  phone: ").append(this.phone).append("\n");
        sb.append("  email: ").append(this.email).append("\n");
        sb.append("  residential: ").append(this.residential).append("\n");
        sb.append("  taxId: ").append(this.taxId).append("\n");
        sb.append("  status: ").append(this.status).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    public static enum StatusEnum {
        PARSED,
        VALIDATED_CHANGED,
        VALIDATED_AND_NOT_CHANGED,
        NOT_CHANGED;

        private StatusEnum() {
        }
    }
}
