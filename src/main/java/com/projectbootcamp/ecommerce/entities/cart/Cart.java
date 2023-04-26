package com.projectbootcamp.ecommerce.entities.cart;

import com.projectbootcamp.ecommerce.entities.product.ProductVariation;
import com.projectbootcamp.ecommerce.entities.users.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Cart {

    @EmbeddedId
    CartId cartId;

    private Integer quantity;
    private boolean isWishlistItem;

    @OneToOne
    @MapsId("customer")
    private Customer customer;

    @ManyToOne
    @MapsId("productVariation")
    private ProductVariation productVariation;
}
