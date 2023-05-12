package vn.edu.hcmuaf.fit.dacn_booking_health_api.mapper;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.doctor.DoctorDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Doctor;

import java.util.List;


@Mapper(componentModel = "spring", uses = {SpecialistMapper.class})
public interface DoctorMapper {
    @Named("toDoctorDto")
    @Mapping(target = "specialist", qualifiedByName = "toSpecialistDtoWithoutDoctors")
    DoctorDto toDoctorDto(Doctor doctor);

    Doctor toDoctorEntity(DoctorDto doctorDto);

    @IterableMapping(qualifiedByName = "toDoctorDto")
    List<DoctorDto> toDoctorDtoList(List<Doctor> doctors);

    List<Doctor> toDoctorEntityList(List<DoctorDto> doctorDtos);
}
