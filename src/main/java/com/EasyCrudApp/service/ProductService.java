package com.EasyCrudApp.service;

import com.EasyCrudApp.Repository.ProductRepo;
import com.EasyCrudApp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product>getProduct(){
        return repo.findAll();
    }

    public Product getProductById(int productId) {
        return repo.findById(productId).orElse(new Product());
    }

    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product prod, Integer productId) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
