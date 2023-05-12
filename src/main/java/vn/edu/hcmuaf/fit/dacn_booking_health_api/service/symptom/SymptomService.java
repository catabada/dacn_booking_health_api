package vn.edu.hcmuaf.fit.dacn_booking_health_api.service.symptom;

import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.symptom.SymptomDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Symptom;

import java.util.List;

public interface SymptomService {
    List<SymptomDto> findAll();
}
