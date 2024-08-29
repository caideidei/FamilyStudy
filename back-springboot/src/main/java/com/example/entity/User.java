package com.example.entity;

import lombok.Data;

@Data
public class User {
    private Integer userId;
    private String userPhone;
    private String userPassword;
    private String userName;
    private String userPicture;
}
