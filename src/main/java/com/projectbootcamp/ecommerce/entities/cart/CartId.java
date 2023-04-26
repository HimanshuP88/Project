package com.projectbootcamp.ecommerce.entities.cart;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CartId {

    private Long customer;
    private Long productVariation;
}
