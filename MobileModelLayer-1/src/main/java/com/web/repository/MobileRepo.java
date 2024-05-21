package com.web.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Mobile;

@Repository
public interface MobileRepo extends CrudRepository<Mobile,Long> {
	

}
