package com.ssm.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.ResourcesMapper;
import com.ssm.domain.Resources;
import com.ssm.service.ResourcesService;

@Service
public class ResourcesServiceImpl implements ResourcesService {

	@Autowired
	private ResourcesMapper resourcesMapper;

	@Override
	public Set<String> getResourcesById(Integer... resourceid) {
		Set<String> set = new HashSet<String>();
		for (Integer i : resourceid) {
			Resources re = resourcesMapper.selectByPrimaryKey(i);
			set.add(re.getCode());
		}
		return set;
	}

}
