package vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.specialist;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.doctor.DoctorDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.symptom.SymptomDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Doctor;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Symptom;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class SpecialistDto {

    private Long id;

    private String name;

    @JsonIgnoreProperties({"specialist"})
    private List<DoctorDto> doctors;

    @JsonIgnoreProperties({"specialists"})
    private List<SymptomDto> symptoms;
}
