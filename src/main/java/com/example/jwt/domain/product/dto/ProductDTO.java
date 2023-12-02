package com.example.jwt.domain.product.dto;

import com.example.jwt.core.generic.ExtendedDTO;

import java.util.UUID;

public class ProductDTO extends ExtendedDTO {

    private String name;

    private int price;

    public ProductDTO() {
    }

    public ProductDTO(UUID id, String name, int price) {
        super(id);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public ProductDTO setName(String name) {
        this.name = name;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public ProductDTO setPrice(int price) {
        this.price = price;
        return this;
    }
}
