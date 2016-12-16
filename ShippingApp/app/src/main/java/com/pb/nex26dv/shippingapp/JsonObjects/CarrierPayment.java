package com.pb.nex26dv.shippingapp.JsonObjects;

/**
 * Created by nex9zka on 12/9/2016.
 */

public class CarrierPayment {
    private CarrierPayment.TypeOfChargeEnum typeOfCharge = null;
    private CarrierPayment.PartyEnum party = null;
    private String accountNumber = null;
    private String postalCode = null;
    private String countryCode = null;

    public CarrierPayment() {
    }
    public CarrierPayment.TypeOfChargeEnum getTypeOfCharge() {
        return this.typeOfCharge;
    }

    public void setTypeOfCharge(CarrierPayment.TypeOfChargeEnum typeOfCharge) {
        this.typeOfCharge = typeOfCharge;
    }

   public CarrierPayment.PartyEnum getParty() {
        return this.party;
    }

    public void setParty(CarrierPayment.PartyEnum party) {
        this.party = party;
    }

   public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CarrierPayment {\n");
        sb.append("  typeOfCharge: ").append(this.typeOfCharge).append("\n");
        sb.append("  party: ").append(this.party).append("\n");
        sb.append("  accountNumber: ").append(this.accountNumber).append("\n");
        sb.append("  postalCode: ").append(this.postalCode).append("\n");
        sb.append("  countryCode: ").append(this.countryCode).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    public static enum PartyEnum {
        BILL_RECEIVER,
        BILL_SENDER,
        BILL_THIRD_PARTY;

        private PartyEnum() {
        }
    }

    public static enum TypeOfChargeEnum {
        TRANSPORTATION_CHARGES,
        DUTIES_AND_TAXES,
        ALL_CHARGES;

        private TypeOfChargeEnum() {
        }
    }
}
