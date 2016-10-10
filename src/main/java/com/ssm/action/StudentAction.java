package com.ssm.action;

import java.io.IOException;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.apache.struts2.convention.annotation.Action;

import com.ssm.domain.Student;
import com.ssm.domain.Users;

@Action
public class StudentAction {

	private Long name = 100001l;
	private Student student;
	private Users users;

	public String login() {
		return "success";
	}

	public String tologin() {
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(users.getUsername(), users.getPassword());
		try {
			subject.login(token);
		} catch (AuthenticationException e) {
			e.printStackTrace();
			return "unsuccess";
		}
		return "success";
	}

	public String logout() {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return "success";
	}

	public String admin() {
		return "success";
	}

	@RequiresRoles(value = { "admin" })
	public String helloSSM() {
		System.out.println("HELLOSSM!!!");
		name = System.currentTimeMillis();
		return "success";
	}

	public String student() throws IOException {
		System.out.println("student");
		student = new Student();
		student.setId(100);
		student.setName("合肥");
		return "json";
	}

	public Long getName() {
		return name;
	}

	public void setName(Long name) {
		this.name = name;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

}
