package com.example.controller;

import com.example.config.ApiResponse;
import com.example.entity.Parent;
import com.example.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parent")
public class ParentController {

    @Autowired
    private ParentService parentService;

    @GetMapping("/selectall")
    public ApiResponse<List<Parent>> selectAllParents3() {
        List<Parent> parents = parentService.selectAllParents2();
        return ApiResponse.success("成功得到所有数据：",parents);
    }

    @DeleteMapping("/{parentId}")
    public ApiResponse<String> deleteParentById3(@PathVariable Integer parentId) {
        try{
            int i = parentService.deleteById2(parentId);
            if(i>0){
                return ApiResponse.success("成功删除id为："+parentId+"的信息",null);
            }else{
                return ApiResponse.error("未找到id为："+parentId+"的信息");
            }
        }catch (Exception e){
            e.printStackTrace();
            return ApiResponse.error("删除失败id为"+parentId+"的信息");
        }
    }

    @PutMapping("/{parentId}")
    public ApiResponse<String> updateParent3(@PathVariable Integer parentId, @RequestBody Parent parent) {
        try{
            int i = parentService.updateParent2(parent);
            if(i>0){
                return ApiResponse.success("成功修改id为："+parentId+"的信息",null);
            }else{
                return ApiResponse.error("未找到id为："+parentId+"的信息");
            }
        }catch (Exception e){
            e.printStackTrace();
            return ApiResponse.error("修改失败id为："+parentId+"的信息");
        }
    }
}
