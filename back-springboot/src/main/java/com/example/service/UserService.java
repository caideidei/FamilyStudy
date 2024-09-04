package com.example.service;

import com.example.controller.UserController;
import com.example.entity.User;

public interface UserService {

    User selectByPhone2(String userPhone);

    //比较用户输入的密码和数据库中的密码
    boolean checkPassword(String rawPassword, String storedPassword);

    int insertUser2(UserController.RegisterRequest registerRequest);

    boolean checkPhoneRegistered(String userPhone);
}
