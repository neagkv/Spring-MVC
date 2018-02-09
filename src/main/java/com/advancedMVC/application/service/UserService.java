package com.advancedMVC.application.service;
import com.advancedMVC.application.model.Users;
import com.advancedMVC.application.repository.RoleRepository;
import com.advancedMVC.application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


/**
 * @author Kevin Neag
 */

@Service("userService")
public class UserService implements UserServiceInterface{

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private RoleRepository roleRepo;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public Users findUserByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    @Override
    public void saveUser(Users user) {

    }

}
