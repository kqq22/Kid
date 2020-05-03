package com.kid.dao.impl;
import java.sql.SQLException;
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
		//SQL语句
		String sql = "insert into user values(default,?,?,?,?,?,?,?,?)";
		//设置参数
		Object [] objects = {user.getName(),user.getPwd(),user.getEmail(),user.getPhone(),user.getAddress(),user.getQq(),user.getBsex(),user.getBname()};
		//调用添加方法
		row = executeUpdate(sql,objects);
		//关闭资源
		closeAll();
		//返回受影响行数
		return row;
	}

	/**
	 * 修改用户信息
	 * @param user  用户对象
	 * @return 返回受影响行数
	 */
	@Override
	public int updateUser(UserEntity user,int id) {
		int row = 0;
		//SQL语句
		String sql = "update user set name=?,pwd=?,phone=?,email=? where id=?";
		//设置参数
		Object [] objects = {user.getName(),user.getPwd(),user.getPhone(),user.getEmail(),id};
		//调用修改方法
		row = executeUpdate(sql,objects);
		//关闭资源
		closeAll();
		//返回受影响行数
		return row;
	}

}
