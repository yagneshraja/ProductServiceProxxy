package com.example.productservice_proxy.controllers;

import com.example.productservice_proxy.dto.ProductDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;


@Getter
@Setter
@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("")
    public String getAllProducts(){
        return "All Products";
    }

    @GetMapping("/{productId}")
    public String getSingleProduct(@PathVariable("productId") long productId){
        return "Single Product " + productId;
    }


    @PostMapping()
    public String addNewProduct(@RequestBody ProductDto productDto){
        return "Product Created " + productDto;
    }

    @PutMapping("/{productId}")
    public String updateProduct(@PathVariable("productId") long productId){
        return "Product Updated " + productId;
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") long productId){
        return "Product Deleted " + productId;
    }
}
