package com.berrones.devscribenotes.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class UserDto {

    private UUID userId;

    private String username;

    private String userEmail;
}
