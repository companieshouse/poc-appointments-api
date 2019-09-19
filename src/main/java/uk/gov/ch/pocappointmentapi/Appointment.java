package uk.gov.ch.pocappointmentapi;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document(collection="appointments")
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
    
    private Data data;

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

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", officerId=" + officerId + ", companyNumber="
				+ companyNumber + ", companyName=" + companyName + ", forename=" + data.forename + ", surname=" + data.surname
				+ "]";
	}
	
	class Data{
		@Field(value = "title")
	    private String title;
		
	    @Field(value = "forename")
	    private String forename;

	    @Field(value = "surname")
	    private String surname;
	    
	    @Field(value="date_of_birth")
	    private String dateOfBirth;
	    
	    @Field(value="officer_role")
	    private String officerRole;
	    
	    @Field(value="service_address")
	    private ServiceAddress serviceAddress;
	    
	    @Field(value="appointed_on")
	    private String appointedOn;
	    
	    @Field(value="updated_at")	    
	    private String updatedAt;
	    
	    
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

		class ServiceAddress{
			
		    @Field(value="address_line_1")
			String addressLine1;

		    @Field(value="address_line_2")
			String addressLine2;
		    
		    @Field(value="postal_code")
			String postalCode;

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

	}
	


}
