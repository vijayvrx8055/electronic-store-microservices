package com.vrx.electrohomes.service;

import com.vrx.electrohomes.dto.response.ImageResponse;
import com.vrx.electrohomes.dto.response.PageableResponse;
import com.vrx.electrohomes.dto.ProductDto;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.multipart.MultipartFile;

public interface ProductService {

    //create
    ProductDto create(ProductDto productDto);

    //update
    ProductDto update(ProductDto productDto, String productId);

    //delete
    void deleteProduct(String productId);

    //getAll
    PageableResponse<ProductDto> getAllProducts(int pageNumber, int pageSize,
                                                String sortBy, String sortOrder);

    //get single
    ProductDto getProduct(String productId);

    //get all: live
    PageableResponse<ProductDto> getAllLive(int pageNumber, int pageSize,
                                            String sortBy, String sortOrder);

    //search product
    PageableResponse<ProductDto> searchProducts(String subTitle, int pageNumber, int pageSize,
                                                String sortBy, String sortOrder);

    ImageResponse uploadImage(MultipartFile file, String productId);

    void serveProductImage(String productId, HttpServletResponse response);

    //create product with category
    ProductDto createWithCategory(ProductDto productDto, String categoryId);

    //add category of product - or add product to any category
    ProductDto updateCategory(String productId, String categoryId);

    //get all by category
    PageableResponse<ProductDto> getAllOfCategory(String categoryId, int pageNumber, int pageSize, String sortBy, String sortDir);
}

