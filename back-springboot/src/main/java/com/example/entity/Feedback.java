package com.example.entity;

import lombok.Data;

@Data
public class Feedback {
    private Integer feedbackId;
    private String feedbackPerson;
    private String feedbackRole;
    private String feedbackText;
    private String feedbackTime;
}
