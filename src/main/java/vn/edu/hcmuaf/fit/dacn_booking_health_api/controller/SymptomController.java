package vn.edu.hcmuaf.fit.dacn_booking_health_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Symptom;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.response.HttpResponse;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.response.HttpResponseSuccess;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.service.symptom.SymptomService;

import java.util.List;

@RequestMapping("/symptom")
@RestController
public class SymptomController {
    private final SymptomService symptomService;

    @Autowired
    public SymptomController(SymptomService symptomService) {
        this.symptomService = symptomService;
    }

    @GetMapping("/list")
    public ResponseEntity<HttpResponse> getAllSymptoms() {
        List<Symptom> symptoms = symptomService.findAll();
        return ResponseEntity.ok(HttpResponseSuccess.success(symptoms));
    }
}
