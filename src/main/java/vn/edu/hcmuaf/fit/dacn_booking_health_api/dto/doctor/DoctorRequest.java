package vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.doctor;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class DoctorRequest {
    List<Long> symptomIds;
}
