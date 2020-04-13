package com.kid.dao.impl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.kid.dao.BaseDao;
import com.kid.dao.UserDao;
import com.kid.entity.UserEntity;
/**
 * 用户表实现类
 * @author Administrator
 *
 */
public class UserDaoImpl extends BaseDao implements UserDao {
	/**
	 * 登录
	 * @param name  用户名
	 * @param pwd  密码
	 * @return  返回一个用户对象
	 */
	@Override
	public UserEntity Login(String name, String pwd) {
		UserEntity user = null;
		//打开连接
		openConn();
		//创建SQL语句
		String sql = "select * from user where name=? and pwd=?";
		//执行
		try {
			stm = conn.prepareStatement(sql);
			//设置参数
			stm.setString(1, name);
			stm.setString(2, pwd);
			//结果处理
			rs = stm.executeQuery();
			while (rs.next()) {
				user = new UserEntity(rs.getInt("id"),rs.getString("name"),rs.getString("pwd"),rs.getString("email"),rs.getString("phone"),rs.getString("address"),rs.getString("qq"),rs.getString("bsex"),rs.getString("bname"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//关闭资源
			closeAll();
		}
		return user;
	}

	/**
	 * 注册
	 * @param user 用户对象
	 * @return 返回受影响行数
	 */
	@Override
	public int Register(UserEntity user) {
		int row = 0;
		//打开连接
		openConn();
		//SQL语句
		String sql = "insert into user values(default,?,?,?,?,?,?,?,?)";
		//执行
		try {
			stm = conn.prepareStatement(sql);
			//设置参数
			stm.setString(1, user.getName());
			stm.setString(2, user.getPwd());
			stm.setString(3, user.getEmail());
			stm.setString(4, user.getPhone());
			stm.setString(5, user.getAddress());
			stm.setString(6, user.getQq());
			stm.setString(7, user.getBsex());
			stm.setString(8, user.getBname());
			//结果处理
			row = stm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//关闭资源
			closeAll();
		}
		return row;
	}

	@Override
	public int updateUser(UserEntity user,int id) {
		int row = 0;
		//打开连接
		openConn();
		//SQL语句
		String sql = "update user set name=?,pwd=?,phone=?,email=? where id=?";
		//执行
		try {
			stm = conn.prepareStatement(sql);
			//设置参数
			stm.setString(1, user.getName());  //用户名
			stm.setString(2, user.getPwd());  //密码
			stm.setString(3, user.getPhone());  //电话号码
			stm.setString(4, user.getEmail());  //邮箱
			stm.setInt(5,id);  //id
			//结果处理
			row = stm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//关闭资源
			closeAll();
		}
		return row;
	}

}
