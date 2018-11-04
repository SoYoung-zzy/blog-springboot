package com.yuanzh.spring.boot.blog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuanzh.spring.boot.blog.domain.Catalog;
import com.yuanzh.spring.boot.blog.domain.User;
import com.yuanzh.spring.boot.blog.repository.CatalogRepository;

/**
 * Catalog 服务接口实现.
 * 
 * @since 1.0.0 2017年6月7日
 * @author <a href="https://yuanzh.com">Yuan Zh</a>
 */
@Service
public class CatalogServiceImpl implements CatalogService {
	@Autowired
	private CatalogRepository catalogRepository;
	
	@Override
	public Catalog saveCatalog(Catalog catalog) {
		 // 判断重复
        List<Catalog> list = catalogRepository.findByUserAndName(catalog.getUser(),
        		catalog.getName());
        if(list !=null && list.size() > 0) {
            throw new IllegalArgumentException("该分类已经存在了");
        }
        return catalogRepository.save(catalog);
	}
	
	@Override
	public void removeCatalog(Long id) {
		catalogRepository.deleteById(id);
	}

	@Override
	public Optional<Catalog> getCatalogById(Long id) {
		return catalogRepository.findById(id);
	}

	@Override
	public List<Catalog> listCatalogs(User user) {
		return catalogRepository.findByUser(user);
	}

}
