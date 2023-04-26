package com.projectbootcamp.ecommerce.repository;

import com.projectbootcamp.ecommerce.entities.users.Customer;
import com.projectbootcamp.ecommerce.entities.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Optional<User> findByEmail(String email);
    Boolean existsByEmail(String email);
}
