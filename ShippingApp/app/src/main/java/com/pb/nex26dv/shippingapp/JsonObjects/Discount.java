package com.pb.nex26dv.shippingapp.JsonObjects;

/**
 * Created by nex9zka on 12/9/2016.
 */

public class Discount {
    private String name = null;
    private Double discountAmount = null;

    public Discount() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public Double getDiscountAmount() {
        return this.discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Discount {\n");
        sb.append("  name: ").append(this.name).append("\n");
        sb.append("  discountAmount: ").append(this.discountAmount).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
