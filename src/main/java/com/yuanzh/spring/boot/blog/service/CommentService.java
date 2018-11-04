package com.yuanzh.spring.boot.blog.service;

import java.util.Optional;

import com.yuanzh.spring.boot.blog.domain.Comment;

/**
 * Comment Service接口.
 * 
 * @since 1.0.0 2017年6月6日
 * @author <a href="https://yuanzh.com">Yuan Zh</a>
 */
public interface CommentService {

	/**
     * 根据id获取 Comment
     * @param id
     * @return
     */
	Optional<Comment> getCommentById(Long id);
    /**
     * 删除评论
     * @param id
     * @return
     */
    void removeComment(Long id);
}
