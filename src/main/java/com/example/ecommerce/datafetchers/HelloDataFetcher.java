package com.example.ecommerce.datafetchers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;

@DgsComponent
public class HelloDataFetcher {

    @DgsQuery
    public String hello() {
        return "Hello, DGS!";
    }
}