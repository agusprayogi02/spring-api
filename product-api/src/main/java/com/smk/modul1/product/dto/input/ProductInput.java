package com.smk.modul1.product.dto.input;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductInput {
    //regex only alphabet and space
    @Pattern(regexp = "[^A-Za-z0-9 ]+$", message = "Only alphabet and space")
    @NotBlank(message = "Product name cannot be empty")
    private String name;

    @NotBlank(message = "Product description cannot be empty")
    private String description;

    @NotBlank(message = "Product price cannot be empty")
    private String price;
}
