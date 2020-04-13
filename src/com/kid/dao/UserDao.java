package com.kid.dao;

import com.kid.entity.UserEntity;

/**
 * 用户表接口类
 * @author Administrator
 *
 */
public interface UserDao {
	/**
	 * 登录
	 * @param name  用户名
	 * @param pwd  密码
	 * @return  返回一个用户对象
	 */
	public UserEntity Login(String name, String pwd);

	/**
	 * 注册
	 * @param user 用户对象
	 * @return 返回受影响行数
	 */
	public int Register(UserEntity user);

	/**
	 * 修改用户信息
	 * @param user  //用户对象
	 * @return
	 */
	public int updateUser(UserEntity user,int id);
}
