package vn.edu.hcmuaf.fit.dacn_booking_health_api.repository.symptom;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Symptom;

import java.util.List;

@Repository
public interface SymptomRepository extends JpaRepository<Symptom, Long> {
    @Query("SELECT s FROM Symptom s WHERE s.id IN :ids")
    List<Symptom> findAllById(List<Long> ids);
}
