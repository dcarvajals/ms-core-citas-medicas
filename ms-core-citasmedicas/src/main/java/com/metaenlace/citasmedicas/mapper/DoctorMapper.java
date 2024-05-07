package com.metaenlace.citasmedicas.mapper;

import com.metaenlace.citasmedicas.dto.DoctorDto;
import com.metaenlace.citasmedicas.dto.UserAppDto;
import com.metaenlace.citasmedicas.model.Doctor;
import com.metaenlace.citasmedicas.model.UserApp;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        componentModel = MappingConstants.ComponentModel.SPRING
)
public interface DoctorMapper {
    Doctor toDoctor (DoctorDto doctorDto);

    DoctorDto toDoctorDto (Doctor doctor);
}
