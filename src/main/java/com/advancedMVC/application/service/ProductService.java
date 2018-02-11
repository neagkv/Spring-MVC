package com.advancedMVC.application.service;


import com.advancedMVC.application.model.Product;

public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);
}
