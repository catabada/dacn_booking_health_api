package vn.edu.hcmuaf.fit.dacn_booking_health_api.repository.doctor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Doctor;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Specialist;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Symptom;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Doctor> findAll();

    @Query("SELECT d FROM Doctor d WHERE d.specialist IN :specialists")
    List<Doctor> findAllBySpecialists(@Param("specialists") List<Specialist> specialists);

    List<Doctor> findAllBySpecialistId(Long... specialistIds);
}
