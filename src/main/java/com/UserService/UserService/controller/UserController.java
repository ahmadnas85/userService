package com.UserService.UserService.controller;

import com.UserService.UserService.model.User;
import com.UserService.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/create")
    public void createUser(@RequestBody User user){
        userService.createUser(user);
    }
    @PostMapping("/update")
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }
    @DeleteMapping("/delete")
    public void deleteUserById(@RequestParam Long userId){
        userService.deleteUserById(userId);
    }
    @GetMapping("/get")
    public User getUserById(@RequestParam Long userId){
        return userService.getUserById(userId);
    }
}
