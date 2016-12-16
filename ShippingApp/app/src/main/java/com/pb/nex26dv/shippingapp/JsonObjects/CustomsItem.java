package com.pb.nex26dv.shippingapp.JsonObjects;

/**
 * Created by nex9zka on 12/9/2016.
 */

public class CustomsItem {
    private String description = null;
    private Integer quantity = null;
    private String quantityUOM = null;
    private Double unitPrice = null;
    private ParcelWeight unitWeight = null;
    private String hSTariffCode = null;
    private String originStateProvince = null;
    private String originCountryCode = null;

    public CustomsItem() {
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getQuantityUOM() {
        return this.quantityUOM;
    }

    public void setQuantityUOM(String quantityUOM) {
        this.quantityUOM = quantityUOM;
    }

    public Double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public ParcelWeight getUnitWeight() {
        return this.unitWeight;
    }

    public void setUnitWeight(ParcelWeight unitWeight) {
        this.unitWeight = unitWeight;
    }

    public String getHSTariffCode() {
        return this.hSTariffCode;
    }

    public void setHSTariffCode(String hSTariffCode) {
        this.hSTariffCode = hSTariffCode;
    }

    public String getOriginStateProvince() {
        return this.originStateProvince;
    }

    public void setOriginStateProvince(String originStateProvince) {
        this.originStateProvince = originStateProvince;
    }

    public String getOriginCountryCode() {
        return this.originCountryCode;
    }

    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomsItem {\n");
        sb.append("  description: ").append(this.description).append("\n");
        sb.append("  quantity: ").append(this.quantity).append("\n");
        sb.append("  quantityUOM: ").append(this.quantityUOM).append("\n");
        sb.append("  unitPrice: ").append(this.unitPrice).append("\n");
        sb.append("  unitWeight: ").append(this.unitWeight).append("\n");
        sb.append("  hSTariffCode: ").append(this.hSTariffCode).append("\n");
        sb.append("  originStateProvince: ").append(this.originStateProvince).append("\n");
        sb.append("  originCountryCode: ").append(this.originCountryCode).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
