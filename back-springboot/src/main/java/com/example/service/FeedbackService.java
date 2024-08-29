package com.example.service;

import com.example.entity.Feedback;
import java.util.List;

public interface FeedbackService {

    // 根据 ID 查询反馈
//    Feedback getFeedbackById(Integer feedbackId);

    // 查询所有反馈
    List<Feedback> selectAllFeedbacks2();

    // 更新反馈
    int updateFeedback2(Feedback feedback);

    // 根据 ID 删除反馈
    int deleteFeedbackById2(Integer feedbackId);

    // 添加新的反馈
    int insertFeedback2(Feedback feedback);

}
