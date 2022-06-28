package com.smk.modul1.dto.output;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor()
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class ProductOutput {
    private Long id;
    private String name;
    private String description;
    private Double price;
    //    @JsonBackReference
    private CategoryOutput category;
}
