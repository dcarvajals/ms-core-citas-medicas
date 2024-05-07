package com.metaenlace.citasmedicas.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.metaenlace.citasmedicas.model.Doctor}
 */
@Getter
@Setter
public class DoctorDto implements Serializable {
    UserAppDto user;
    String numMember;
}