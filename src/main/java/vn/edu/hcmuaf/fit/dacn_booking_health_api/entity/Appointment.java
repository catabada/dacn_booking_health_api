package vn.edu.hcmuaf.fit.dacn_booking_health_api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
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

    private String name;

    private String email;

    private String phone;

    private String address;

    private Boolean isMale;

    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "Asia/Ho_Chi_Minh")
    private Date birthDay;

    private String description;

    @Transient
    @OneToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

    @ManyToMany
    @JoinTable(name = "appointment_symptom",
            joinColumns = @JoinColumn(name = "appointment_id"),
            inverseJoinColumns = @JoinColumn(name = "symptom_id"))
    private List<Symptom> symptoms;

}
