package com.example.jwt.domain.product;

import com.example.jwt.core.generic.ExtendedAuditEntity;
import com.example.jwt.core.generic.ExtendedEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;


@Entity
@Table(name = "product")
public class Product extends ExtendedEntity {

    @Column(name = "name")
    private String name;


    @Column(name = "price")
    private int price;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "product_users",
            joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "users_id", referencedColumnName = "id")
    )

    private Set<Product> products = new HashSet<>();

    public Product() {
    }

    public Product(UUID id, String name, int price, Set<Product> products) {
        super(id);
        this.name = name;
        this.price = price;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Product setPrice(int price) {
        this.price = price;
        return this;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public Product setProducts(Set<Product> products) {
        this.products = products;
        return this;
    }
}
