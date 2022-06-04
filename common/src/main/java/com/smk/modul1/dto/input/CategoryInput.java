package com.smk.modul1.dto.input;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CategoryInput {
    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Name only alphabet and space")
    @NotBlank(message = "Category name cannot be blank")
    private String name;
}
