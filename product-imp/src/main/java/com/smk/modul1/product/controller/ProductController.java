package com.smk.modul1.product.controller;

import com.smk.modul1.product.dto.input.ProductInput;
import com.smk.modul1.product.dto.output.ProductOutput;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ArrayList<ProductOutput> listArray;

    @GetMapping("/{id}")
    public ResponseEntity<ProductOutput> getOne(@PathVariable Long id) {
        return ResponseEntity.ok(ProductOutput.builder().build());
    }

    @GetMapping
    public ResponseEntity<List<ProductOutput>> getAllProduct() {
        ArrayList<ProductOutput> listArray = new ArrayList<>();
        listArray.add(new ProductOutput(1L, "A", "AA", 10.0));
        listArray.add(new ProductOutput(2L, "B", "BB", 15.0));
        return ResponseEntity.ok(listArray);
    }

    @PostMapping
    public ResponseEntity<ProductOutput> create(@RequestBody ProductInput productInput) {
        return ResponseEntity.ok(ProductOutput.builder().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductOutput> update(@PathVariable Long id, @RequestBody ProductInput productInput) {
        return ResponseEntity.ok(ProductOutput.builder().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }
}
