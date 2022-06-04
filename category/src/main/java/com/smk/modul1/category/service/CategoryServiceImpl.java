package com.smk.modul1.category.service;

import com.smk.modul1.dto.input.CategoryInput;
import com.smk.modul1.dto.output.CategoryOutput;
import com.smk.modul1.category.repository.CategoryRepository;
import com.smk.modul1.model.Category;
import org.apache.commons.collections4.IterableUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public CategoryOutput addOne(CategoryInput input) {
        Category category = mapper.map(input, Category.class);
        this.repository.save(category);
        return mapper.map(category, CategoryOutput.class);
    }

    @Override
    public List<CategoryOutput> getAll() {
        Iterable<Category> categories = this.repository.findAll();
        List<Category> categoryList = IterableUtils.toList(categories);
        List<CategoryOutput> output = new ArrayList<>();
        for (Category item : categoryList) {
            output.add(mapper.map(item, CategoryOutput.class));
        }
        return output;
    }

    @Override
    public CategoryOutput getOne(Long id) {
        Optional<Category> category = this.repository.findById(id);
        return category.map(value -> mapper.map(value, CategoryOutput.class)).orElse(null);
    }
}
