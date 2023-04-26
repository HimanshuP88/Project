package com.projectbootcamp.ecommerce.entities.users;

import com.projectbootcamp.ecommerce.entities.product.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
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
@PrimaryKeyJoinColumn()
public class Seller extends User{

    private Integer gst;
    private long companyContact;
    private String companyName;

    @OneToMany(mappedBy = "seller")
    private List<Product> product;


}
