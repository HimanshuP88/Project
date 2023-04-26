package com.projectbootcamp.ecommerce.entities.categories;

import com.projectbootcamp.ecommerce.entities.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Category_generator")
    @SequenceGenerator(name = "Category_generator",sequenceName = "Category_seq",initialValue = 1,allocationSize = 50)
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name ="parentCategoryId")
    private Category category;
//
//    @OneToMany()
//    @JoinColumn(name ="parentCategoryId")
//    private Category category1;

    @OneToMany(mappedBy = "category")
    private List<Product> product;
}
