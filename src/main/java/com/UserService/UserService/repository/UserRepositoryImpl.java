package com.UserService.UserService.repository;

import com.UserService.UserService.model.User;
import com.UserService.UserService.repository.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private static final String USERS_TABLE_NAME = "users";
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserMapper userMapper;

    @Override
    public void createUser(User user) {
        String sql = "INSERT INTO " + USERS_TABLE_NAME + " (first_name, last_name, user_email, user_age, user_address, user_joining_date, registration_status) VALUES (?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(
                sql,
                user.getFirstName(),
                user.getLastName(),
                user.getUserEmail(),
                user.getUserAge(),
                user.getUserAddress(),
                user.getUserJoiningDate(),
                user.getRegStatus()
        );
    }

    @Override
    public void updateUser(User user) {
        String sql = "UPDATE " + USERS_TABLE_NAME + " SET first_name = ?, last_name = ?, user_email = ?, user_age = ?, user_address = ?, user_joining_date = ?, registration_status = ? WHERE user_id = ?";
        jdbcTemplate.update(
                sql,
                user.getFirstName(),
                user.getLastName(),
                user.getUserEmail(),
                user.getUserAge(),
                user.getUserAddress(),
                user.getUserJoiningDate(),
                user.getRegStatus(),
                user.getUserId()
        );
    }

    @Override
    public void deleteUserById(Long userId) {
        String sql = "DELETE FROM " + USERS_TABLE_NAME + " WHERE user_id = ?";
        jdbcTemplate.update(
                sql,
                userId
        );
    }

    @Override
    public User getUserById(Long userId) {
        try {
            String sql = "SELECT * FROM " + USERS_TABLE_NAME + " WHERE user_id = ?";
            return jdbcTemplate.queryForObject(
                    sql,
                    userMapper,
                    userId
            );
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

}
