package com.UserService.UserService.repository;

import com.UserService.UserService.model.User;

public interface UserRepository {
    void createUser(User user);
    void updateUser(User user);
    void deleteUserById(Long userId);
    User getUserById(Long userId);
}
