package com.example.study_sb.controller;

import com.example.study_sb.data.dto.ProductDto;
import com.example.study_sb.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product-api")
public class ProductController {
    private final Logger LOGGER= LoggerFactory.getLogger(ProductController.class);
    private ProductService productService;

    //새로 인스턴스를 만들지 않고 인스턴스화 되어있는 객체 인스턴스를 연결
    @Autowired
    public ProductController(ProductService productService){this.productService=productService;}

    @GetMapping("/product/{productId}")
    public ProductDto getProduct(@PathVariable String productId){
        long startTime=System.currentTimeMillis();
        LOGGER.info("{ProductController} performs {} of study_sb.","getProduct");

        ProductDto productDto=productService.getProduct(productId);

        LOGGER.info("{ProductController} Response :: productId ={}, productName={},productPrice={},productStock={},Response Time={}ms",productDto.getProductId(),productDto.getProductName(),
                productDto.getProductPrice(),productDto.getProductStock(),(System.currentTimeMillis()-startTime));
        return productDto;
    }
    @PostMapping("/product")
    public ProductDto createProduct(@RequestBody ProductDto productDto){
        String productId=productDto.getProductId();
        String productName=productDto.getProductName();
        int productPrice= productDto.getProductPrice();
        int productStock=productDto.getProductStock();

        return productService.saveProduct(productId,productName,productPrice,productStock);
    }
    @DeleteMapping("/product/{productId}")
    public ProductDto deleteProduct(@PathVariable String productId){
        return null;
    }

}
