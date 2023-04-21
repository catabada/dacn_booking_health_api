package vn.edu.hcmuaf.fit.dacn_booking_health_api.repository.doctor;

import org.springframework.data.repository.NoRepositoryBean;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Doctor;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.repository.IRepository;

@NoRepositoryBean
public interface DoctorRepository extends IRepository<Doctor> {

}
