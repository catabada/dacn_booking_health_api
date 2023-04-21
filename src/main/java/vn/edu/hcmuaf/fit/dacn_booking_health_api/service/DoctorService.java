package vn.edu.hcmuaf.fit.dacn_booking_health_api.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.DoctorDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Doctor;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.repository.DoctorRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {
    private final DoctorRepository doctorRepository;
    private final ObjectMapper objectMapper;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository, ObjectMapper objectMapper) {
        this.doctorRepository = doctorRepository;
        this.objectMapper = objectMapper;
    }

    public DoctorDto getDoctor(Long id) {
        Doctor doctor = doctorRepository.findById(id).orElseThrow();
        return objectMapper.convertValue(doctor, DoctorDto.class);
    }

    public List<DoctorDto> getDoctors() {
        List<DoctorDto> doctors = new ArrayList<>();
        for (Doctor doctor : doctorRepository.findAll()) {
            doctors.add(objectMapper.convertValue(doctor, DoctorDto.class));
        }
        return doctors;
    }
}
