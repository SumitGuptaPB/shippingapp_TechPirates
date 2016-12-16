package com.pb.nex26dv.shippingapp.JsonObjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nex9zka on 12/9/2016.
 */

public class CarrierAccount {
    private List<Parameter> parameters = new ArrayList();

    public CarrierAccount() {
    }

   public List<Parameter> getParameters() {
        return this.parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CarrierAccount {\n");
        sb.append("  parameters: ").append(this.parameters).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
