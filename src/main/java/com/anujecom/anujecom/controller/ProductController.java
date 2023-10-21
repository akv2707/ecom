package com.anujecom.anujecom.controller;

import com.anujecom.anujecom.dto.ProductDto;
import com.anujecom.anujecom.dto.ResponseDto;
import com.anujecom.anujecom.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/get-all-product")
    public ResponseDto<List<ProductDto>> getAllProduct(){
        return new ResponseDto<>(HttpStatus.OK.name(), HttpStatus.OK.getReasonPhrase(),productService.getAllProdcuts());
    }

    @PostMapping("/add-product")
    public ResponseDto<String> addProduct(ProductDto productDto){
        productService.saveProduct(productDto);
        return new ResponseDto<>(HttpStatus.OK.name(),HttpStatus.OK.getReasonPhrase());
    }
}
