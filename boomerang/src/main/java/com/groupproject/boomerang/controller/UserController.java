//package com.groupproject.boomerang.controller;
//
//
//
//import com.groupproject.boomerang.model.Response;
//import com.groupproject.boomerang.model.entity.User;
//import com.groupproject.boomerang.service.UserService;
//import org.apache.http.HttpStatus;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//public class UserController {
//    @Autowired
//    UserService userService;
//
//    @RequestMapping(value = "/user/registration", method = RequestMethod.POST)
//    public Response<String> register(@RequestBody User user) {
//        Response<String> response = new Response<String>() {};
//        if (userService.addUser(user)) {
//            response.responsebody = "Successfully registered";
//            response.statusCode = HttpStatus.SC_OK;
//        } else {
//            response.responsebody = "User already exists";
//            response.statusCode = HttpStatus.SC_NOT_ACCEPTABLE;
//        }
//        return response;
//    }
//
//    @RequestMapping("/user/login")
//    public Response<String> login(@RequestBody User user) {
//        Response<String> response = new Response<String>() {};
//        response.responsebody = userService.verifyLogin(user);
//        response.statusCode = HttpStatus.SC_OK;
//        return response;
//    }
//
//}
