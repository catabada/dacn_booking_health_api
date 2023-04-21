package vn.edu.hcmuaf.fit.dacn_booking_health_api.repository.symptom;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Symptom;

import java.util.List;

@Repository
public interface SymptomRepository extends JpaRepository<Symptom, Long> {
    List<Symptom> findAll();
}
