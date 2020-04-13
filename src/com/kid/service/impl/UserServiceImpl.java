package com.kid.service.impl;

import com.kid.dao.UserDao;
import com.kid.dao.impl.UserDaoImpl;

import com.kid.entity.UserEntity;
import com.kid.service.UserService;
/**
 * 用户表业务逻辑实现类
 * @author Administrator
 *
 */
public class UserServiceImpl implements UserService {
	private UserDao dao = new UserDaoImpl();

	/**
	 * 登录
	 * @param name  用户名
	 * @param pwd  密码
	 * @return  返回一个用户对象
	 */
	@Override
	public UserEntity login(String name, String pwd) {
		return dao.Login(name, pwd);
	}

	/**
	 * 注册
	 * @param user 用户对象
	 * @return 返回受影响行数
	 */
	@Override
	public int register(UserEntity user) {
		return dao.Register(user);
	}

}
