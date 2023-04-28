package vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.symptom;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Specialist;

import java.util.List;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class SymptomDto {
    private Long id;

    private String name;

    private List<Specialist> specialists;
}
