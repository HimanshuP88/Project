package com.projectbootcamp.ecommerce.entities.categories;

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
public class CategoryMetadataField {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "CategoryMetadataField_generator")
    @SequenceGenerator(name = "CategoryMetadataField_generator",sequenceName = "CategoryMetadataField_seq",initialValue = 1,allocationSize = 50)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "categoryMetadataField")
    private List<CategoryMetadataFieldValues> categoryMetadataFieldValuesList;
}
