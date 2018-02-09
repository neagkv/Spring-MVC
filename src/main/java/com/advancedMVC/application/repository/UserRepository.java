package com.advancedMVC.application.repository;

import com.advancedMVC.application.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Kevin Neag
 */
@Repository("userRepo")
public interface UserRepository extends JpaRepository<Users, Long> {
        Users findByEmail(String email);
    }

