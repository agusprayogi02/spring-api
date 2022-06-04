package com.smk.modul1.product.controller;

import com.smk.modul1.base.BaseController;
import com.smk.modul1.base.BaseResponse;
import com.smk.modul1.dto.input.ProductInput;
import com.smk.modul1.dto.output.ProductOutput;
import com.smk.modul1.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController extends BaseController {
    @Autowired
    private ProductService service;

    @GetMapping("/{id}")
    public ResponseEntity<BaseResponse<ProductOutput>> getOne(@PathVariable Long id) {
        ProductOutput product = service.getProduct(id);
        return ResponseEntity.ok(new BaseResponse<>(product));
    }

    @GetMapping
    public ResponseEntity<BaseResponse<List<ProductOutput>>> getAllProduct() {
        List<ProductOutput> listArray = service.getAllProduct();
        return ResponseEntity.ok(new BaseResponse<>(listArray));
    }

    @PostMapping
    public ResponseEntity<BaseResponse<ProductOutput>> addOne(@Valid @RequestBody ProductInput productInput) {
        ProductOutput product = service.addProduct(productInput);
        return ResponseEntity.ok(new BaseResponse<>(product));
    }

    @PutMapping("/{id}")
    public ResponseEntity<BaseResponse<ProductOutput>> update(@PathVariable Long id,
                                                @Valid @RequestBody ProductInput productInput) {
        ProductOutput product = service.updateProduct(productInput, id);
        return ResponseEntity.ok(new BaseResponse<>(product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BaseResponse<Boolean>> delete(@PathVariable Long id) {
        boolean delete = service.deleteProduct(id);
        return ResponseEntity.ok(new BaseResponse<>(delete));
    }

    @PostMapping("/saveAll")
    public ResponseEntity<BaseResponse<List<ProductOutput>>> saveAllProduct(@Valid @RequestBody Iterable<ProductInput> inputs){
        List<ProductOutput> rests = service.multipleProduct(inputs);
        return ResponseEntity.ok(new BaseResponse<>(rests));
    }
}
