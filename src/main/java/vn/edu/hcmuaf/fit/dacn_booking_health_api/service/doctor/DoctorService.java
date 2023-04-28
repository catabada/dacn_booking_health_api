package vn.edu.hcmuaf.fit.dacn_booking_health_api.service.doctor;

import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.DoctorDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.DoctorRequest;

import java.util.List;

public interface DoctorService {
    List<DoctorDto> getDoctors(DoctorRequest request);
    DoctorDto getDoctor(Long id);
}