package vn.edu.hcmuaf.fit.dacn_booking_health_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.appointment.AppointmentDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.appointment.AppointmentRequest;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.exception.BadRequestException;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.response.HttpResponse;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.response.HttpResponseSuccess;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.service.appointment.AppointmentService;

@Controller
@RequestMapping("/appointment")
public class AppointmentController {
    private final AppointmentService appointmentService;

    @Autowired
    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping("/create")
    public ResponseEntity<HttpResponse> createAppointment(@RequestBody AppointmentRequest appointmentRequest) throws BadRequestException {
        AppointmentDto appointmentDto = appointmentService.createAppointment(appointmentRequest);
        return ResponseEntity.ok(HttpResponseSuccess.success(appointmentDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<HttpResponse> getAppointment(@PathVariable Long id) throws BadRequestException {
        AppointmentDto appointmentDto = appointmentService.getAppointment(id);
        return ResponseEntity.ok(HttpResponseSuccess.success(appointmentDto));
    }

}
