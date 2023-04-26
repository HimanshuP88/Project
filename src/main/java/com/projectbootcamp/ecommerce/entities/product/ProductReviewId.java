package com.projectbootcamp.ecommerce.entities.product;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ProductReviewId implements Serializable {

    private Long customer;
    private Long product;
}
