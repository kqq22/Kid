package com.kid.dao;

import com.kid.entity.UserEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


/**
 * 工具类
 * @author Administrator
 *
 */
public class BaseDao {
	//加载驱动类
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//连接四要素
	private static final String USER = "root";
	private static final String PWD = "123456";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/kids";
	
	//jdbc对象
	protected Connection conn;
	protected PreparedStatement stm;
	protected ResultSet rs;

	/**
	 * 打开链接
	 */
	public void openConn(){
		try {
			conn = DriverManager.getConnection(URL, USER, PWD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 增删改公共方法
	 * @param sql  SQL语句
	 * @param objs   参数
	 * @return   返回受影响行数
	 */
	public int executeUpdate(String sql,Object[] objs) {
		int row = 0;
		try {
			//打开连接
			openConn();
			//执行SQL语句
			stm = conn.prepareStatement(sql);
			//设置参数
			if (objs!=null) {
				for (int i = 0; i < objs.length; i++) {
					stm.setObject(i+1, objs[i]);
				}
			}
			row = stm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//关闭资源
			closeAll();
		}
		return row;
	}

	/**
	 * 关闭资源
	 */
	public void closeAll(){
		try {
			if (rs!=null) {
				rs.close();
			}
			if (stm!=null) {
				stm.close();
			}
			if (conn!=null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
