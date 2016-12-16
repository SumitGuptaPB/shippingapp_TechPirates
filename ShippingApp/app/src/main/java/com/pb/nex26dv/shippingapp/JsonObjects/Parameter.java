package com.pb.nex26dv.shippingapp.JsonObjects;

/**
 * Created by nex9zka on 12/9/2016.
 */

public class Parameter {
    private String name = null;
    private String value = null;

    public Parameter() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Parameter {\n");
        sb.append("  name: ").append(this.name).append("\n");
        sb.append("  value: ").append(this.value).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
