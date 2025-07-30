package me.dio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Define custom query methods if needed
    // For example, findByEmail(String email);
    // Note: JpaRepository provides basic CRUD operations out of the box    
}
