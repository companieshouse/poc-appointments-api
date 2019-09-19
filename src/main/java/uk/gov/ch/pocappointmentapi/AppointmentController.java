package uk.gov.ch.pocappointmentapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {

	@Autowired
	AppointmentRepository repository;

	@GetMapping(value = "/company/{companyNumber}/appointment/{appointmentId}")
	public Appointment appointment(@PathVariable String companyNumber, @PathVariable String appointmentId) {
		return repository.findByCompanyNumberAndAppointmentId(companyNumber, appointmentId);
	}

	@GetMapping(value = "/healthcheck")
	@ResponseStatus(HttpStatus.OK)
	public String healthcheck() {
		return "Appointment API is available";
	}
}
