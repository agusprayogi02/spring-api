package com.smk.modul1.product.dto.output;

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
}
