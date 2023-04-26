package com.projectbootcamp.ecommerce.entities.users;

import com.projectbootcamp.ecommerce.entities.cart.Cart;
import com.projectbootcamp.ecommerce.entities.order.Orders;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.criteria.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@PrimaryKeyJoinColumn()
public class Customer extends User{

    private long contact;

    @OneToMany(mappedBy = "customers")
    private List<Orders> orders;


    @OneToOne(mappedBy  ="customer")
    private Cart cart;

}
