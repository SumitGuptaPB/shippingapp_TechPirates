package com.pb.nex26dv.shippingapp.JsonObjects;

/**
 * Created by nex9zka on 12/9/2016.
 */

public class CustomsInfo {
    private CustomsInfo.ReasonForExportEnum reasonForExport = null;
    private String reasonForExportExplanation = null;
    private String comments = null;
    private String invoiceNumber = null;
    private String termsOfSale = null;
    private String importerCustomsReference = null;
    private String insuredNumber = null;
    private Double insuredAmount = null;
    private Double sdrValue = null;
    private String EELPFC = null;
    private String fromCustomsReference = null;
    private Double customsDeclaredValue = null;
    private String currencyCode = null;
    private String declarationStatement = null;
    private String licenseNumber = null;
    private String certificateNumber = null;

    public CustomsInfo() {
    }

    public CustomsInfo.ReasonForExportEnum getReasonForExport() {
        return this.reasonForExport;
    }

    public void setReasonForExport(CustomsInfo.ReasonForExportEnum reasonForExport) {
        this.reasonForExport = reasonForExport;
    }

    public String getReasonForExportExplanation() {
        return this.reasonForExportExplanation;
    }

    public void setReasonForExportExplanation(String reasonForExportExplanation) {
        this.reasonForExportExplanation = reasonForExportExplanation;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getTermsOfSale() {
        return this.termsOfSale;
    }

    public void setTermsOfSale(String termsOfSale) {
        this.termsOfSale = termsOfSale;
    }

    public String getImporterCustomsReference() {
        return this.importerCustomsReference;
    }

    public void setImporterCustomsReference(String importerCustomsReference) {
        this.importerCustomsReference = importerCustomsReference;
    }

    public String getInsuredNumber() {
        return this.insuredNumber;
    }

    public void setInsuredNumber(String insuredNumber) {
        this.insuredNumber = insuredNumber;
    }

    public Double getInsuredAmount() {
        return this.insuredAmount;
    }

    public void setInsuredAmount(Double insuredAmount) {
        this.insuredAmount = insuredAmount;
    }

    public Double getSdrValue() {
        return this.sdrValue;
    }

    public void setSdrValue(Double sdrValue) {
        this.sdrValue = sdrValue;
    }

    public String getEELPFC() {
        return this.EELPFC;
    }

    public void setEELPFC(String EELPFC) {
        this.EELPFC = EELPFC;
    }

    public String getFromCustomsReference() {
        return this.fromCustomsReference;
    }

    public void setFromCustomsReference(String fromCustomsReference) {
        this.fromCustomsReference = fromCustomsReference;
    }

    public Double getCustomsDeclaredValue() {
        return this.customsDeclaredValue;
    }

    public void setCustomsDeclaredValue(Double customsDeclaredValue) {
        this.customsDeclaredValue = customsDeclaredValue;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getDeclarationStatement() {
        return this.declarationStatement;
    }

    public void setDeclarationStatement(String declarationStatement) {
        this.declarationStatement = declarationStatement;
    }

    public String getLicenseNumber() {
        return this.licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getCertificateNumber() {
        return this.certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomsInfo {\n");
        sb.append("  reasonForExport: ").append(this.reasonForExport).append("\n");
        sb.append("  reasonForExportExplanation: ").append(this.reasonForExportExplanation).append("\n");
        sb.append("  comments: ").append(this.comments).append("\n");
        sb.append("  invoiceNumber: ").append(this.invoiceNumber).append("\n");
        sb.append("  termsOfSale: ").append(this.termsOfSale).append("\n");
        sb.append("  importerCustomsReference: ").append(this.importerCustomsReference).append("\n");
        sb.append("  insuredNumber: ").append(this.insuredNumber).append("\n");
        sb.append("  insuredAmount: ").append(this.insuredAmount).append("\n");
        sb.append("  sdrValue: ").append(this.sdrValue).append("\n");
        sb.append("  EELPFC: ").append(this.EELPFC).append("\n");
        sb.append("  fromCustomsReference: ").append(this.fromCustomsReference).append("\n");
        sb.append("  customsDeclaredValue: ").append(this.customsDeclaredValue).append("\n");
        sb.append("  currencyCode: ").append(this.currencyCode).append("\n");
        sb.append("  declarationStatement: ").append(this.declarationStatement).append("\n");
        sb.append("  licenseNumber: ").append(this.licenseNumber).append("\n");
        sb.append("  certificateNumber: ").append(this.certificateNumber).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    public static enum ReasonForExportEnum {
        GIFT,
        COMMERCIAL_SAMPLE,
        MERCHANDISE,
        DOCUMENTS,
        RETURNED_GOODS,
        OTHER;

        private ReasonForExportEnum() {
        }
    }
}
