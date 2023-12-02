package com.example.jwt.domain.product;

import com.example.jwt.core.generic.ExtendedService;
import com.example.jwt.domain.user.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.UUID;

public interface ProductService extends ExtendedService<Product> {
    Product exerciseOne(UUID id);

}
