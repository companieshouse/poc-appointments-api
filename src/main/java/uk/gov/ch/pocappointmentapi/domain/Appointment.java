package uk.gov.ch.pocappointmentapi.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document(collection = "appointments")
public class Appointment {

    @JsonIgnore
    @Id
    private String id;

    @Field(value = "appointment_id")
    private String appointmentId;

    @Field(value = "officer_id")
    private String officerId;

    @Field(value = "company_number")
    private String companyNumber;

    @Field(value = "company_name")
    private String companyName;

    @Field(value = "company_status")
    private String companyStatus;

    @Field(value = "data")
    private AppointmentData data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getOfficerId() {
        return officerId;
    }

    public void setOfficerId(String officerId) {
        this.officerId = officerId;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyStatus() {
        return companyStatus;
    }

    public void setCompanyStatus(String companyStatus) {
        this.companyStatus = companyStatus;
    }

    public AppointmentData getData() {
        return data;
    }

    public void setData(AppointmentData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Appointment [appointmentId=" + appointmentId + ", officerId=" + officerId + ", companyNumber="
                                        + companyNumber + ", companyName=" + companyName + ", forename=" + data.forename
                                        + ", surname=" + data.surname + "]";
    }

}
