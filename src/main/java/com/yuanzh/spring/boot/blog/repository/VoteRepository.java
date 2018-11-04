package com.yuanzh.spring.boot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuanzh.spring.boot.blog.domain.Vote;

/**
 * Vote Repository接口.
 * @since 1.0.0 2017年6月6日
 * @author <a href="https://yuanzh.com">Yuan Zh</a>
 */
public interface VoteRepository extends JpaRepository<Vote, Long> {
	
}
