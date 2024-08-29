package com.example.mapper;

import com.example.entity.Comment;

import java.util.List;

public interface CommentMapper {
    // 向前端返回 comment 表中所有数据
    List<Comment> selectAllComments1();

    // 根据 id 删除数据
    int deleteCommentById1(Integer commentId);

    // 更新信息
    int updateComment1(Comment comment);
}
