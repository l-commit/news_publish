package com.ssm.service;

import com.ssm.po.Role;

import java.util.List;

/*
 * 角色Service层接口
 */
public interface RoleService {
	public List<Role> findRoleList();
	public Role findRoleWithUsersByRoleId(Integer roleId);
}