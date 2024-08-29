package com.example.controller;
//登录验证类

import com.example.config.ApiResponse;
import com.example.entity.User;
import com.example.service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<ApiResponse<?>> login(@RequestBody LoginRequest loginRequest) {
        User user = userService.selectByPhone2(loginRequest.getPhoneNumber());
        if (user != null && userService.checkPassword(loginRequest.getPassword(), user.getUserPassword())) {
            return ResponseEntity.ok(ApiResponse.success("登录成功",user));
        } else {
            return ResponseEntity.status(401).body(ApiResponse.error("登录失败"));
        }
    }

    // 登录请求的内部类
    @Data
    public static class LoginRequest {
        private String phoneNumber;
        private String password;
    }

//    @GetMapping("/profile")
//    public ResponseEntity<ApiResponse<?>> getUserProfile(@RequestParam Integer userId) {
//        User user = userService.selectById2(userId);
//        if (user != null) {
//            return ResponseEntity.ok(ApiResponse.success("获取用户信息成功", user));
//        } else {
//            return ResponseEntity.status(404).body(ApiResponse.error("未找到用户"));
//        }
//    }

}
