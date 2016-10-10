package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UsersMapper;
import com.ssm.domain.Users;
import com.ssm.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersMapper usersMapper;

	@Override
	public Users getUserByName(String username) {
		return usersMapper.getUserByName(username);
	}

}
