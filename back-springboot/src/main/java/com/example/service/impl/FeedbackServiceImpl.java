package com.example.service.impl;

import com.example.entity.Feedback;
import com.example.mapper.FeedbackMapper;
import com.example.service.FeedbackService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Resource
    private FeedbackMapper feedbackMapper;
//
//    @Override
//    public Feedback getFeedbackById(Integer feedbackId) {
//        return feedbackMapper.selectFeedbackById(feedbackId);
//    }

    @Override
    public List<Feedback> selectAllFeedbacks2() {
        return feedbackMapper.selectAllFeedbacks1();
    }

    @Override
    public int updateFeedback2(Feedback feedback) {
        if (feedback.getFeedbackTime() == null) {
            feedback.setFeedbackTime(String.valueOf(LocalDateTime.now()));
        }
        return feedbackMapper.updateFeedback1(feedback);
    }

    @Override
    public int deleteFeedbackById2(Integer feedbackId) {
        return feedbackMapper.deleteFeedbackById1(feedbackId);
    }

    @Override
    public int insertFeedback2(Feedback feedback) {
        if(feedback.getFeedbackTime()==null){
            feedback.setFeedbackTime(String.valueOf(LocalDateTime.now()));
        }
        int i = feedbackMapper.insertFeedback1(feedback);
        return i;
    }
}
