package com.example.productservice_proxy.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDto {
    private long id;
    private String title;
    private String description;
    private double price;
    private String category;
    private String imageUrl;


}
