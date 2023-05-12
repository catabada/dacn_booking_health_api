package vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.doctor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.symptom.SymptomDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Symptom;

import java.util.List;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class DoctorSearch {
    List<SymptomDto> symptoms;
}
