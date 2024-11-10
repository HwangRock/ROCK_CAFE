package com.example.rockcafe.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String token;
    private String name;
    private String email;
    private String password;
    private String role;
    private Long id;
}
