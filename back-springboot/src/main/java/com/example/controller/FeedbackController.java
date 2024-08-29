package com.example.controller;

import com.example.config.ApiResponse;
import com.example.entity.Feedback;
import com.example.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

//    @GetMapping("/{id}")
//    public ApiResponse<Feedback> getFeedbackById(@PathVariable("id") Integer feedbackId) {
//        Feedback feedback = feedbackService.getFeedbackById(feedbackId);
//        if (feedback != null) {
//            return ApiResponse.success("成功获取反馈", feedback);
//        } else {
//            return ApiResponse.error("未找到反馈 ID 为 " + feedbackId + " 的反馈");
//        }
//    }

    @GetMapping("/selectall")
    public ApiResponse<List<Feedback>> selectAllFeedbacks3() {
        List<Feedback> feedbacks = feedbackService.selectAllFeedbacks2();
        return ApiResponse.success("成功获取所有反馈", feedbacks);
    }

    @PutMapping("/{id}")
    public ApiResponse<String> updateFeedback3(@PathVariable("id") Integer feedbackId, @RequestBody Feedback feedback) {
        try {
//            feedback.setFeedbackId(feedbackId); // 确保 ID 被设置
            feedbackService.updateFeedback2(feedback);
            return ApiResponse.success("成功更新反馈的Id为:" + feedbackId, null);
        } catch (Exception e) {
            e.printStackTrace();
            return ApiResponse.error("更新反馈失败Id为:" + feedbackId);
        }
    }

    @DeleteMapping("/{id}")
    public ApiResponse<String> deleteFeedback3(@PathVariable("id") Integer feedbackId) {
        try {
            feedbackService.deleteFeedbackById2(feedbackId);
            return ApiResponse.success("成功删除反馈 ID 为 " + feedbackId, null);
        } catch (Exception e) {
            e.printStackTrace();
            return ApiResponse.error("删除反馈失败 ID 为 " + feedbackId);
        }
    }

    @PostMapping("/insert")
    public ApiResponse<String> insertFeedback3(@RequestBody Feedback feedback) {
        try {
            int i = feedbackService.insertFeedback2(feedback);
            if(i>0){
                return ApiResponse.success("成功添加反馈", null);
            }else{
                return ApiResponse.error("添加反馈失败1！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ApiResponse.error("添加反馈失败2！");
        }
    }
}
