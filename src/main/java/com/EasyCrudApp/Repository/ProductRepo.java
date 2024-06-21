package com.EasyCrudApp.Repository;

import com.EasyCrudApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer>{
}
