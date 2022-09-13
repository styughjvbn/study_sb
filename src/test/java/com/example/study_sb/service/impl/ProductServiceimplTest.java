package com.example.study_sb.service.impl;

import com.example.study_sb.data.dto.ProductDto;
import com.example.study_sb.data.entity.ProductEntity;
import com.example.study_sb.data.handler.impl.ProductDataHandlerimpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(SpringExtension.class)
@Import({ProductDataHandlerimpl.class,ProductServiceimpl.class})
public class ProductServiceimplTest {
    @MockBean
    ProductDataHandlerimpl productDataHandler;

    @Autowired
    ProductServiceimpl productService;

    @Test
    public void getProductTest(){
        Mockito.when(productDataHandler.getProductEntity("123"))
                .thenReturn(new ProductEntity("123","pen",2000,1000));
        ProductDto productDto=productService.getProduct("123");
        Assertions.assertEquals(productDto.getProductId(),"123");
        verify(productDataHandler).getProductEntity("123");
    }
    @Test
    public void saveProductTest(){
        Mockito.when(productDataHandler.saveProductEntity("123","pen",2000,1000))
                .thenReturn(new ProductEntity("123","pen",2000,1000));
        ProductDto productDto=productService.saveProduct("123","pen",2000,1000);
        Assertions.assertEquals(productDto.getProductId(),"123");
        verify(productDataHandler).saveProductEntity("123","pen",2000,1000);
    }
}
