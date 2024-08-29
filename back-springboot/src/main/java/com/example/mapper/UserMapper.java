package com.example.mapper;

import com.example.entity.User;

public interface UserMapper {
    //登录根据电话来判断
    User selectByPhone1(String userPhone);
    //根据id向前端显示当前用户
//    User selectById1(Integer userId);
}
