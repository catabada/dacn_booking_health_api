package vn.edu.hcmuaf.fit.dacn_booking_health_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.response.HttpResponse;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.response.HttpResponseSuccess;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.service.DoctorService;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
    private final DoctorService doctorService;

    @Autowired
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<HttpResponse> getDoctors(@PathVariable Long id) {
        return ResponseEntity.ok(HttpResponseSuccess.builder().build());
    }


}
