package com.projectbootcamp.ecommerce.service;

import com.projectbootcamp.ecommerce.dto.CustomerDto;
import com.projectbootcamp.ecommerce.entities.users.Customer;
import com.projectbootcamp.ecommerce.entities.users.Role;
import com.projectbootcamp.ecommerce.enums.Authority;
import com.projectbootcamp.ecommerce.repository.CustomerRepository;
import com.projectbootcamp.ecommerce.repository.RoleRepository;
import com.projectbootcamp.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private RoleRepository roleRepository;

    private UserRepository userRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    public CustomerService(RoleRepository roleRepository, UserRepository userRepository) {
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
    }
    public String regisCustomer(CustomerDto customerDto){
        if(userRepository.existsByEmail(customerDto.getEmail())){
            return "email already exists";
        }

    Customer customer = new Customer();
        customer.setContact(customerDto.getContact());
        customer.setEmail(customerDto.getEmail());

        customer.setFirstname(customerDto.getFirstname());
        customer.setMiddleName(customerDto.getFirstname());
        customer.setLastname(customerDto.getLastname());
        customer.setAddress(customerDto.getAddress());
        Role role=new Role();
        role.setAuthority(Authority.CUSTOMER);
        customer.setRole(List.of(role));
        customerRepository.save(customer);
        return "customer successfully registered";


    }

}
