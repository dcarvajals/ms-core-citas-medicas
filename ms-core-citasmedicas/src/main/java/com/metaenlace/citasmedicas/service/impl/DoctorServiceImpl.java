package com.metaenlace.citasmedicas.service.impl;

import com.metaenlace.citasmedicas.dto.DoctorDto;
import com.metaenlace.citasmedicas.mapper.DoctorMapper;
import com.metaenlace.citasmedicas.model.Doctor;
import com.metaenlace.citasmedicas.repository.DoctorRepository;
import com.metaenlace.citasmedicas.service.DoctorService;
import com.metaenlace.citasmedicas.service.UserAppService;
import com.metaenlace.citasmedicas.util.GenericException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    UserAppService userAppService;

    @Autowired
    DoctorMapper doctorMapper;

    @Override
    public List<DoctorDto> list() {
        return null;
    }

    @Override
    public DoctorDto add(DoctorDto request) throws GenericException {
        if(request == null) {
            throw new GenericException("There are no data to add.");
        }

        if(request.getUser() == null) {
            throw new GenericException("The doctor does not have an assigned user.");
        }

        Doctor doctor = doctorMapper.toDoctor(request);
        doctor =  doctorRepository.save(doctor);
        return doctorMapper.toDoctorDto(doctor);
    }

    @Override
    public DoctorDto update(Long id, DoctorDto request) {
        return null;
    }

    @Override
    public DoctorDto delete(Long id) {
        return null;
    }
}
