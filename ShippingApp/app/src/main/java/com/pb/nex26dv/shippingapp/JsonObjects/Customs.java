package com.pb.nex26dv.shippingapp.JsonObjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nex9zka on 12/9/2016.
 */

public class Customs {
    private CustomsInfo customsInfo = null;
    private List<CustomsItem> customsItems = new ArrayList();

    public Customs() {
    }

   public CustomsInfo getCustomsInfo() {
        return this.customsInfo;
    }

    public void setCustomsInfo(CustomsInfo customsInfo) {
        this.customsInfo = customsInfo;
    }

   public List<CustomsItem> getCustomsItems() {
        return this.customsItems;
    }

    public void setCustomsItems(List<CustomsItem> customsItems) {
        this.customsItems = customsItems;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Customs {\n");
        sb.append("  customsInfo: ").append(this.customsInfo).append("\n");
        sb.append("  customsItems: ").append(this.customsItems).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
