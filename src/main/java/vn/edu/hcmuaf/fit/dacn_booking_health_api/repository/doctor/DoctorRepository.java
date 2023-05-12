package vn.edu.hcmuaf.fit.dacn_booking_health_api.repository.doctor;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Doctor;

import java.util.List;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Long> {
    List<Doctor> findAll();
    List<Doctor> findAllBySpecialistId(Long... specialistIds);
}
