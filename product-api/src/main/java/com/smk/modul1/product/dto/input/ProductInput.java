package com.smk.modul1.product.dto.input;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductInput {
    private String name;
    private String description;
    private Double price;
}