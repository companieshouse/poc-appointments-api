package uk.gov.ch.pocappointmentapi;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AppointmentRepository extends MongoRepository<Appointment, String> {
	
	Appointment findByCompanyNumberAndAppointmentId(String companyNumber, String appointmentId);

}
