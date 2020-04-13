package com.kid.service;

import com.kid.entity.UserEntity;

/**
 * 用户表业务逻辑接口类
 * @author Administrator
 *
 */
public interface UserService {
	/**
	 * 登录
	 * @param name  用户名
	 * @param pwd  密码
	 * @return  返回一个用户对象
	 */
	public UserEntity login(String name, String pwd);

	/**
	 * 注册
	 * @param user 用户对象
	 * @return 返回受影响行数
	 */
	public int register(UserEntity user);
}
