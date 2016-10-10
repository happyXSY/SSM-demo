package com.ssm.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.RolesMapper;
import com.ssm.domain.Roles;
import com.ssm.service.RolesService;

@Service
public class RolesServiceImpl implements RolesService {

	@Autowired
	private RolesMapper rolesMapper;

	@Override
	public Set<String> getRoleById(Integer... rolesId) {
		Set<String> set = new HashSet<String>();
		for (Integer i : rolesId) {
			Roles r = rolesMapper.selectByPrimaryKey(i);
			set.add(r.getRole());
		}
		return set;
	}

}
