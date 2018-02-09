package com.advancedMVC.application.service;

import com.advancedMVC.application.model.Users;


/**
 * @author Kevin Neag
 */
public interface UserServiceInterface {

    public Users findUserByEmail(String email);
    public void saveUser(Users user);


}
