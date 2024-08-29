package com.example.service;

import com.example.entity.User;

public interface UserService {

    User selectByPhone2(String userPhone);

    //比较用户输入的密码和数据库中的密码
    boolean checkPassword(String rawPassword, String storedPassword);

//    User selectById2(Integer userId);
}
