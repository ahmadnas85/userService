package com.UserService.UserService.repository.mapper;

import com.UserService.UserService.model.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User(
                rs.getLong("user_id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("user_email"),
                rs.getInt("user_age"),
                rs.getString("user_address"),
                rs.getDate("user_joining_date").toLocalDate(),
                rs.getBoolean("registration_status")
                );
        return user;
    }
}
