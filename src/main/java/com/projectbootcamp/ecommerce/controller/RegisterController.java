package com.projectbootcamp.ecommerce.controller;

import com.projectbootcamp.ecommerce.dto.CustomerDto;
import com.projectbootcamp.ecommerce.dto.LoginDto;
import com.projectbootcamp.ecommerce.repository.RoleRepository;
import com.projectbootcamp.ecommerce.repository.UserRepository;
import com.projectbootcamp.ecommerce.security.JwtTokenGenerator;
import com.projectbootcamp.ecommerce.service.CustomerService;
import jakarta.validation.constraints.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/register")
public class RegisterController {

    private AuthenticationManager authenticationManager;
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    private CustomerService customerService;

    @Autowired
    public RegisterController(AuthenticationManager authenticationManager, UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginDto> login(@RequestBody LoginDto loginDto){
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginDto.getEmail(),
                        //loginDto.getMiddleName(),
                        //loginDto.getLastname(),
                        loginDto.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = JwtTokenGenerator.generateToken(authentication);
        return new ResponseEntity<>(new LoginDto(token), HttpStatus.OK);
    }
    @PostMapping("/register")
    public ResponseEntity<String> registerCustomer(@RequestBody CustomerDto customerDto){
        if (!(customerDto.getPassword().equals(customerDto.getConfirmPassword()))){
            return new ResponseEntity<>("password doesn't match ", HttpStatus.BAD_REQUEST);
        }
        String x = customerService.regisCustomer(customerDto);
        if(x.equals("E-mail id already exists")){
            return new ResponseEntity<>(x,HttpStatus.BAD_REQUEST);

        }
        return new ResponseEntity<>(x,HttpStatus.OK);





    }


}
