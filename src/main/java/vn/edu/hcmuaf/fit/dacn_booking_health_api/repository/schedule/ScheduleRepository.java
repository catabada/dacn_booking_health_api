package vn.edu.hcmuaf.fit.dacn_booking_health_api.repository.schedule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Long, Schedule> {
}
