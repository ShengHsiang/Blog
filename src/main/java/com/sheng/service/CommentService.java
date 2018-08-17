package com.sheng.service;

import com.sheng.po.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment (Comment comment);
}
