package com.smk.modul1.product.controller;

import com.smk.modul1.product.dto.input.ProductInput;
import com.smk.modul1.product.dto.output.ProductOutput;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/{id}")
    public ResponseEntity<ProductOutput> getOne(@PathVariable Long id){
        return ResponseEntity.ok(ProductOutput.builder().build());
    }

    @GetMapping
    public ResponseEntity<List<ProductOutput>> getOne(@RequestBody ProductInput productInput){
        return ResponseEntity.ok(List.of(ProductOutput.builder().build()));
    }

    @PostMapping
    public ResponseEntity<ProductOutput> create(@RequestBody ProductInput productInput){
        return ResponseEntity.ok(ProductOutput.builder().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductOutput> update(@PathVariable Long id, @RequestBody ProductInput productInput){
        return ResponseEntity.ok(ProductOutput.builder().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        return ResponseEntity.ok().build();
    }
}
