package com.smk.modul1.product.repository;

import com.smk.modul1.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
