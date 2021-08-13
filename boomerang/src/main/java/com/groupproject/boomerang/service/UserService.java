//package com.groupproject.boomerang.service;
//
//import com.groupproject.boomerang.dao.UserDao;
//import com.groupproject.boomerang.model.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService {
//    @Autowired
//    UserDao userDao;
//
//    public boolean addUser(User user) {
//        user.setEnabled(true);
//
//        try {
//            userDao.addUser(user);
//        } catch (Exception e) {
//            return false;
//        }
//        return true;
//    }
//
//    public User getUserById(long id) { return userDao.getUserById(id); }
//
//    public String verifyLogin (User user) {
//        User queriedUser = userDao.getUserById(user.getId());
//        if (queriedUser == null) {
//            return "The User doesn't exists";
//        }
//        return queriedUser.getPassword().equals(user.getPassword()) ? "Successfully logged in" : "Incorrect Passward";
//    }
//}
