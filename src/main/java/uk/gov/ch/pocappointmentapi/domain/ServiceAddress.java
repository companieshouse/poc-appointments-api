package uk.gov.ch.pocappointmentapi.domain;

import org.springframework.data.mongodb.core.mapping.Field;

public class ServiceAddress {
    @Field(value = "address_line_1")
    public String addressLine1;
    @Field(value = "address_line_2")
    public String addressLine2;
    @Field(value = "postal_code")
    public String postalCode;

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

}