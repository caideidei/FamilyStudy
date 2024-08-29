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
            if (user.getUserRole().equals(loginRequest.getRole())){
                return ResponseEntity.ok(ApiResponse.success("登录成功",user));
            }else {
                return ResponseEntity.status(401).body(ApiResponse.error("角色不匹配"));
            }
        } else {
            return ResponseEntity.status(401).body(ApiResponse.error("登录失败,密码错误"));
        }
    }

    @PostMapping("/register")
    public ResponseEntity<ApiResponse<?>> register(@RequestBody RegisterRequest registerRequest) {
        int success = userService.insertUser2(registerRequest);
        if (success>0) {
            return ResponseEntity.ok(ApiResponse.success("注册成功",null));
        } else {
            return ResponseEntity.status(400).body(ApiResponse.error("注册失败"));
        }
    }

    // 登录请求的内部类
    @Data
    public static class LoginRequest {
        private String phoneNumber;
        private String password;
        private String role;
    }

    @Data
    public static class RegisterRequest {
        private String name;
        private String phone;
//        private String email;
        private String password;
        private String role;
    }


}
