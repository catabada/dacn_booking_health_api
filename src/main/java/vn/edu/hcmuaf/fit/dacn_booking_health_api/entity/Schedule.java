package vn.edu.hcmuaf.fit.dacn_booking_health_api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.sql.Time;
import java.time.ZonedDateTime;

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

    // day of week
    private Integer dayOfWeek;

    // time
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm", locale = "Asia/Ho_Chi_Minh")
    private Time time;
}
