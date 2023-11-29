package com.example.productservice_proxy.controllers;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Getter
@Setter
@RestController
@RequestMapping("/products/categories")
public class CategoryController {

    @GetMapping("")
    public String getAllCategories(){
        return "All Categories";
    }

    @GetMapping("/{categoryId}")
    public String getSingleCategory(@PathVariable("categoryId") long categoryId){
        return "Single Category " + categoryId;
    }
}
