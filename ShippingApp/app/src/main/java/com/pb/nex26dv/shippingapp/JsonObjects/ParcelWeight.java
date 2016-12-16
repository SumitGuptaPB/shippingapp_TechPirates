package com.pb.nex26dv.shippingapp.JsonObjects;

/**
 * Created by nex9zka on 12/9/2016.
 */

public class ParcelWeight {
    private Double weight = null;
    private ParcelWeight.UnitOfMeasurementEnum unitOfMeasurement = null;

    public ParcelWeight() {
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public ParcelWeight.UnitOfMeasurementEnum getUnitOfMeasurement() {
        return this.unitOfMeasurement;
    }

    public void setUnitOfMeasurement(ParcelWeight.UnitOfMeasurementEnum unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParcelWeight {\n");
        sb.append("  weight: ").append(this.weight).append("\n");
        sb.append("  unitOfMeasurement: ").append(this.unitOfMeasurement).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    public static enum UnitOfMeasurementEnum {
        GM,
        OZ;

        private UnitOfMeasurementEnum() {
        }
    }
}
