package com.projectbootcamp.ecommerce.entities.users;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "User_generator")
    @SequenceGenerator(name = "User_generator",sequenceName = "User_seq",initialValue = 1,allocationSize = 50)
    private Long id;
    private String email;
    private String firstname;
    private String middleName;
    private String lastname;
    private String password;
    private boolean isDeleted;
    private boolean isExpired;
    private boolean isLocked;
    private boolean isActive;
    private Integer invalidAttemptCount;
    private Date passwordUpdateDate;

    @ManyToMany(mappedBy = "user")
    private List<Role> role;

    @OneToMany(mappedBy = "users")
    private List<Address> address;







}
