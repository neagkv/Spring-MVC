package com.advancedMVC.application.repository;


import com.advancedMVC.application.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Kevin Neag
 */

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {

    // Hibernate automates the following SQL query:
    User findByEmail(String email);
}