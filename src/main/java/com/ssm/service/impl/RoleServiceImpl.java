package com.ssm.service.impl;

import com.ssm.dao.RoleDao;
import com.ssm.po.Role;
import com.ssm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("roleService")
/*
 * 角色Service接口实现类
 */
public class RoleServiceImpl implements RoleService {
	//注入RoleDao
	@Autowired
	private RoleDao roleDao;
	@Override
	public List<Role> findRoleList() {
		List<Role> roleList=roleDao.selectRoleList();
		return roleList;
	}
	@Override
	public Role findRoleWithUsersByRoleId(Integer roleId) {
		Role role=roleDao.selectRoleWithUsers(roleId);
		return role;
	}
}
