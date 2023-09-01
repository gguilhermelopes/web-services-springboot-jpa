package com.gguilhermelopes.webservices.repositories;

import com.gguilhermelopes.webservices.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
