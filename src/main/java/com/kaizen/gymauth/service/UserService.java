package com.kaizen.gymauth.service;

import com.kaizen.gymauth.model.User;
import com.kaizen.gymauth.persistence.dao.UserDao;
import java.util.List;

/**
 *
 * @author VakSF
 */
public class UserService {
    
    private final UserDao userDao = new UserDao();

    public UserService() {
        
    }
    
    public List<User> listUsers() {
        return this.userDao.readAll();
    }
    
}
