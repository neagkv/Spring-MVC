package com.advancedMVC.application.repository;

import com.advancedMVC.application.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Kevin Neag
 */
public interface UserRepo {
    @Repository("userRepository")
    public interface UserRepository extends JpaRepository<Users, Long> {

        Users findByEmail(String email);
    }
}
