package vn.edu.hcmuaf.fit.dacn_booking_health_api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.sql.Time;
import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Schedule implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Doctor doctor;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm", locale = "Asia/Ho_Chi_Minh")
    private ZonedDateTime appointmentDate;

    private Integer maxPatient;

    @Column(columnDefinition = "integer default 0")
    private Integer currentPatient;

    @Column(columnDefinition = "boolean default false")
    private Boolean isFull;

    @Column(columnDefinition = "boolean default true")
    private Boolean isAvailable;

    @Column(columnDefinition = "boolean default false")
    private Boolean isExpired;

    @OneToMany(mappedBy = "schedule", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Appointment> appointments;
}
