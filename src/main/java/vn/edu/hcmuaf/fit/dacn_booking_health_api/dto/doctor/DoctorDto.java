package vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.doctor;

import lombok.*;
import lombok.experimental.SuperBuilder;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Specialist;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class DoctorDto {
    private Long id;

    private String name;

    private boolean isMale;

    private String image;

    private Specialist specialist;
}
