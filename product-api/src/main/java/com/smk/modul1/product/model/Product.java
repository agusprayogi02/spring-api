package com.smk.modul1.product.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Product {
    private Long id;
    private String name;
    private String description;
    private Double price;
}
