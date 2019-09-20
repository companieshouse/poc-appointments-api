package uk.gov.ch.pocappointmentapi;

import org.springframework.data.mongodb.repository.MongoRepository;

import uk.gov.ch.pocappointmentapi.domain.Appointment;

public interface AppointmentRepository extends MongoRepository<Appointment, String> {

    Appointment findByCompanyNumberAndAppointmentId(String companyNumber, String appointmentId);

}
