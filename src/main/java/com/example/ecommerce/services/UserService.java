package com.example.ecommerce.services;

import com.example.ecommerce.models.User;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    public List<User> getAllUsers() {
        return Arrays.asList(
                new User(1, "John Doe", "john@example.com"),
                new User(2, "Jane Smith", "jane@example.com")
        );
    }
}