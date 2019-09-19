poc-appointments-api
====================

PoC for the potential new Appointments API

The service is a spring-boot application with a RESTful interface. It queries the appointments collection persisted in the CHS MongoDB database collection and returns any results through the REST API

Requirements
------------
In order to run this service you need:
* A Mongodb instance running a database called appointments
* A collection within it called appointments
* Configure spring.data.mongodb.uri in application.properties to point to specific database

## Start appointments API
mvn package && java -jar target/poc-appointment-api-0.0.1-SNAPSHOT.jar

or

mvn spring-boot:run

or

run PocAppointmentApiApplication.java from within an IDE

## End points
/company/{companyNumber}/appointment/{appointmentId}

/healthcheck

## Example Calls

Use [Postman](https://www.getpostman.com)

Running locally:

localhost:8080/healthcheck

localhost:8080/company/00006400/appointment/VZBT2w_EIi3Fx3QFr1xpRPG3oFA

or 

curl http://localhost:8080/company/00006400/appointment/VZBT2w_EIi3Fx3QFr1xpRPG3oFA
