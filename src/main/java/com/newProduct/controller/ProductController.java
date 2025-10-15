package com.newProduct.controller;

import com.newProduct.entity.Product;
import com.newProduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;
@PostMapping
    public Product createProduct(@RequestBody Product product){

        return productService.save(product);
    }
    @GetMapping
    public List<Product>getAllProducts(){

        return productService.getAllProducts();
    }
    @GetMapping("/{id}")
    public List<Product>getProductById(@PathVariable Long id){

        return productService.findById();
    }
}
