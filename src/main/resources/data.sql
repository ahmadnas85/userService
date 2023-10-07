CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(300) NOT NULL DEFAULT '',
    last_name VARCHAR(300) NOT NULL DEFAULT '',
    user_email VARCHAR(300) NOT NULL DEFAULT '',
    user_age INT NOT NULL,
    user_address VARCHAR(300) NOT NULL DEFAULT '',
    user_joining_date DATE,
    registration_status BOOLEAN
);