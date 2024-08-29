package com.example.service.impl;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User selectByPhone2(String userPhone) {
        User user = userMapper.selectByPhone1(userPhone);
//        System.out.println("前端返回的手机号码："+userPhone);
        return user;
    }

    @Override
    public boolean checkPassword(String rawPassword, String storedPassword) {
//        System.out.println("前端返回的密码："+rawPassword+",后端中的密码："+storedPassword);
        return rawPassword.equals(storedPassword);
    }

//    @Override
//    public User selectById2(Integer userId) {
//        User user = userMapper.selectById1(userId);
//        return user;
//    }
}
