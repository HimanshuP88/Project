package com.projectbootcamp.ecommerce.entities.product;

import com.projectbootcamp.ecommerce.entities.categories.Category;
import com.projectbootcamp.ecommerce.entities.users.Seller;
import jakarta.persistence.*;
import jakarta.persistence.criteria.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Product_generator")
    @SequenceGenerator(name = "Product_generator",sequenceName = "Product_seq",initialValue = 1,allocationSize = 50)
    private Long id;
    private String name;
    private String description;
    private boolean isCancellable;
    private boolean isReturnable;
    private boolean isActive;
    private boolean isDeleted;
    private String brand;


    @ManyToOne
//    @JoinColumn(name=" sellerUserId")
    private Seller seller;

    @ManyToOne
    @JoinColumn(name= "categoryId")
    private Category category;



    @OneToMany(mappedBy = "product")
    private List<ProductVariation> productVariation;

    @OneToMany(mappedBy = "product")
    private List<ProductReview> productReview;



}
