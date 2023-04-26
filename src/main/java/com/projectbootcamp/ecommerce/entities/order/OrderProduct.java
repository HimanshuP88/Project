package com.projectbootcamp.ecommerce.entities.order;

import com.projectbootcamp.ecommerce.entities.product.Product;
import com.projectbootcamp.ecommerce.entities.product.ProductVariation;
import jakarta.persistence.*;
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
public class OrderProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "OrderProduct_generator")
    @SequenceGenerator(name = "category_generator",sequenceName = "category_seq",initialValue = 1,allocationSize = 50)
    private Long id;
    private Integer quantity;
    private double price;

    @ManyToOne()
    @JoinColumn(name="orderId")
    private Product product;

    @OneToOne
    @JoinColumn(name ="productVariationId")
    private ProductVariation productVariation;

    @ManyToOne()
    private Orders orders;

    @OneToMany(mappedBy = "orderProduct")
    private List<OrderStatus> OrderStatus;
}
