package com.example.study_sb.data.dto;

import com.example.study_sb.data.entity.ProductEntity;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDto {
    @NotNull
    private String productId;
    @NotNull
    private String productName;
    @NotNull
    @Min(value=500)
    @Max(3000000)
    private int productPrice;
    @NotNull
    @Min(value=0)
    @Max(9999)
    private int productStock;

//    public ProductEntity toEntity(){
//        return ProductEntity.builder
//    }
}
