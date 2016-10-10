package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.DictMapper;
import com.ssm.domain.Dict;
import com.ssm.service.DictService;

@Service("DictService")
public class DictServiceImpl implements DictService {
	@Autowired
	private DictMapper dictMapper;

	@Override
	public int insertdict(Dict dict) {
		return dictMapper.insertSelective(dict);
	}

	@Override
	public Dict selectBydict(String parentCode, String code) {
		return dictMapper.selectByPCodeAndCode(parentCode, code);
	}

	@Override
	public List<Dict> findDicts(String parentCode) {
		return dictMapper.findByPcode(parentCode);
	}

}
