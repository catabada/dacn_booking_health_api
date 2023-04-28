package vn.edu.hcmuaf.fit.dacn_booking_health_api.service.appointment;

import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.appointment.AppointmentDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.exception.BadRequestException;


public interface AppointmentService {
    AppointmentDto createAppointment(final AppointmentDto appointmentDto) throws BadRequestException;
    AppointmentDto getAppointment(final Long id) throws BadRequestException;

}
