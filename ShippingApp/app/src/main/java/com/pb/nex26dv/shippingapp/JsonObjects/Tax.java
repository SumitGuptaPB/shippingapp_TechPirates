package com.pb.nex26dv.shippingapp.JsonObjects;

/**
 * Created by nex9zka on 12/9/2016.
 */

public class Tax {
    private String name = null;
    private Double taxAmount = null;
    private Double taxRate = null;
    private String displayName = null;

    public Tax() {
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Double getTaxAmount() {
        return this.taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }
 public Double getTaxRate() {
        return this.taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tax {\n");
        sb.append("  name: ").append(this.name).append("\n");
        sb.append("  taxAmount: ").append(this.taxAmount).append("\n");
        sb.append("  taxRate: ").append(this.taxRate).append("\n");
        sb.append("  displayName: ").append(this.displayName).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
