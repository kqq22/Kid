package com.kid.dao;

import com.kid.entity.UserEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


/**
 * ������
 * @author Administrator
 *
 */
public class BaseDao {
	//����������
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//������Ҫ��
	private static final String USER = "root";
	private static final String PWD = "123456";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/kids";
	
	//jdbc����
	protected Connection conn;
	protected PreparedStatement stm;
	protected ResultSet rs;

	/**
	 * ������
	 */
	public void openConn(){
		try {
			conn = DriverManager.getConnection(URL, USER, PWD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ��ɾ�Ĺ�������
	 * @param sql  SQL���
	 * @param objs   ����
	 * @return   ������Ӱ������
	 */
	public int executeUpdate(String sql,Object[] objs) {
		int row = 0;
		try {
			//������
			openConn();
			//ִ��SQL���
			stm = conn.prepareStatement(sql);
			//���ò���
			if (objs!=null) {
				for (int i = 0; i < objs.length; i++) {
					stm.setObject(i+1, objs[i]);
				}
			}
			row = stm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//�ر���Դ
			closeAll();
		}
		return row;
	}

	/**
	 * �ر���Դ
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
