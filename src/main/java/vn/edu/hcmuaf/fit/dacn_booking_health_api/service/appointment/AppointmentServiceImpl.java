package vn.edu.hcmuaf.fit.dacn_booking_health_api.service.appointment;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.appointment.AppointmentDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Appointment;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.exception.BadRequestException;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.repository.appointment.AppointmentRepository;

@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final ObjectMapper objectMapper;

    @Autowired
    public AppointmentServiceImpl(AppointmentRepository appointmentRepository, ObjectMapper objectMapper) {
        this.appointmentRepository = appointmentRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public AppointmentDto createAppointment(AppointmentDto appointmentDto) throws BadRequestException {
        Appointment appointment = objectMapper.convertValue(appointmentDto, Appointment.class);

        if(ObjectUtils.isEmpty(appointmentRepository.save(appointment))) throw new BadRequestException("Can't create appointment");
        return objectMapper.convertValue(appointmentDto, AppointmentDto.class);
    }

    @Override
    public AppointmentDto getAppointment(Long id) throws BadRequestException {
        AppointmentDto appointmentDto = objectMapper.convertValue(appointmentRepository.findById(id), AppointmentDto.class);
        if(ObjectUtils.isEmpty(appointmentDto)) throw new BadRequestException("Không tìm thấy cuộc hẹn");
        return appointmentDto;
    }
}
