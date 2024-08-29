package com.example.service.impl;

import com.example.entity.Comment;
import com.example.mapper.CommentMapper;
import com.example.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentMapper commentMapper;

    @Override
    public List<Comment> selectAllComments2() {
        return commentMapper.selectAllComments1();
    }

    @Override
    public int deleteCommentById2(Integer commentId) {
        return commentMapper.deleteCommentById1(commentId);
    }

    @Override
    public int updateComment2(Comment comment) {
        if (comment.getCommentTime() == null) {
            comment.setCommentTime(String.valueOf(LocalDateTime.now()));
        }
        return commentMapper.updateComment1(comment);
    }
}
