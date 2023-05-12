package vn.edu.hcmuaf.fit.dacn_booking_health_api.mapper;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.specialist.SpecialistDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Specialist;

import java.util.List;

@Mapper(componentModel = "spring", uses = {SymptomMapper.class})
public interface SpecialistMapper {
    @Named("toSpecialistDto")
    @Mapping(target = "symptoms", qualifiedByName = "toSymptomDto")
    SpecialistDto toSpecialistDto(Specialist specialist);

    @Named("toSpecialistDtoWithoutDoctors")
    @Mapping(target = "symptoms", qualifiedByName = "toSymptomDtoWithoutSpecialist")
    @Mapping(target = "doctors", ignore = true)
    SpecialistDto toSpecialistDtoWithoutDoctors(Specialist specialist);

    Specialist toSpecialistEntity(SpecialistDto specialistDto);

    @IterableMapping(qualifiedByName = "toSpecialistDto")
    List<SpecialistDto> toSpecialistDtoList(List<Specialist> specialists);

    List<Specialist> toSpecialistEntityList(List<SpecialistDto> specialistDtos);
}
