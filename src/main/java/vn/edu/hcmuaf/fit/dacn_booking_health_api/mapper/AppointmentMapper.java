package vn.edu.hcmuaf.fit.dacn_booking_health_api.mapper;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.appointment.AppointmentDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Appointment;

import java.util.List;

@Mapper(componentModel = "spring", uses = {DoctorMapper.class, ScheduleMapper.class, SymptomMapper.class})
public interface AppointmentMapper {

    @Named("toAppointmentDto")
    @Mapping(target = "schedule", qualifiedByName = "toScheduleDtoWithoutAppointment")
    @Mapping(target = "symptoms", qualifiedByName = "toSymptomDtoWithoutSpecialist")
    @Mapping(target = "patient.appointments", ignore = true)
    AppointmentDto toAppointmentDto(Appointment appointment);

    Appointment toAppointmentEntity(AppointmentDto appointmentDto);

    @IterableMapping(qualifiedByName = "toAppointmentDto")
    List<AppointmentDto> toAppointmentDtoList(List<Appointment> appointments);

    List<Appointment> toAppointmentEntityList(List<AppointmentDto> appointmentDtos);
}
