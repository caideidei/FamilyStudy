package com.example.entity;

import lombok.Data;

@Data
public class Order {

    private Integer orderId;
    private String orderParent;
    private String orderSubject;
    private String orderGrade;
    private String orderNote;
    private String teacherName;
    private Integer orderMoney;

}
