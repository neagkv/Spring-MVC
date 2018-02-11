package com.advancedMVC.application.repository;


import com.advancedMVC.application.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
