package com.example.service.impl;

import com.example.entity.Order;
import com.example.mapper.OrderMapper;
import com.example.service.OrderService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

//    @Autowired//这里使用会报错，显示无法装配
    @Resource
    private OrderMapper orderMapper;

    @Override
    public List<Order> selectAllOrders2() {
        List<Order> orders = orderMapper.selectAllOrders1();
        return orders;
    }

    @Override
    public int deleteById2(Integer orderId) {
        int i = orderMapper.deleteById1(orderId);
        return i;
    }

    @Override
    public int updateOrder2(Order order) {
        int i = orderMapper.updateOrder1(order);
        return i;
    }

}
