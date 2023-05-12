package vn.edu.hcmuaf.fit.dacn_booking_health_api.service.appointment;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.appointment.AppointmentDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.*;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.exception.BadRequestException;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.repository.appointment.AppointmentRepository;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.repository.schedule.ScheduleRepository;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.repository.symptom.SymptomRepository;

@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final ScheduleRepository scheduleRepository;
    private final SymptomRepository symptomRepository;
    private final ObjectMapper objectMapper;

    @Autowired
    public AppointmentServiceImpl(AppointmentRepository appointmentRepository, ScheduleRepository scheduleRepository,
            SymptomRepository symptomRepository, ObjectMapper objectMapper) {
        this.appointmentRepository = appointmentRepository;
        this.scheduleRepository = scheduleRepository;
        this.symptomRepository = symptomRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public AppointmentDto createAppointment(AppointmentDto appointmentDto) throws BadRequestException {
        Schedule schedule = scheduleRepository
                .findById(appointmentDto.getSchedule().getId()).orElse(null);
        if(ObjectUtils.isEmpty(schedule)) throw new BadRequestException("Không tìm thấy lịch khám");

//        List<Long> ids = appointmentDto.getSymptoms().stream().map(SymptomDto::getId).toList();
//        List<Symptom> symptoms = new ArrayList<>(symptomRepository.findAllById(ids));

        Appointment appointment = objectMapper.convertValue(appointmentDto, Appointment.class);
        appointment.setSchedule(schedule);
//        appointment.setSymptoms(symptoms);

        Appointment newAppointment = appointmentRepository.save(appointment);
        if(ObjectUtils.isEmpty(newAppointment)) throw new BadRequestException("Can't create appointment");
        return objectMapper.convertValue(newAppointment, AppointmentDto.class);
    }

    @Override
    public AppointmentDto getAppointment(Long id) throws BadRequestException {
        AppointmentDto appointmentDto = objectMapper.convertValue(appointmentRepository.findById(id), AppointmentDto.class);
        if(ObjectUtils.isEmpty(appointmentDto)) throw new BadRequestException("Không tìm thấy cuộc hẹn");
        return appointmentDto;
    }
}
