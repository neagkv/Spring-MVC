package com.advancedMVC.application.service;
import org.apache.catalina.User;


/**
 * @author Kevin Neag
 */

public interface UserService {

    public User findUserByEmail(String email);
    public void saveUser(User user);

}
