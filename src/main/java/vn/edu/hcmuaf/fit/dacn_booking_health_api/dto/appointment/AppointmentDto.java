package vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.appointment;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.schedule.ScheduleDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.symptom.SymptomDto;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class AppointmentDto {

    private Long id;

    private String name;

    private String email;

    private String phone;

    private String address;

    private Boolean isMale;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "Asia/Ho_Chi_Minh")
    private Date birthDay;

    private String description;

    private ScheduleDto schedule;

    private List<SymptomDto> symptoms;
}
