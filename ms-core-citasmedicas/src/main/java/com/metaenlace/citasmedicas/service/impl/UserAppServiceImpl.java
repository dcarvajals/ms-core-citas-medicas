package com.metaenlace.citasmedicas.service.impl;

import com.metaenlace.citasmedicas.dto.UserAppDto;
import com.metaenlace.citasmedicas.mapper.UserAppMapper;
import com.metaenlace.citasmedicas.model.UserApp;
import com.metaenlace.citasmedicas.repository.UserAppRepository;
import com.metaenlace.citasmedicas.service.UserAppService;
import com.metaenlace.citasmedicas.util.GenericException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAppServiceImpl implements UserAppService {

    @Autowired
    UserAppRepository userAppRepository;

    @Autowired
    UserAppMapper userAppMapper;

    @Override
    public List<UserAppDto> list() {
        return null;
    }

    @Override
    public UserAppDto add(UserAppDto request) throws GenericException {
        if(request == null) {
            throw new GenericException("There are no data to add");
        }

        UserApp userApp = userAppMapper.toUserApp(request);
        userApp =  userAppRepository.save(userApp);
        return userAppMapper.toUserAppDto(userApp);
    }

    @Override
    public UserAppDto update(Long id, UserAppDto request) {
        return null;
    }

    @Override
    public UserAppDto delete(Long id) {
        return null;
    }
}
