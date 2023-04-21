package vn.edu.hcmuaf.fit.dacn_booking_health_api.service.symptom;

import org.springframework.beans.factory.annotation.Autowired;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Symptom;
import org.springframework.stereotype.Service;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.repository.symptom.SymptomRepository;

import java.util.List;

@Service
public class SymptomServiceIml implements SymptomService {

    private final SymptomRepository symptomRepository;

    @Autowired
    public SymptomServiceIml(SymptomRepository symptomRepository) {
        this.symptomRepository = symptomRepository;
    }

    @Override
    public List<Symptom> findAll() {
        return symptomRepository.findAll();
    }
}
