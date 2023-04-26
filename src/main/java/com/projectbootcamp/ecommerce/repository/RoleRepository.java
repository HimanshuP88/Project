package com.projectbootcamp.ecommerce.repository;

import com.projectbootcamp.ecommerce.entities.users.Role;
import com.projectbootcamp.ecommerce.entities.users.User;
import com.projectbootcamp.ecommerce.enums.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByAuthority(Authority authority);

}
