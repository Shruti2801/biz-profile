package com.example.bizprofile.controller;

import com.example.bizprofile.entity.User;
import com.example.bizprofile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userservice;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return userservice.createUser(user);
    }
    @PostMapping("/addUsers")
    public List<User> addUsers(@RequestBody List<User> users){
        return userservice.createUsers(users);
    }
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id){
        return  userservice.getUserById(id);
    }
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userservice.getUsers();
    }
    @PutMapping("/updateuser")
    public User updateUser(User user){
        return userservice.updateUser(user);
    }
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable int id){
        return userservice.deleteUserById(id);
    }


}
