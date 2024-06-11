package com.EasyCrudApp.controller;

import com.EasyCrudApp.model.Product;
import com.EasyCrudApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping
    public List<Product> getProducts(){
        return service.getProduct();
    }
    @GetMapping("/{productId}")
    public Product getProductById(
            @PathVariable("productId") Integer productId
    ){
        return service.getProductById(productId);
    }

    @PostMapping
    public void addProduct(@RequestBody Product prod){
        System.out.println(prod);
        service.addProduct(prod);
    }

    @PutMapping("/{productId}")
    public void updateProduct(
            @PathVariable("productId") Integer productId,
            @RequestBody Product prod
    ){
        service.updateProduct(prod,productId);
    }

    @DeleteMapping("/{prodId}")
    public void deleteProduct(
            @PathVariable("prodId") Integer productId
    ){
        service.deleteProduct(productId);

    }


}
