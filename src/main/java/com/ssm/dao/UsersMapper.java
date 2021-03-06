package com.ssm.dao;

import org.apache.ibatis.annotations.Param;

import com.ssm.domain.Users;

public interface UsersMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sys_users
	 * 
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sys_users
	 * 
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	int insert(Users record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sys_users
	 * 
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	int insertSelective(Users record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sys_users
	 * 
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	Users selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sys_users
	 * 
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	int updateByPrimaryKeySelective(Users record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sys_users
	 * 
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	int updateByPrimaryKey(Users record);

	Users getUserByName(@Param("username") String username);
}