package com.projectbootcamp.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto {

//    private String firstname;
//    private String middleName;
//
//    //    @NotNull
//    private String lastname;
    private String email;
    private String password;

    public LoginDto(String token) {

    }
}
