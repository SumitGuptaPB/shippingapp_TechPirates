package com.pb.nex26dv.shippingapp.JsonObjects;

/**
 * Created by nex9zka on 12/9/2016.
 */

public class ParcelDimension {
    private Double length = null;
    private Double width = null;
    private Double height = null;
    private ParcelDimension.UnitOfMeasurementEnum unitOfMeasurement = null;
    private Double irregularParcelGirth = null;

    public ParcelDimension() {
    }

    public Double getLength() {
        return this.length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return this.width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public ParcelDimension.UnitOfMeasurementEnum getUnitOfMeasurement() {
        return this.unitOfMeasurement;
    }

    public void setUnitOfMeasurement(ParcelDimension.UnitOfMeasurementEnum unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public Double getIrregularParcelGirth() {
        return this.irregularParcelGirth;
    }

    public void setIrregularParcelGirth(Double irregularParcelGirth) {
        this.irregularParcelGirth = irregularParcelGirth;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParcelDimension {\n");
        sb.append("  length: ").append(this.length).append("\n");
        sb.append("  width: ").append(this.width).append("\n");
        sb.append("  height: ").append(this.height).append("\n");
        sb.append("  unitOfMeasurement: ").append(this.unitOfMeasurement).append("\n");
        sb.append("  irregularParcelGirth: ").append(this.irregularParcelGirth).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    public static enum UnitOfMeasurementEnum {
        CM,
        IN;

        private UnitOfMeasurementEnum() {
        }
    }
}
