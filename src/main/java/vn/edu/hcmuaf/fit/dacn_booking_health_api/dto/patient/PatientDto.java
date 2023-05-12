package vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.patient;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.appointment.AppointmentDto;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class PatientDto {
    private Long id;

    private String name;

    private String email;

    private String phone;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "Asia/Ho_Chi_Minh")
    private Date birthDay;

    private Boolean isMale;

    private String address;

    @JsonIgnoreProperties({"patient"})
    private List<AppointmentDto> appointments;
}
