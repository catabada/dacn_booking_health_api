package vn.edu.hcmuaf.fit.dacn_booking_health_api.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Symptom implements Serializable {
    private Long id;
    private String name;

}
