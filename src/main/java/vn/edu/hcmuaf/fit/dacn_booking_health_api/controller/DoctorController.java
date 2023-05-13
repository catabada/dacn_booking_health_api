package vn.edu.hcmuaf.fit.dacn_booking_health_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.doctor.DoctorDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.doctor.DoctorRequest;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.doctor.DoctorSearch;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.response.HttpResponse;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.response.HttpResponseSuccess;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.service.doctor.DoctorService;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.service.doctor.DoctorServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
    private final DoctorService doctorService;


    @Autowired
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @RequestMapping("/search")
    public ResponseEntity<HttpResponse> searchDoctor(@RequestBody DoctorSearch search) {
        List<DoctorDto> doctors = doctorService.searchDoctor(search);
        return ResponseEntity.ok(HttpResponseSuccess.success(doctors));
    }

    @GetMapping("/list")
    public ResponseEntity<HttpResponse> getDoctors(@RequestBody DoctorRequest request) {
        List<DoctorDto> doctors = doctorService.getDoctors(request);
        return ResponseEntity.ok(HttpResponseSuccess.success(doctors));
    }

    @GetMapping("/{id}")
    public ResponseEntity<HttpResponse> getDoctors(@PathVariable Long id) {
        DoctorDto doctor = doctorService.getDoctor(id);
        return ResponseEntity.ok(HttpResponseSuccess.success(doctor));
    }


}
