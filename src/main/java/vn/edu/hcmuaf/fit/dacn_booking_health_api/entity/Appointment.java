package vn.edu.hcmuaf.fit.dacn_booking_health_api.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Appointment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Schedule schedule;

    private String name;

    private String email;

    private String phone;

    private String address;

    private Boolean isMale;

    private Date birthDay;

    private String description; // include symptom


}
