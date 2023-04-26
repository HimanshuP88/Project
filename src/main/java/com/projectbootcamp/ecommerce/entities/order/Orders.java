package com.projectbootcamp.ecommerce.entities.order;

import com.projectbootcamp.ecommerce.entities.users.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Orders_generator")
    @SequenceGenerator(name = "Orders_generator",sequenceName = "Orders_seq",initialValue = 1,allocationSize = 50)
    private Long id;
   // private Integer customerUserId;
    private Date dateCreated;
    private Integer amountPaid;
    private String paymentMethod;
    private  String customerAddressCity;
    private  String customerAddressState;
    private  String customerAddressCountry;
    private  String customerAddressAddressLine;
    private  String customerAddressLabel;
    private  Integer customerAddressZipCode;

    @OneToMany(mappedBy = "orders")
    private List<OrderProduct> orderProductList;

    @ManyToOne()
    private Customer customer;





    @ManyToOne
    @JoinColumn(name ="customerUserId")
    private Customer customers;




}
