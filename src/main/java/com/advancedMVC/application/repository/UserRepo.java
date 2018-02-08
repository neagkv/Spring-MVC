package com.advancedMVC.application.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Kevin Neag
 */
public interface UserRepo {
    @Repository("userRepository")
    public interface UserRepository extends JpaRepository<User, Long> {
        User findByEmail(String email);
    }
}
