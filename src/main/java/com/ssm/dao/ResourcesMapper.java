package com.ssm.dao;

import com.ssm.domain.Resources;

public interface ResourcesMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sys_resources
	 * 
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sys_resources
	 * 
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	int insert(Resources record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sys_resources
	 * 
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	int insertSelective(Resources record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sys_resources
	 * 
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	Resources selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sys_resources
	 * 
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	int updateByPrimaryKeySelective(Resources record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sys_resources
	 * 
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	int updateByPrimaryKey(Resources record);
}