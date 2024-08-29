package com.example.mapper;

import com.example.entity.Feedback;

import java.util.List;

public interface FeedbackMapper {
    // 向前端返回 feedback 表中所有数据
    List<Feedback> selectAllFeedbacks1();

    // 根据 id 删除数据
    int deleteFeedbackById1(Integer feedbackId);

    // 更新信息
    int updateFeedback1(Feedback feedback);

    // 插入信息
    int insertFeedback1(Feedback feedback);
}
