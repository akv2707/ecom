package com.anujecom.anujecom.service;

import com.anujecom.anujecom.dto.ProductDto;
import com.anujecom.anujecom.entity.Product;
import com.anujecom.anujecom.mapper.ProductMapper;
import com.anujecom.anujecom.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDto> getAllProdcuts() {
        List<Product> productList = productRepository.findAll();
        return ProductMapper.INSTANCE.toProductDtos(productList);
    }

    public void saveProduct(ProductDto productDto) {
        Product product = ProductMapper.INSTANCE.fromProductDto(productDto);
        productRepository.save(product);
    }
}
