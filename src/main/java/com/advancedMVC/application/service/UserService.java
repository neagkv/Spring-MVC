package com.advancedMVC.application.service;

import com.advancedMVC.application.model.Role;
import com.advancedMVC.application.model.Users;
import com.advancedMVC.application.repository.RoleRepo;
import com.advancedMVC.application.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
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







}
