package com.gguilhermelopes.webservices.repositories;

import com.gguilhermelopes.webservices.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
