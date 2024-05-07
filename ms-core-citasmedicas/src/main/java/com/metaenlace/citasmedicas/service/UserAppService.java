package com.metaenlace.citasmedicas.service;

import com.metaenlace.citasmedicas.dto.UserAppDto;
import com.metaenlace.citasmedicas.util.GenericException;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserAppService {

    List<UserAppDto> list ();

    UserAppDto add (UserAppDto request) throws GenericException;

    UserAppDto update (Long id, UserAppDto request);

    UserAppDto delete (Long id);

}
