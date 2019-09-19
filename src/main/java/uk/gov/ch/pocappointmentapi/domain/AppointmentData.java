package uk.gov.ch.pocappointmentapi.domain;

import org.springframework.data.mongodb.core.mapping.Field;

public class AppointmentData {
    @Field(value = "title")
    public String title;

    @Field(value = "forename")
    public String forename;

    @Field(value = "surname")
    public String surname;

    @Field(value = "date_of_birth")
    public String dateOfBirth;

    @Field(value = "officer_role")
    public String officerRole;

    @Field(value = "service_address")
    public ServiceAddress serviceAddress;

    @Field(value = "appointed_on")
    public String appointedOn;

    @Field(value = "updated_at")
    public String updatedAt;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getOfficerRole() {
        return officerRole;
    }

    public void setOfficerRole(String officerRole) {
        this.officerRole = officerRole;
    }

    public ServiceAddress getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(ServiceAddress serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    public String getAppointedOn() {
        return appointedOn;
    }

    public void setAppointedOn(String appointedOn) {
        this.appointedOn = appointedOn;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}