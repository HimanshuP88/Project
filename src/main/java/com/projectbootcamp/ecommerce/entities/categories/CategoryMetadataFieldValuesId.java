package com.projectbootcamp.ecommerce.entities.categories;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CategoryMetadataFieldValuesId implements Serializable {


    private Long categoryId;
    private Long categoryMetaDataFieldId;
}
