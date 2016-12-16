package com.pb.nex26dv.shippingapp.JsonObjects;

/**
 * Created by nex9zka on 12/9/2016.
 */

public class Page {
    private String contents = null;

    public Page() {
    }

    public String getContents() {
        return this.contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Page {\n");
        sb.append("  contents: ").append(this.contents).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
