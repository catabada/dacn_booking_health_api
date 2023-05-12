package vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.schedule;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.SuperBuilder;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.doctor.DoctorDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.appointment.AppointmentDto;

import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class ScheduleDto {

    private Long id;

    private DoctorDto doctor;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm", locale = "Asia/Ho_Chi_Minh")
    private ZonedDateTime appointmentDate;

    private Integer maxPatient;

    private Integer currentPatient;

    private Boolean isFull;

    private Boolean isAvailable;

    private Boolean isExpired;

    @JsonIgnoreProperties({"schedule"})
    private List<AppointmentDto> appointments;
}
