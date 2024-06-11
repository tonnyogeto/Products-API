package com.EasyCrudApp.service;

import com.EasyCrudApp.model.Product;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1,"iPhone",2500),
            new Product(2,"Samsung",3000),
            new Product(3,"Techno",1500)
    ));

    public List<Product>getProduct(){
        return products;
    }

    public Product getProductById(int productId) {
        return products.stream()
                .filter(p -> p.getProductId()==productId)
                .findFirst().orElse(new Product(0,"No item", 0));
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod, Integer productId) {
        int index=0;
        for(int i=0; i< products.size(); i++)
            if(products.get(i).getProductId()==productId)
                index=i;
        products.set(index, prod);
    }

    public void deleteProduct(int prodId) {
        int index=0;
        for(int i=0; i< products.size(); i++)
            if(products.get(i).getProductId()==prodId)
                index=i;
        products.remove(index);
    }
}
