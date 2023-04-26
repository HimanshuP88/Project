package com.projectbootcamp.ecommerce.entities.users;

import com.projectbootcamp.ecommerce.enums.Authority;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.EnumType.STRING;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Role{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Role_generator")
    @SequenceGenerator(name = "Role_generator",sequenceName = "Role_seq",initialValue = 1,allocationSize = 50)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Authority authority;

    @ManyToMany
    private List<User> user;



}
