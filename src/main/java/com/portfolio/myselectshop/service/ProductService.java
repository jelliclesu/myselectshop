package com.portfolio.myselectshop.service;

import com.portfolio.myselectshop.dto.ProductRequestDto;
import com.portfolio.myselectshop.dto.ProductResponseDto;
import com.portfolio.myselectshop.entity.Product;
import com.portfolio.myselectshop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductResponseDto createProduct(ProductRequestDto requestDto) {
        Product product = productRepository.save(new Product(requestDto));
        return new ProductResponseDto(product);
    }
}
