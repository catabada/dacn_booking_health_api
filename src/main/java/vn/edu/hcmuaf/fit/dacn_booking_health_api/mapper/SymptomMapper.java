package vn.edu.hcmuaf.fit.dacn_booking_health_api.mapper;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.symptom.SymptomDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Symptom;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SymptomMapper {
    @Named("toSymptomDto")
    @Mapping(target = "specialists", ignore = true)
    SymptomDto toSymptomDto(Symptom symptom);

    @Named("toSymptomDtoWithoutSpecialist")
    @Mapping(target = "specialists", ignore = true)
    SymptomDto toSymptomDtoWithoutSpecialist(Symptom symptom);

    Symptom toSymptomEntity(SymptomDto symptomDto);

    @IterableMapping(qualifiedByName = "toSymptomDto")
    List<SymptomDto> toSymptomDtoList(List<Symptom> symptoms);

    List<Symptom> toSymptomEntityList(List<SymptomDto> symptomDtos);
}
