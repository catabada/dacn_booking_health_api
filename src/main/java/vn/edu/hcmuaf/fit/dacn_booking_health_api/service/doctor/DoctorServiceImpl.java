package vn.edu.hcmuaf.fit.dacn_booking_health_api.service.doctor;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.doctor.DoctorDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.doctor.DoctorRequest;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.*;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.repository.doctor.DoctorRepository;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.repository.symptom.SymptomRepository;

import java.util.List;

@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository doctorRepository;
    private final SymptomRepository symptomRepository;
    private final ObjectMapper objectMapper;

    @Autowired
    public DoctorServiceImpl(DoctorRepository doctorRepository, SymptomRepository symptomRepository, ObjectMapper objectMapper) {
        this.doctorRepository = doctorRepository;
        this.symptomRepository = symptomRepository;

        this.objectMapper = objectMapper;
    }

    @Override
    public DoctorDto getDoctor(Long id) {
        Doctor doctor = doctorRepository.findById(id).orElseThrow();
        return objectMapper.convertValue(doctor, DoctorDto.class);
    }

    @Override
    public List<DoctorDto> getDoctors(DoctorRequest request) {
        objectMapper.findAndRegisterModules();
        if (request.getSymptomIds() == null || request.getSymptomIds().isEmpty()) {
            return doctorRepository.findAll().stream()
                    .map(doctor -> objectMapper.convertValue(doctor, DoctorDto.class))
                    .toList();
        }

        List<Symptom> symptoms = symptomRepository.findAllById(request.getSymptomIds());

        List<Specialist> specialists = symptoms.stream()
                .map(Symptom::getSpecialists)
                .flatMap(List::stream)
                .distinct()
                .toList();

        return specialists.stream()
                .map(Specialist::getDoctors)
                .flatMap(List::stream)
                .distinct()
                .map(doctor -> objectMapper.convertValue(doctor, DoctorDto.class))
                .toList();
    }
}