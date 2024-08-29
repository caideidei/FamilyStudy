package com.example.mapper;

import com.example.entity.Order;

import java.util.List;

public interface OrderMapper {

    //传order表中的所有值给前端
    List<Order> selectAllOrders1();

    //根据id删除一行数据
    int deleteById1(Integer orderId);

    int updateOrder1(Order order);

}
