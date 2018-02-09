package com.advancedMVC.application.service;

import com.advancedMVC.application.model.Users;
import com.advancedMVC.application.repository.RoleRepo;
import com.advancedMVC.application.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Kevin Neag
 */
public interface UserServiceInterface {

    @Autowired
    UserRepo userRepos;

    @Autowired
    RoleRepo roleRepo;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public Users findUserByEmail(String email) {
        return userRepo.findByEmail(email);
    }

}
