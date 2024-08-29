package com.example.controller;


import com.example.config.ApiResponse;
import com.example.entity.Teacher;
import com.example.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

//    @CrossOrigin(origins = "http://localhost:8081")//解决跨域问题
    @GetMapping("/selectall")
    public ApiResponse<List<Teacher>> selectAllTeachers3(){
        List<Teacher> teachers = teacherService.selectAllTeachers2();
        return ApiResponse.success("成功得到所有数据",teachers);
    }

    @DeleteMapping("/{id}")
    public ApiResponse<String> deleteById3(@PathVariable("id") Integer teacherId){
        try{
            int i = teacherService.deleteById2(teacherId);
            if(i>0){
                return ApiResponse.success("成功删除的数据id为："+teacherId,null);
            }else{
                return ApiResponse.error("未找到id为："+teacherId+"的信息");
            }
        }catch (Exception e){
            e.printStackTrace();
            return ApiResponse.error("删除失败的数据id为："+teacherId);
        }
    }

    @PutMapping("/{teacherId}")
    public ApiResponse<String> updateTeacher3(@PathVariable Integer teacherId,@RequestBody Teacher teacher){
        try{
            int i = teacherService.updateTeacher2(teacher);
            if(i>0){
                return ApiResponse.success("成功修改id为："+teacherId+"的信息",null);
            }else{
                return ApiResponse.error("未找到id为："+teacherId+"的信息");
            }
        }catch (Exception e){
            e.printStackTrace();
            return ApiResponse.error("修改失败id为："+teacherId+"的信息");
        }
    }

}
