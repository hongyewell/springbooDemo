package com.geekymv.springboot_demo.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.geekymv.springboot_demo.entity.User;

@Mapper
public interface SampleDao {
	
	User findByName(Integer id);
	
	Map<String, Object> findById(Integer id);

}
