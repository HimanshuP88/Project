package com.projectbootcamp.ecommerce.dto;

import com.projectbootcamp.ecommerce.entities.users.Address;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {


    @NotEmpty(message = "mail should not be null")
    @Email(message = "email not valid")
    private String email;

//    @NotEmpty(message = "first name should not be null")
    private String firstname;


    private String middleName;

//    @NotNull
    private String lastname;

//    @Pattern(regexp = "^[a-zA-Z0-9]{6,12}$",
//    message = "password must be of 6 to 12 length with one special characters")
    private String password;
    private long contact;

    private String confirmPassword;
    private List<Address> Address;

}
