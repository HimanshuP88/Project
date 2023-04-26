package com.projectbootcamp.ecommerce.entities.product;


import com.projectbootcamp.ecommerce.entities.order.OrderProduct;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductVariation {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ProductVariation_generator")
    @SequenceGenerator(name = "ProductVariation_generator",sequenceName = "ProductVariation_seq",initialValue = 1,allocationSize = 50)
    private Long id;
    private Integer quantityAvailable;
    private Integer price;

    @Column(columnDefinition = "json")
    private String MetaData;
    private String primaryImageName;
    private boolean isActive;

    @OneToOne(mappedBy = "productVariation")
    private OrderProduct orderProduct;

    @ManyToOne()
    private Product product;

}
