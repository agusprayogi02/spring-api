package com.smk.modul1.product.service;

import com.smk.modul1.product.dto.input.ProductInput;
import com.smk.modul1.product.dto.output.ProductOutput;

import java.util.List;

public interface ProductService {
    ProductOutput addProduct(ProductInput input);
    ProductOutput updateProduct(ProductInput input, Long id);
    boolean deleteProduct(Long id);
    ProductOutput getProduct(Long id);
    List<ProductOutput> getAllProduct();
    List<ProductOutput> multipleProduct(Iterable<ProductInput> inputs);
}
