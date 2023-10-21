package com.anujecom.anujecom.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
    @NotNull
    @Column(name = "product_code")
    private String productCode;
    @NotNull
    @Column(name = "product_name")
    private String productName;
    @Column(name="product_price")
    private double productPrice;
    @Column(name="description")
    private String description;
    @Column(name="quantity")
    private int quantity;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "tags")
    private String tags;



}


