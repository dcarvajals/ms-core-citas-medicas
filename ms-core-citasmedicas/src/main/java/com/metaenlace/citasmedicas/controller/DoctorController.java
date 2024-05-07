package com.metaenlace.citasmedicas.controller;

import com.metaenlace.citasmedicas.dto.DoctorDto;
import com.metaenlace.citasmedicas.service.DoctorService;
import com.metaenlace.citasmedicas.util.GenericBasicResponse;
import com.metaenlace.citasmedicas.util.GenericException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping(
        path = "/doctor"
)
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @PostMapping(
            path = "/insertar-doctor",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public GenericBasicResponse<DoctorDto> add (@RequestBody DoctorDto request) throws GenericException {
        GenericBasicResponse<DoctorDto> response = new GenericBasicResponse<>();
        log.info("Request received: add");
        response.setData(doctorService.add(request));
        log.info("Request completed: add");
        return response;
    }

}
