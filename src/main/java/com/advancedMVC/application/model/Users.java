package com.advancedMVC.application.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Kevin Neag
 */

public class Users {
    @Repository("userRepository")
    public interface UserRepository extends JpaRepository<Users, Long> {
        Users findByEmail(String email);

    }
}

