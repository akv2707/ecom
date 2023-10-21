package com.anujecom.anujecom.mapper;

import com.anujecom.anujecom.dto.ProductDto;
import com.anujecom.anujecom.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    Product fromProductDto(ProductDto productDto);
    ProductDto fromProdcut(Product product);

    List<ProductDto> toProductDtos(List<Product> products);
    List<Product> fromProductDtos(List<ProductDto> productDtos);
}
