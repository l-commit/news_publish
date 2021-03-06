package com.ssm.dao;

import com.ssm.po.Category;

import java.util.List;

/*
 * 新闻类别DAO层接口
 */
public interface CategoryDao {
	//查询所有新闻类别
	public List<Category> selectCategoryList();
	//根据新闻类别ID查询新闻类别
	public Category getCategoryById(Integer categoryId);
}