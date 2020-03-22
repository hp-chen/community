package com.community.mapper;

import com.community.model.Comment;
import com.community.model.CommentExample;
import com.community.model.Question;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentExtMapper {
    void incCommentCount(Comment comment);
}