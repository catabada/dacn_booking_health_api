package vn.edu.hcmuaf.fit.dacn_booking_health_api.mapper;

import org.mapstruct.*;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.schedule.ScheduleDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Schedule;

import java.util.List;

@Mapper(componentModel = "spring", uses = {DoctorMapper.class})
public interface ScheduleMapper {
    @Named("toScheduleDto")
    @Mapping(target = "doctor", ignore = true)
    @Mapping(target = "appointments", ignore = true)
    ScheduleDto toScheduleDto(Schedule schedule);

    @Named("toScheduleDtoWithoutAppointment")
    @Mapping(target = "appointments", ignore = true)
    @Mapping(target = "doctor", qualifiedByName = "toDoctorDtoWithoutSchedules")
    ScheduleDto toScheduleDtoWithoutAppointment(Schedule schedule);

    Schedule toScheduleEntity(ScheduleDto scheduleDto);

    @IterableMapping(qualifiedByName = "toScheduleDto")
    List<ScheduleDto> toScheduleDtoList(List<Schedule> schedules);

    List<Schedule> toScheduleEntityList(List<ScheduleDto> scheduleDtos);
}
