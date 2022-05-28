package com.smk.modul1.product.service;

import com.smk.modul1.product.dto.input.ProductInput;
import com.smk.modul1.product.dto.output.ProductOutput;
import com.smk.modul1.product.model.Product;
import com.smk.modul1.product.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    private ProductRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public ProductOutput addProduct(ProductInput input) {
        Product temp = mapper.map(input, Product.class);
        Product rest = repository.save(temp);

        return mapper.map(rest, ProductOutput.class);

    }

    @Override
    public ProductOutput updateProduct(ProductInput input, Long id) {
        if (getProduct(id) == null) {
            return null;
        }
        Product temp = mapper.map(input, Product.class);
        temp.setId(id);
        Product rest = repository.save(temp);
        return mapper.map(rest, ProductOutput.class);
    }

    @Override
    public boolean deleteProduct(Long id) {
        ProductOutput temp = getProduct(id);
        if (temp == null) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }

    @Override
    public ProductOutput getProduct(Long id) {
        Optional<Product> temp = repository.findById(id);
        if (temp.isEmpty()) {
            return null;
        }
        Product rest = temp.get();
        return mapper.map(rest, ProductOutput.class);
    }

    @Override
    public List<ProductOutput> getAllProduct() {
        Iterable<Product> products = repository.findAll();
        List<ProductOutput> result = new ArrayList<>();
        for (Product product : products) {
            result.add(mapper.map(product, ProductOutput.class));
        }
        return result;
    }

    @Override
    public List<ProductOutput> multipleProduct(Iterable<ProductInput> inputs) {
        List<Product> result = new ArrayList<>();
        for (ProductInput input : inputs) {
            result.add(mapper.map(input, Product.class));
        }
        repository.saveAll(result);
        List<ProductOutput> resultOutput = new ArrayList<>();
        for (Product product : result) {
            resultOutput.add(mapper.map(product, ProductOutput.class));
        }
        return resultOutput;
    }
}
