package com.pb.nex26dv.shippingapp.JsonObjects;

/**
 * Created by nex9zka on 12/9/2016.
 */

public class Surcharge {
    private String name = null;
    private Double fee = null;

    public Surcharge() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getFee() {
        return this.fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Surcharge {\n");
        sb.append("  name: ").append(this.name).append("\n");
        sb.append("  fee: ").append(this.fee).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
