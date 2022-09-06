package com.example.study_sb.service;

import com.example.study_sb.data.dto.ProductDto;

public interface ProductService {
    ProductDto saveProduct(String productId, String productName, int productPrice,int productStock);
    ProductDto getProduct(String productId);
}
