package com.example.study_sb.data.handler;

import com.example.study_sb.data.entity.ProductEntity;

public interface ProductDataHandler {
    ProductEntity saveProductEntity(String productId, String productName,int productPrice,int productStock);
    ProductEntity getProductEntity(String productId);
}
