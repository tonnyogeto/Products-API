package com.EasyCrudApp.service;

import com.EasyCrudApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = Arrays.asList(
            new Product(1,"iPhone",2500),
            new Product(2,"Samsung",3000),
            new Product(3,"Techno",1500)
    );

    public List<Product>getProduct(){
        return products;
    }

}
