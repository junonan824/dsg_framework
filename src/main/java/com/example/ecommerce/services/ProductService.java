package com.example.ecommerce.services;

import com.example.ecommerce.models.Product;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getAllProducts() {
        return Arrays.asList(
                new Product(1, "Laptop", 999.99),
                new Product(2, "Smartphone", 699.99)
        );
    }
}