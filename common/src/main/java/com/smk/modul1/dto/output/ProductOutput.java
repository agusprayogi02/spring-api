package com.smk.modul1.dto.output;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor()
public class ProductOutput {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private CategoryOutput category;
}
