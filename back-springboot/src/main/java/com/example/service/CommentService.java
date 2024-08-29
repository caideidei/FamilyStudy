package com.example.service;

import com.example.entity.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> selectAllComments2();

    int deleteCommentById2(Integer commentId);

    int updateComment2(Comment comment);
}
