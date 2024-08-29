package com.example.entity;

import lombok.Data;

@Data
public class Comment {
    private Integer commentId;
    private String commentParent;
    private String commentTeacher;
    private String commentText;
    private String commentTime;
}
