package com.example.controller;


import com.example.config.ApiResponse;
import com.example.entity.Manager;
import com.example.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @GetMapping("/selectall")
    public ApiResponse<List<Manager>> selectAllManagers3(){
        List<Manager> managers = managerService.selectAllManagers2();
        return ApiResponse.success("成功得到所有数据：",managers);
    }

    @DeleteMapping("/{managerId}")
    public ApiResponse<String> deleteManagerById(@PathVariable Integer managerId){
        try{
            int i = managerService.deleteManagerById2(managerId);
            if(i>0){
                return ApiResponse.success("成功删除id为："+managerId+"的信息",null);
            }else{
                return ApiResponse.error("未找到id为："+managerId+"的信息");
            }
        }catch (Exception e){
            e.printStackTrace();
            return ApiResponse.error("删除失败id为："+managerId+"的信息");
        }
    }

    @PutMapping("/{managerId}")
    public ApiResponse<String> updateManager3(@PathVariable Integer managerId,@RequestBody Manager manager){
        try{
            int i = managerService.updateManager(manager);
            if(i>0){
                return ApiResponse.success("成功修改id为："+managerId+"的信息",null);
            }else{
                return ApiResponse.error("未找到id为："+managerId+"的信息");
            }
        }catch (Exception e){
            e.printStackTrace();
            return ApiResponse.error("修改失败id为："+managerId+"的信息");
        }
    }


}
