package vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.schedule;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.SuperBuilder;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.DoctorDto;

import java.sql.Time;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class ScheduleDto {

    private Long id;

    private DoctorDto doctor;

    // day of week
    private Integer dayOfWeek;

    // time
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm", locale = "Asia/Ho_Chi_Minh")
    private Time time;
}
