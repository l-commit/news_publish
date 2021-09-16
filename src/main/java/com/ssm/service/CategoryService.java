package com.ssm.service;

import com.ssm.po.Category;

import java.util.List;

/*
 * 新闻类别Service层接口
 */
public interface CategoryService {
	public List<Category> findCategoryList();
	public Category findCategoryById(Integer categoryId);
}