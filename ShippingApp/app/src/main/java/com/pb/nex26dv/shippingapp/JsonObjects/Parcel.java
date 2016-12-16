package com.pb.nex26dv.shippingapp.JsonObjects;

/**
 * Created by nex9zka on 12/9/2016.
 */

public class Parcel {
    private ParcelWeight weight = null;
    private ParcelDimension dimension = null;

    public Parcel() {
    }

    public ParcelWeight getWeight() {
        return this.weight;
    }

    public void setWeight(ParcelWeight weight) {
        this.weight = weight;
    }

    public ParcelDimension getDimension() {
        return this.dimension;
    }

    public void setDimension(ParcelDimension dimension) {
        this.dimension = dimension;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Parcel {\n");
        sb.append("  weight: ").append(this.weight).append("\n");
        sb.append("  dimension: ").append(this.dimension).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
