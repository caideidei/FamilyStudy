package com.example.controller;

import com.example.config.ApiResponse;
import com.example.entity.Notice;
import com.example.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notice")
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @GetMapping("/selectall")
    public ApiResponse<List<Notice>> selectAllNotices3(){
        List<Notice> notices = noticeService.selectAllNotices2();
        return ApiResponse.success("成功得到所有数据：",notices);
    }

    @DeleteMapping("/{id}")//@PathVariable("id")会读取上面的数据
    public ApiResponse<String> deleteById2(@PathVariable("id") Integer NoticeId) {
        try{
            int i = noticeService.deleteById2(NoticeId);
            if(i>0){
                return ApiResponse.success("成功删除信息的id为："+NoticeId,null);
            }else{
                return ApiResponse.error("未找到信息id为"+NoticeId+"的信息");
            }

        }catch (Exception e){
            e.printStackTrace();
            return ApiResponse.error("删除失败的信息id为："+NoticeId);
        }
    }

    @PutMapping("/{id}")
    public ApiResponse<String> updateNotice3(@PathVariable("id") Integer noticeId, @RequestBody Notice notice) {
        try {
            int i = noticeService.updateNotice2(notice);
            if (i > 0) {
                return ApiResponse.success("成功更新信息的id为：" + noticeId, null);
            } else {
                return ApiResponse.error("未找到信息id为" + noticeId + "的信息");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ApiResponse.error("更新失败的信息id为：" + noticeId);
        }
    }

}
