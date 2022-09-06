package com.example.study_sb.data.dao.impl;

import com.example.study_sb.data.dao.ProductDAO;
import com.example.study_sb.data.entity.ProductEntity;
import com.example.study_sb.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDAOImpl implements ProductDAO {
    ProductRepository productRepository;

    @Autowired
    public ProductDAOImpl(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    @Override
    public ProductEntity saveProduct(ProductEntity productEntity){
        productRepository.save(productEntity);
        return productEntity;
    }
    @Override
    public ProductEntity getProduct(String productId){
        ProductEntity productEntity=productRepository.getById(productId);
        return productEntity;
    }
}
