package com.example.study_sb.service.impl;

import com.example.study_sb.data.dto.ProductDto;
import com.example.study_sb.data.entity.ProductEntity;
import com.example.study_sb.data.handler.ProductDataHandler;
import com.example.study_sb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceimpl implements ProductService {
    ProductDataHandler productDataHandler;

    @Autowired
    public ProductServiceimpl(ProductDataHandler productDataHandler){
        this.productDataHandler=productDataHandler;
    }

    @Override
    public ProductDto saveProduct(String productId, String productName,int productPrice,int productStock){
        ProductEntity productEntity = productDataHandler.saveProductEntity(productId,productName,productPrice,productStock);

        ProductDto productDto=new ProductDto(productEntity.getProductId(),productEntity.getProductName(),productEntity.getProductPrice(),productEntity.getProductStock());

        return productDto;
    }

    @Override
    public ProductDto getProduct(String productId) {
        ProductEntity productEntity = productDataHandler.getProductEntity(productId);

        ProductDto productDto=new ProductDto(productEntity.getProductId(),productEntity.getProductName(),productEntity.getProductPrice(),productEntity.getProductStock());

        return productDto;
    }
}
