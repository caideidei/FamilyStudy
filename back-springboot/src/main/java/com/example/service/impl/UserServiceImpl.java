package com.example.service.impl;

import com.example.controller.UserController;
import com.example.entity.User;
import com.example.mapper.ParentMapper;
import com.example.mapper.TeacherMapper;
import com.example.mapper.UserMapper;
import com.example.service.ParentService;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private TeacherMapper teacherMapper;

    @Resource
    private ParentMapper parentMapper;

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

    @Override
    public int insertUser2(UserController.RegisterRequest registerRequest) {
        if ("教师".equals(registerRequest.getRole())) {
            // 将教师数据插入到教师表
            return teacherMapper.insertTeacher1(registerRequest);
        } else if ("家长".equals(registerRequest.getRole())) {
            // 将家长数据插入到家长表
            return parentMapper.insertParent1(registerRequest);
        }
        return 0;
    }

}
