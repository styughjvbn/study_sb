package com.example.study_sb.data.dto;

import com.example.study_sb.data.entity.ProductEntity;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDto {
    private String productId;
    private String productName;
    private int productPrice;
    private int productStock;

//    public ProductEntity toEntity(){
//        return ProductEntity.builder
//    }
}
