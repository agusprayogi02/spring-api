package com.smk.modul1.dto.input;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CategoryInput {
    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Name only alphabet and space")
    @NotBlank(message = "Category name cannot be blank")
    private String name;
}
