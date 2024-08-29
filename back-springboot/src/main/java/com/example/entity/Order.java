package com.example.entity;

import lombok.Data;

@Data
public class Order {

    private Integer orderId;
    private String orderParent;
    private String orderSubject;
    private String orderGrade;
    private Integer orderMoney;
    private String orderTime;
    private String orderNote;
    private String orderTeacher;

}
