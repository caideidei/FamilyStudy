package com.example.service;

import com.example.entity.Order;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface OrderService {

    List<Order> selectAllOrders2();

    int deleteById2(Integer orderId);

    int updateOrder2(Order order);

}
