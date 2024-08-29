package com.example.controller;

import com.example.config.ApiResponse;
import com.example.entity.Comment;
import com.example.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/selectall")
    public ApiResponse<List<Comment>> selectAllComments3() {
        List<Comment> comments = commentService.selectAllComments2();
        return ApiResponse.success("成功得到所有评论：", comments);
    }

    @DeleteMapping("/{id}")
    public ApiResponse<String> deleteById(@PathVariable("id") Integer commentId) {
        try {
            int result = commentService.deleteCommentById2(commentId);
            if (result > 0) {
                return ApiResponse.success("成功删除评论的id为：" + commentId, null);
            } else {
                return ApiResponse.error("未找到评论id为" + commentId + "的评论");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ApiResponse.error("删除失败的评论id为：" + commentId);
        }
    }

    @PutMapping("/{id}")
    public ApiResponse<String> updateComment(@PathVariable("id") Integer commentId, @RequestBody Comment comment) {
        try {
//            comment.setCommentId(commentId); // 确保 ID 被设置
            int result = commentService.updateComment2(comment);
            if (result > 0) {
                return ApiResponse.success("成功更新评论的id为：" + commentId, null);
            } else {
                return ApiResponse.error("未找到评论id为" + commentId + "的评论");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ApiResponse.error("更新失败的评论id为：" + commentId);
        }
    }
}
