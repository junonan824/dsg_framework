package com.example.ecommerce.datafetchers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.example.ecommerce.models.User;
import com.example.ecommerce.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@DgsComponent
public class UserDataFetcher {

    @Autowired
    private UserService userService;

    @DgsQuery
    public List<User> users() {
        return userService.getAllUsers();
    }
}