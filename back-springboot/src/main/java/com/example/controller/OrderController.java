package com.example.controller;


import com.example.config.ApiResponse;
import com.example.entity.Order;
import com.example.service.OrderService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    //向前端返回所有数据
    @GetMapping("/selectall")
    public ApiResponse<List<Order>> selectAllOrders3(){
        List<Order> orders = orderService.selectAllOrders2();
        return ApiResponse.success("成功得到所有数据",orders);
    }

    //根据id删除一行数据
    @DeleteMapping("/{id}")
    public ApiResponse<String> deleteById3(@PathVariable("id") Integer orderId){
        try{
            int i = orderService.deleteById2(orderId);
            if(i>0){
                return ApiResponse.success("成功删除的数据id为："+orderId,null);
            }else{
                return ApiResponse.error("未找到id为："+orderId+"的数据");
            }
        }catch (Exception e){
            e.printStackTrace();
            return ApiResponse.error("删除失败id为"+orderId+"的数据");
        }
    }

}
