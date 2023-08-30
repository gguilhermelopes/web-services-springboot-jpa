package com.gguilhermelopes.webservices.repositories;

import com.gguilhermelopes.webservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
