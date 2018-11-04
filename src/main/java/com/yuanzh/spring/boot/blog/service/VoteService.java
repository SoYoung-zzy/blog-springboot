package com.yuanzh.spring.boot.blog.service;

import java.util.Optional;

import com.yuanzh.spring.boot.blog.domain.Vote;

/**
 * Vote 服务接口.
 * 
 * @since 1.0.0 2017年4月9日
 * @author <a href="https://yuanzh.com">Yuan Zh</a>
 */
public interface VoteService {
	/**
	 * 根据id获取 Vote
	 * @param id
	 * @return
	 */
	Optional<Vote> getVoteById(Long id);
	/**
	 * 删除Vote
	 * @param id
	 * @return
	 */
	void removeVote(Long id);
}
