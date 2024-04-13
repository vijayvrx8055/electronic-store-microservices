package com.vrx.electrohomes.service.impl;

import com.netflix.discovery.converters.Auto;
import com.vrx.electrohomes.config.ProductConfig;
import com.vrx.electrohomes.dto.ProductDto;
import com.vrx.electrohomes.dto.response.ImageResponse;
import com.vrx.electrohomes.dto.response.PageableResponse;
import com.vrx.electrohomes.entity.Product;
import com.vrx.electrohomes.repository.ProductRepository;
import com.vrx.electrohomes.service.ProductService;
import com.vrx.electrohomes.util.ProductUtil;
import jakarta.servlet.http.HttpServletResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductUtil productUtil;

    @Autowired
    private ProductConfig productConfig;

    @Override
    public ProductDto create(ProductDto productDto) {
        ModelMapper modelMapper = productConfig.modelMapper();
        Product product = modelMapper.map(productDto, Product.class);
        String productId = UUID.randomUUID().toString();
        product.setProductId(productId);
        Product savedProduct = productRepository.save(product);
        return modelMapper.map(savedProduct, ProductDto.class);
    }

    @Override
    public ProductDto update(ProductDto productDto, String productId) {
        return null;
    }

    @Override
    public void deleteProduct(String productId) {

    }

    @Override
    public PageableResponse<ProductDto> getAllProducts(int pageNumber, int pageSize, String sortBy, String sortOrder) {
        return null;
    }

    @Override
    public ProductDto getProduct(String productId) {
        return null;
    }

    @Override
    public PageableResponse<ProductDto> getAllLive(int pageNumber, int pageSize, String sortBy, String sortOrder) {
        return null;
    }

    @Override
    public PageableResponse<ProductDto> searchProducts(String subTitle, int pageNumber, int pageSize, String sortBy, String sortOrder) {
        return null;
    }

    @Override
    public ImageResponse uploadImage(MultipartFile file, String productId) {
        return null;
    }

    @Override
    public void serveProductImage(String productId, HttpServletResponse response) {

    }

    @Override
    public ProductDto createWithCategory(ProductDto productDto, String categoryId) {
        return null;
    }

    @Override
    public ProductDto updateCategory(String productId, String categoryId) {
        return null;
    }

    @Override
    public PageableResponse<ProductDto> getAllOfCategory(String categoryId, int pageNumber, int pageSize, String sortBy, String sortDir) {
        return null;
    }
}
