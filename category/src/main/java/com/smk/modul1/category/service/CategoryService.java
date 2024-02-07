package com.smk.modul1.category.service;

import java.util.List;

import com.smk.modul1.dto.input.CategoryInput;
import com.smk.modul1.dto.output.CategoryOutput;

public interface CategoryService {
    CategoryOutput addOne(CategoryInput input);

    List<CategoryOutput> getAll();

    CategoryOutput getOne(Long id);
}
