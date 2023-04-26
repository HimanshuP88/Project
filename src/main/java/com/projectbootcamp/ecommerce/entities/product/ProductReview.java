package com.projectbootcamp.ecommerce.entities.product;

import com.projectbootcamp.ecommerce.entities.users.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class ProductReview {

    @EmbeddedId
    ProductReviewId productReviewId;

    private String review;
    private Integer rating;

    @OneToOne
    @MapsId("customer")
    private Customer customer;

    @ManyToOne
    @MapsId("product")
    private Product product;

}
