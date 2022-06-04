package com.smk.modul1.dto.output;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor()
public class ProductOutputJoin {
    private Long id;
    private String name;
    private String description;
    private Double price;
    @JsonBackReference
    private CategoryOutput category;
}
