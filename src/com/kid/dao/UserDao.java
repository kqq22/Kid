package com.kid.dao;

import com.kid.entity.UserEntity;

import java.util.List;

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
	 * @param user  用户对象
	 * @return  返回受影响行数
	 */
	public int updateUser(UserEntity user,int id);

	/**
	 * 查询所有用户信息
	 * @return  返回用户集合
	 */
	public List<UserEntity> FindUserAll();

	/**
	 * 删除用户
	 * @param id 根据主键删除
	 * @return  返回用户集合
	 */
	public int deleteUser(int id);
}
