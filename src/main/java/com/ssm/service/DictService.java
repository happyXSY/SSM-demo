package com.ssm.service;

import java.util.List;

import com.ssm.domain.Dict;

public interface DictService {

	int insertdict(Dict dict);

	Dict selectBydict(String parentCode, String code);

	List<Dict> findDicts(String parentCode);

}
