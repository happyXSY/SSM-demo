package com.ssm.domain;

import java.io.Serializable;
import java.util.Date;

public class Resources implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column sys_resources.id
	 * 
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column sys_resources.name
	 * 
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column sys_resources.type
	 * 
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	private Short type;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column sys_resources.url
	 * 
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	private String url;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column sys_resources.parent_id
	 * 
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	private Integer parentId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column sys_resources.parent_ids
	 * 
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	private String parentIds;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column sys_resources.code
	 * 
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	private String code;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column sys_resources.createTime
	 * 
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column sys_resources.available
	 * 
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	private Short available;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database table sys_resources
	 * 
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column sys_resources.id
	 * 
	 * @return the value of sys_resources.id
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column sys_resources.id
	 * 
	 * @param id
	 *            the value for sys_resources.id
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column sys_resources.name
	 * 
	 * @return the value of sys_resources.name
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column sys_resources.name
	 * 
	 * @param name
	 *            the value for sys_resources.name
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column sys_resources.type
	 * 
	 * @return the value of sys_resources.type
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	public Short getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column sys_resources.type
	 * 
	 * @param type
	 *            the value for sys_resources.type
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	public void setType(Short type) {
		this.type = type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column sys_resources.url
	 * 
	 * @return the value of sys_resources.url
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column sys_resources.url
	 * 
	 * @param url
	 *            the value for sys_resources.url
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column sys_resources.parent_id
	 * 
	 * @return the value of sys_resources.parent_id
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	public Integer getParentId() {
		return parentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column sys_resources.parent_id
	 * 
	 * @param parentId
	 *            the value for sys_resources.parent_id
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column sys_resources.parent_ids
	 * 
	 * @return the value of sys_resources.parent_ids
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	public String getParentIds() {
		return parentIds;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column sys_resources.parent_ids
	 * 
	 * @param parentIds
	 *            the value for sys_resources.parent_ids
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column sys_resources.code
	 * 
	 * @return the value of sys_resources.code
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	public String getCode() {
		return code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column sys_resources.code
	 * 
	 * @param code
	 *            the value for sys_resources.code
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column sys_resources.createTime
	 * 
	 * @return the value of sys_resources.createTime
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column sys_resources.createTime
	 * 
	 * @param createTime
	 *            the value for sys_resources.createTime
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column sys_resources.available
	 * 
	 * @return the value of sys_resources.available
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	public Short getAvailable() {
		return available;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column sys_resources.available
	 * 
	 * @param available
	 *            the value for sys_resources.available
	 * @mbggenerated Thu Aug 25 17:46:27 CST 2016
	 */
	public void setAvailable(Short available) {
		this.available = available;
	}
}