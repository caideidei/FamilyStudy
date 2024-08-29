package com.example.mapper;

import com.example.entity.User;

public interface UserMapper {
    //登录根据电话来判断
    User selectByPhone1(String userPhone);

}
