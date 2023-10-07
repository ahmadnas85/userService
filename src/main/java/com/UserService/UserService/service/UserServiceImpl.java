package com.UserService.UserService.service;

import com.UserService.UserService.controller.AnswerController;
import com.UserService.UserService.model.User;
import com.UserService.UserService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private AnswerController answerController;
    @Autowired
    private UserRepository userRepository;

    @Override
    public void createUser(User user) {
        userRepository.createUser(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    @Override
    public void deleteUserById(Long userId) {
        answerController.deleteAnsweredQuestionByUserId(userId);
        userRepository.deleteUserById(userId);
    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.getUserById(userId);
    }
}
