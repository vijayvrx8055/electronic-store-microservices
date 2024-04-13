package com.vrx.electrohomes.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("products")
public class Product {
    @Id
    private String productId;
    private String title;
    private String description;
    private double price;
    private double discountedPrice;
    private int quantity;
    private Date addedDate;
    private boolean isLive;
    private boolean inStock;
    private String productImage;


}
