package vn.edu.hcmuaf.fit.dacn_booking_health_api.mapper;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.doctor.DoctorDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.schedule.ScheduleDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Doctor;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Schedule;

import java.util.List;


@Mapper(componentModel = "spring", uses = {SpecialistMapper.class})
public interface DoctorMapper {
    @Named("toDoctorDto")
    @Mapping(target = "schedules", qualifiedByName = "toScheduleDto")
    @Mapping(target = "specialist", qualifiedByName = "toSpecialistDtoWithoutDoctors")
    DoctorDto toDoctorDto(Doctor doctor);

    @Named("toDoctorDtoWithoutSchedules")
    @Mapping(target = "schedules", ignore = true)
    @Mapping(target = "specialist", qualifiedByName = "toSpecialistDtoWithoutDoctors")
    DoctorDto toDoctorDtoWithoutSchedules(Doctor doctor);

    Doctor toDoctorEntity(DoctorDto doctorDto);

    @IterableMapping(qualifiedByName = "toDoctorDto")
    List<DoctorDto> toDoctorDtoList(List<Doctor> doctors);

    List<Doctor> toDoctorEntityList(List<DoctorDto> doctorDtos);


    @Named("toScheduleDto")
    @Mapping(target = "doctor", ignore = true)
    @Mapping(target = "appointments", ignore = true)
    ScheduleDto toScheduleDto(Schedule schedule);
}
