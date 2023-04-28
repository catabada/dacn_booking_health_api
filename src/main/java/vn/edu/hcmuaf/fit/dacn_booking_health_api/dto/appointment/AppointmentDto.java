package vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.appointment;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.specialist.SpecialistDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.symptom.SymptomDto;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class AppointmentDto {
    private String email;
    private String phone;
    private String name;
    private String address;
    private Date birthDay;
    private Boolean isMale;
    private String description;
    private SpecialistDto specialist;
    private List<SymptomDto> symptoms;
}
