package vn.edu.hcmuaf.fit.dacn_booking_health_api.service.symptom;

import org.springframework.beans.factory.annotation.Autowired;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.symptom.SymptomDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Symptom;
import org.springframework.stereotype.Service;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.mapper.SymptomMapper;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.repository.symptom.SymptomRepository;

import java.util.List;

@Service
public class SymptomServiceIml implements SymptomService {

    private final SymptomRepository symptomRepository;
    private final SymptomMapper symptomMapper;

    @Autowired
    public SymptomServiceIml(SymptomRepository symptomRepository, SymptomMapper symptomMapper) {
        this.symptomRepository = symptomRepository;
        this.symptomMapper = symptomMapper;
    }

    @Override
    public List<SymptomDto> findAll() {
        List<Symptom> symptoms = symptomRepository.findAll();
        System.out.println(symptoms);
        return symptomMapper.toSymptomDtoList(symptoms);
    }
}
