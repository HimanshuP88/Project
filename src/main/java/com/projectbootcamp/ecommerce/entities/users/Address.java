package com.projectbootcamp.ecommerce.entities.users;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity


public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Address_generator")
    @SequenceGenerator(name = "Address_generator",sequenceName = "Address_seq",initialValue = 1,allocationSize = 50)


    private Long id;
    private String city;
    private String state;
    private String country;
    private String addressLine;
    private long zipcode;
    private String label;

    @ManyToOne()
    @JoinColumn(name="userid")
    private User users;


}
