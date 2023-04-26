package com.projectbootcamp.ecommerce.entities.categories;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CategoryMetadataFieldValues {

    @EmbeddedId
    CategoryMetadataFieldValuesId categoryMetadataFieldValuesId;

    @ManyToOne
    @MapsId("categoryId")
    private Category category;

    @ManyToOne
    @MapsId("categoryId")
    private CategoryMetadataField categoryMetadataField;

    @Column(name = "fieldValues")
    private String values;

}
