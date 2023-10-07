package com.UserService.UserService.service;

import com.UserService.UserService.model.User;

public interface UserService {
    void createUser(User user);
    void updateUser(User user);
    void deleteUserById(Long userId);
    User getUserById(Long userId);
}
