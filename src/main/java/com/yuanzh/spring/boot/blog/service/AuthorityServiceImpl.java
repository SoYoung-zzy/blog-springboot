/**
 * 
 */
package com.yuanzh.spring.boot.blog.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuanzh.spring.boot.blog.domain.Authority;
import com.yuanzh.spring.boot.blog.repository.AuthorityRepository;


/**
 * Authority 服务接口的实现.
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {

	@Autowired
	private AuthorityRepository authorityRepository;

	@Override
	public Optional<Authority> getAuthorityById(Long id) {
		return authorityRepository.findById(id);
	}

}
