package vn.edu.hcmuaf.fit.dacn_booking_health_api.repository.specialist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Specialist;

@Repository
public interface SpecialistRepository extends JpaRepository<Specialist, Long> {
}
