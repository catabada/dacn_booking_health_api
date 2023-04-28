package vn.edu.hcmuaf.fit.dacn_booking_health_api.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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

    @OneToMany(mappedBy = "appointment")
    private List<Symptom> symptoms;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "specialist_id")
    private Specialist specialist;

}
