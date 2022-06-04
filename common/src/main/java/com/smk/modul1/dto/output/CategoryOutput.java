package com.smk.modul1.dto.output;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CategoryOutput {
    private Long id;
    private String name;
    @JsonManagedReference
    private List<ProductOutputJoin> product;
}
