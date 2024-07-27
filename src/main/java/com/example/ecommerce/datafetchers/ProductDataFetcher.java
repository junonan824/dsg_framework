package com.example.ecommerce.datafetchers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.example.ecommerce.models.Product;
import com.example.ecommerce.services.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@DgsComponent
public class ProductDataFetcher {

    @Autowired
    private ProductService productService;

    @DgsQuery
    public List<Product> products() {
        return productService.getAllProducts();
    }
}