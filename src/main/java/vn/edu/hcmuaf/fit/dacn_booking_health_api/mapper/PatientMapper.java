package vn.edu.hcmuaf.fit.dacn_booking_health_api.mapper;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.dto.patient.PatientDto;
import vn.edu.hcmuaf.fit.dacn_booking_health_api.entity.Patient;

import java.util.List;

@Mapper(componentModel = "spring", uses = {AppointmentMapper.class})
public interface PatientMapper {

    @Named("toPatientDto")
    PatientDto toPatientDto(Patient patient);

    Patient toPatientEntity(PatientDto patientDto);

    @IterableMapping(qualifiedByName = "toPatientDto")
    List<PatientDto> toPatientDtoList(List<Patient> patients);

    List<Patient> toPatientEntityList(List<PatientDto> patientDtos);
}
