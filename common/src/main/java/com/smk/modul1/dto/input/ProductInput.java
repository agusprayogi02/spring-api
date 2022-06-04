package com.smk.modul1.dto.input;

import lombok.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductInput {
    //regex only alphabet and space
    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Only alphabet and space")
    @NotBlank(message = "Product name cannot be empty")
    private String name;

    @NotBlank(message = "Product description cannot be empty")
    private String description;

    @NotNull(message = "Product price cannot be empty")
    private Double price;

    @NotNull(message = "CategoryId cannot be empty")
    private Long categoryId;
}
