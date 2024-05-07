package com.metaenlace.citasmedicas.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.metaenlace.citasmedicas.model.UserApp}
 */
@Getter
@Setter
public class UserAppDto implements Serializable{
    String name;
    String lastname;
    String username;
    String password;
}