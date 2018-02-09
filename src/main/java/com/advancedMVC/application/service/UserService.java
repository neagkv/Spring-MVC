package com.advancedMVC.application.service;

import com.advancedMVC.application.model.Role;
import com.advancedMVC.application.model.Users;
import com.advancedMVC.application.repository.RoleRepo;
import com.advancedMVC.application.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Kevin Neag
 */

@Service("userService")
public class UserService implements UserServiceInterface{

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RoleRepo roleRepo;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public Users findUserByEmail(String email) {
        return userRepo.findByEmail(email);
    }



    @Override
    public void saveUser(Users users) {
        users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
        users.setActive(1);
        Role userRole = roleRepo.findByRole("ADMIN");
        users.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        userRepo.save(users);
    }


}
