package com.ssm.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssm.domain.Users;
import com.ssm.service.UsersService;

/**
 * <pre>
 * Description
 * Copyright:	Copyright (c)2016  
 * Company:		jingqi
 * Author:		XuSY
 * Version:		1.0  
 * Created at:	2016年8月20日 下午2:47:55
 * </pre>
 */
@Component
public class Myrealm extends AuthorizingRealm {

	@Autowired
	private UsersService usersService;

	/**
	 * 授权
	 * 
	 * @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		if ("jim".equals(principals.getPrimaryPrincipal())) {
			info.addRole("admin");// admin不是shiro的保留字
			info.addStringPermission("user:view");
		}
		info.addRole("user");
		return info;
	}

	/**
	 * 认证
	 * 
	 * @see org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

		Object principal = token.getPrincipal();
		Users user = usersService.getUserByName(principal.toString());
		String credentials = null;
		if (user != null) {
			credentials = user.getPassword();// 123456真实密码
		}
		String salt = "abcd";// 盐值
		ByteSource credentialsSalt = new Md5Hash(salt);
		String realmName = getName();
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal, credentials, credentialsSalt, realmName);
		return info;
	}

	// @PostConstruct等价于bean的init-method
	public void setCredentialMatcher() {
		HashedCredentialsMatcher credentialsMatcher = new HashedCredentialsMatcher();
		credentialsMatcher.setHashAlgorithmName("MD5");// 加密方式
		credentialsMatcher.setHashIterations(1024);// 加密次数
		setCredentialsMatcher(credentialsMatcher);
	}

	public static void main(String[] args) {
		Object salt = new Md5Hash("abcd");
		SimpleHash hash = new SimpleHash("MD5", "123456", salt, 1024);
		System.out.println(hash.toString());// 生成密文方式，存入数据库
	}

}
