package com.yuanzh.spring.boot.blog.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuanzh.spring.boot.blog.domain.Comment;
import com.yuanzh.spring.boot.blog.repository.CommentRepository;

/**
 * Comment Service接口实现.
 * 
 * @since 1.0.0 2017年6月6日
 * @author <a href="https://yuanzh.com">Yuan Zh</a>
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;
    
	@Override
	public Optional<Comment> getCommentById(Long id) {
		return commentRepository.findById(id);
	}

	@Override
	public void removeComment(Long id) {
		commentRepository.deleteById(id);
	}

}
