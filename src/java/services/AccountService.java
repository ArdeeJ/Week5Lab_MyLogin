package services;

import models.User;

/**
 *
 * @author ardee
 */
public class AccountService {
    public User login(String username, String password){
        if (username.equals("abe") || username.equals("barb") && password.equals("password")) {
            User user = new User(username, password);
            user.setPassword("");
            return user;
        } else {
            return null;
        } 
    }
}

