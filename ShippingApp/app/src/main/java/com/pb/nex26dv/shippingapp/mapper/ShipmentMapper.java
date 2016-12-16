package com.pb.nex26dv.shippingapp.mapper;

import com.google.gson.Gson;
import com.pb.nex26dv.shippingapp.JsonObjects.Address;
import com.pb.nex26dv.shippingapp.JsonObjects.CarrierAccount;
import com.pb.nex26dv.shippingapp.JsonObjects.CarrierPayment;
import com.pb.nex26dv.shippingapp.JsonObjects.Document;
import com.pb.nex26dv.shippingapp.JsonObjects.Parameter;
import com.pb.nex26dv.shippingapp.JsonObjects.Parcel;
import com.pb.nex26dv.shippingapp.JsonObjects.ParcelDimension;
import com.pb.nex26dv.shippingapp.JsonObjects.ParcelWeight;
import com.pb.nex26dv.shippingapp.JsonObjects.Rate;
import com.pb.nex26dv.shippingapp.JsonObjects.Shipment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NEX9ZKA on 12/14/2016.
 */

public class ShipmentMapper {
    private Shipment shipment;

    public Shipment getShipment() {
        return shipment;
    }

    public ShipmentMapper() {
        this.shipment = new Shipment();
    }

    public Address setAddress(String email, String name,String stateProvince, String cityTown, String company, String countryCode, String phone, String postalCode, String taxId, String addresslines) {
        Address address = new Address();
        address.setName(name);
        address.setStateProvince(stateProvince);
        address.setCityTown(cityTown);
        address.setEmail(email);
        address.setCompany(company);
        address.setCountryCode(countryCode);
        address.setPhone(phone);
        address.setPostalCode(postalCode);
        address.setStatus(Address.StatusEnum.PARSED);
        address.setResidential(Boolean.FALSE);
        address.setTaxId(taxId);
        address.getAddressLines().add(addresslines);
        return address;
       /* address.getAddressLines().add(addresslines[1]);
        address.getAddressLines().add(addresslines[2]);*/
    }

    public Parcel mapParcel(double height, double irregularParcelGirth, double length, double width, double weight) {
        Parcel parcel = new Parcel();
        ParcelDimension parcelDimension = new ParcelDimension();
        ParcelWeight parcelWeight = new ParcelWeight();

        parcelWeight.setUnitOfMeasurement(ParcelWeight.UnitOfMeasurementEnum.OZ);
        parcelWeight.setWeight(weight);
        parcel.setWeight(parcelWeight);

        parcelDimension.setHeight(height);
        parcelDimension.setIrregularParcelGirth(irregularParcelGirth);
        parcelDimension.setLength(length);
        parcelDimension.setWidth(width);
        parcelDimension.setUnitOfMeasurement(ParcelDimension.UnitOfMeasurementEnum.IN);
        parcel.setDimension(parcelDimension);

        return parcel;
    }

    public List<Rate> mapRates(String carrier, String serviceId, String parceltype, String rateTypeId, String inductionPostalCode) {
        List<Rate> rateList = new ArrayList<>();
        Rate rate = new Rate();
        rate.setCarrier(carrier);
        rate.setServiceId(serviceId);
        rate.setParcelType(parceltype);
        rate.setRateTypeId(rateTypeId);
        rate.setInductionPostalCode(inductionPostalCode);

        rateList.add(rate);

        return rateList;
    }

    public List<Document> mapDocuments() {
        List<Document> documentList = new ArrayList<>();
        Document document = new Document();
        document.setType(Document.TypeEnum.SHIPPING_LABEL);
        document.setPrintDialogOption(Document.PrintDialogOptionEnum.EMBED_PRINT_DIALOG);
        document.setSize(Document.SizeEnum.DOC_4X6);
        document.setFileFormat(Document.FileFormatEnum.PDF);
        document.setContentType(Document.ContentTypeEnum.URL);

        documentList.add(document);
        return documentList;
    }

    public List<CarrierAccount> mapCarrierAccounts() {
        List<CarrierAccount> carrierAccounts = new ArrayList<>();
        CarrierAccount carrierAccount = new CarrierAccount();
        Parameter parameter1 = new Parameter();
        Parameter parameter2 = new Parameter();
        Parameter parameter3 = new Parameter();
        Parameter parameter4 = new Parameter();

        parameter1.setName("USER_ID");
        parameter1.setValue("lMrZ57XJW16i9DBG");
        ;
        parameter2.setName("PASSWORD");
        parameter2.setValue("vhoRKGECug9jDSy4j4JE2R6Z9");

        parameter3.setName("METER_NUMBER");
        parameter3.setValue("118728095");

        parameter4.setName("ACCOUNT_NUMBER");
        parameter4.setValue("602633446");

        carrierAccount.getParameters().add(parameter1);
        carrierAccount.getParameters().add(parameter2);
        carrierAccount.getParameters().add(parameter3);
        carrierAccount.getParameters().add(parameter4);

        carrierAccounts.add(carrierAccount);
        return carrierAccounts;
    }

    public List<CarrierPayment> mapCarrierPayment() {
        List<CarrierPayment> carrierPaymentList = new ArrayList<>();
        CarrierPayment carrierPayment = new CarrierPayment();
        carrierPayment.setAccountNumber("602633446");
        carrierPayment.setParty(CarrierPayment.PartyEnum.BILL_SENDER);
        carrierPayment.setTypeOfCharge(CarrierPayment.TypeOfChargeEnum.TRANSPORTATION_CHARGES);
        carrierPayment.setPostalCode("14609");
        carrierPayment.setCountryCode("US");

        carrierPaymentList.add(carrierPayment);
        return carrierPaymentList;
    }

    public List<Parameter> mapShipmentOption(String futureShipmentDate) {
        List<Parameter> parameterList = new ArrayList<>();
        Parameter parameter1 = new Parameter();
        Parameter parameter2 = new Parameter();
        Parameter parameter3 = new Parameter();
        Parameter parameter4 = new Parameter();
        Parameter parameter5 = new Parameter();

        parameter1.setName("PRINT_CUSTOM_MESSAGE_1");
        parameter1.setValue("custom message XXXXXXx");
        parameter2.setName("PRINT_DEPARTMENT");
        parameter2.setValue("abc");
        parameter3.setName("PRINT_INVOICE_NUMBER");
        parameter3.setValue("invoice XXXXXXx");
        parameter4.setName("FUTURE_SHIPMENT_DATE");
        parameter4.setValue(futureShipmentDate);
        parameter5.setName("PRINT_PO_NUMBER");
        parameter5.setValue("PO XXXXXXx");

        parameterList.add(parameter1);
        parameterList.add(parameter2);
        parameterList.add(parameter3);
        parameterList.add(parameter4);
        parameterList.add(parameter5);

        return parameterList;
    }

    public String convertShipmentToJson(Shipment shipment) {
        Gson gson = new Gson();
        String JSONString = gson.toJson(shipment);
        return JSONString;
    }

}
