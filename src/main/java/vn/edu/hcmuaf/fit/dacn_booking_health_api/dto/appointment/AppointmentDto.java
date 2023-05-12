package vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.appointment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.patient.PatientDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.schedule.ScheduleDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.symptom.SymptomDto;

import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class AppointmentDto {

    private Long id;

    @JsonIgnoreProperties({"appointments"})
    private PatientDto patient;

    private String description;

    private ZonedDateTime dateCreated;

    @JsonIgnoreProperties({"appointments"})
    private ScheduleDto schedule;

    private List<SymptomDto> symptoms;
}
