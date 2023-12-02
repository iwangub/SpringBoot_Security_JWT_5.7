package com.example.jwt.domain.product;


import com.example.jwt.domain.product.dto.ProductDTO;
import com.example.jwt.domain.product.dto.ProductMapper;
import com.example.jwt.domain.user.User;
import com.example.jwt.domain.user.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
@Validated
public class ProductController {

    private final ProductService productService;
    private final ProductMapper productMapper;


    @Autowired
    public ProductController(ProductService productService, ProductMapper productMapper) {
        this.productService = productService;
        this.productMapper = productMapper;
    }

    @GetMapping({"", "/"})
    public ResponseEntity<List<UserDTO>> retrieveAll() {
        return null;
    }

    @GetMapping("/1/{id}")
    public ResponseEntity<ProductDTO> retrieveById(@PathVariable UUID id) {
        Product product = productService.exerciseOne(id);
        return new ResponseEntity<>(productMapper.toDTO(product), HttpStatus.OK);

    }


}
