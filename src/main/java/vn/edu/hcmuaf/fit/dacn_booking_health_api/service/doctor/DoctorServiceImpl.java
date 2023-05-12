package vn.edu.hcmuaf.fit.dacn_booking_health_api.service.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.doctor.DoctorDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.doctor.DoctorRequest;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.*;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.mapper.DoctorMapper;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.repository.doctor.DoctorRepository;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.repository.symptom.SymptomRepository;

import java.util.List;

@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository doctorRepository;
    private final SymptomRepository symptomRepository;
    private final DoctorMapper doctorMapper;

    @Autowired
    public DoctorServiceImpl(DoctorRepository doctorRepository, SymptomRepository symptomRepository, DoctorMapper doctorMapper) {
        this.doctorRepository = doctorRepository;
        this.symptomRepository = symptomRepository;

        this.doctorMapper = doctorMapper;
    }

    @Override
    public DoctorDto getDoctor(Long id) {
        Doctor doctor = doctorRepository.findById(id).orElseThrow();
        return doctorMapper.toDoctorDto(doctor);
    }

    @Override
    public List<DoctorDto> getDoctors(DoctorRequest request) {
        if (request.getSymptomIds() == null || request.getSymptomIds().isEmpty()) {
            List<Doctor> doctors = doctorRepository.findAll();
            return doctorMapper.toDoctorDtoList(doctors);
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
                .map(doctor -> {
                    DoctorDto doctorDto = doctorMapper.toDoctorDto(doctor);
                    doctorDto.setSpecialist(null);
                    return doctorDto;
                })
                .toList();
    }
}