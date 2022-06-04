package com.smk.modul1.category.service;

import com.smk.modul1.dto.input.CategoryInput;
import com.smk.modul1.dto.output.CategoryOutput;
import com.smk.modul1.model.Category;

import java.util.List;

public interface CategoryService {
    CategoryOutput addOne(CategoryInput input);

    List<CategoryOutput> getAll();

    CategoryOutput getOne(Long id);
}
