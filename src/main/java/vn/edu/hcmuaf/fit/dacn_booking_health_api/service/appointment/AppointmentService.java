package vn.edu.hcmuaf.fit.dacn_booking_health_api.service.appointment;

import jakarta.mail.MessagingException;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.appointment.AppointmentDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.exception.BadRequestException;

import java.io.IOException;


public interface AppointmentService {
    AppointmentDto createAppointment(final AppointmentDto appointmentDto) throws BadRequestException, MessagingException, IOException;
    AppointmentDto getAppointment(final Long id) throws BadRequestException;

}
