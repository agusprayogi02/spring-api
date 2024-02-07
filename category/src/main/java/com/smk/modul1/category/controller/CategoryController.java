package com.smk.modul1.category.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smk.modul1.base.BaseController;
import com.smk.modul1.base.BaseResponse;
import com.smk.modul1.category.service.CategoryService;
import com.smk.modul1.dto.input.CategoryInput;
import com.smk.modul1.dto.output.CategoryOutput;

@RestController
@RequestMapping("/categories")
public class CategoryController extends BaseController {
    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<BaseResponse<List<CategoryOutput>>> getAll() {
        List<CategoryOutput> listArray = service.getAll();
        return ResponseEntity.ok(new BaseResponse<>(listArray));
    }

    @PostMapping
    public ResponseEntity<BaseResponse<CategoryOutput>> addOne(@RequestBody CategoryInput category) {
        CategoryOutput output = service.addOne(category);
        if (output == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(new BaseResponse<>(output));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BaseResponse<CategoryOutput>> getOne(@PathVariable("id") Long id) {
        CategoryOutput output = service.getOne(id);
        return ResponseEntity.ok(new BaseResponse<>(output));
    }
}
