package com.pb.nex26dv.shippingapp.JsonObjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nex9zka on 12/9/2016.
 */

public class SpecialService {
    private String specialServiceId = null;
    private Double fee = null;
    private List<Parameter> inputParameters = new ArrayList();

    public SpecialService() {
    }

    public String getSpecialServiceId() {
        return this.specialServiceId;
    }

    public void setSpecialServiceId(String specialServiceId) {
        this.specialServiceId = specialServiceId;
    }

    public Double getFee() {
        return this.fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public List<Parameter> getInputParameters() {
        return this.inputParameters;
    }

    public void setInputParameters(List<Parameter> inputParameters) {
        this.inputParameters = inputParameters;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpecialService {\n");
        sb.append("  specialServiceId: ").append(this.specialServiceId).append("\n");
        sb.append("  fee: ").append(this.fee).append("\n");
        sb.append("  inputParameters: ").append(this.inputParameters).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
