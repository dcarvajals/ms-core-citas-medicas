package com.metaenlace.citasmedicas.service;

import com.metaenlace.citasmedicas.dto.DoctorDto;
import com.metaenlace.citasmedicas.util.GenericException;

import java.util.List;

public interface DoctorService {
    List<DoctorDto> list ();

    DoctorDto add (DoctorDto request) throws GenericException;

    DoctorDto update (Long id, DoctorDto request);

    DoctorDto delete (Long id);
}
