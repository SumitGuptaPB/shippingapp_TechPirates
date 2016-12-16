package com.pb.nex26dv.shippingapp.JsonObjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nex9zka on 12/9/2016.
 */

public class Document {
    private Document.TypeEnum type = null;
    private Document.SizeEnum size = null;
    private Document.FileFormatEnum fileFormat = null;
    private Document.ContentTypeEnum contentType = null;
    private Document.PrintDialogOptionEnum printDialogOption = null;
    private String contents = null;
    private List<Page> pages = new ArrayList();

    public Document() {
    }

    public Document.TypeEnum getType() {
        return this.type;
    }

    public void setType(Document.TypeEnum type) {
        this.type = type;
    }

    public Document.SizeEnum getSize() {
        return this.size;
    }

    public void setSize(Document.SizeEnum size) {
        this.size = size;
    }

   public Document.FileFormatEnum getFileFormat() {
        return this.fileFormat;
    }

    public void setFileFormat(Document.FileFormatEnum fileFormat) {
        this.fileFormat = fileFormat;
    }

   public Document.ContentTypeEnum getContentType() {
        return this.contentType;
    }

    public void setContentType(Document.ContentTypeEnum contentType) {
        this.contentType = contentType;
    }

    public Document.PrintDialogOptionEnum getPrintDialogOption() {
        return this.printDialogOption;
    }

    public void setPrintDialogOption(Document.PrintDialogOptionEnum printDialogOption) {
        this.printDialogOption = printDialogOption;
    }

    public String getContents() {
        return this.contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

     public List<Page> getPages() {
        return this.pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Document {\n");
        sb.append("  type: ").append(this.type).append("\n");
        sb.append("  size: ").append(this.size).append("\n");
        sb.append("  fileFormat: ").append(this.fileFormat).append("\n");
        sb.append("  contentType: ").append(this.contentType).append("\n");
        sb.append("  printDialogOption: ").append(this.printDialogOption).append("\n");
        sb.append("  contents: ").append(this.contents).append("\n");
        sb.append("  pages: ").append(this.pages).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    public static enum PrintDialogOptionEnum {
        NO_PRINT_DIALOG,
        EMBED_PRINT_DIALOG;

        private PrintDialogOptionEnum() {
        }
    }

    public static enum ContentTypeEnum {
        URL,
        BASE64;

        private ContentTypeEnum() {
        }
    }

    public static enum FileFormatEnum {
        PDF,
        PNG,
        ZPL2;

        private FileFormatEnum() {
        }
    }

    public static enum SizeEnum {
        DOC_2X7,
        DOC_4X6,
        DOC_8X11;

        private SizeEnum() {
        }
    }

    public static enum TypeEnum {
        SHIPPING_LABEL,
        MANIFEST;

        private TypeEnum() {
        }
    }
}
