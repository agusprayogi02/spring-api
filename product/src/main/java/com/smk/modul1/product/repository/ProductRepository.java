package com.smk.modul1.product.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.smk.modul1.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
