package vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.doctor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.SuperBuilder;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.schedule.ScheduleDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.specialist.SpecialistDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Specialist;

import java.util.List;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class DoctorDto {
    private Long id;

    private String name;

    private boolean isMale;

    private String image;

    @JsonIgnoreProperties({"doctors"})
    private SpecialistDto specialist;

    @JsonIgnoreProperties({"doctor"})
    private List<ScheduleDto> schedules;
}
