package com.kid.dao.impl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.kid.dao.BaseDao;
import com.kid.dao.UserDao;
import com.kid.entity.UserEntity;
/**
 * �û���ʵ����
 * @author Administrator
 *
 */
public class UserDaoImpl extends BaseDao implements UserDao {
	/**
	 * ��¼
	 * @param name  �û���
	 * @param pwd  ����
	 * @return  ����һ���û�����
	 */
	@Override
	public UserEntity Login(String name, String pwd) {
		UserEntity user = null;
		//������
		openConn();
		//����SQL���
		String sql = "select * from user where name=? and pwd=?";
		//ִ��
		try {
			stm = conn.prepareStatement(sql);
			//���ò���
			stm.setString(1, name);
			stm.setString(2, pwd);
			//�������
			rs = stm.executeQuery();
			while (rs.next()) {
				user = new UserEntity(rs.getInt("id"),rs.getString("name"),rs.getString("pwd"),rs.getString("email"),rs.getString("phone"),rs.getString("address"),rs.getString("qq"),rs.getString("bsex"),rs.getString("bname"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//�ر���Դ
			closeAll();
		}
		return user;
	}

	/**
	 * ע��
	 * @param user �û�����
	 * @return ������Ӱ������
	 */
	@Override
	public int Register(UserEntity user) {
		int row = 0;
		//������
		openConn();
		//SQL���
		String sql = "insert into user values(default,?,?,?,?,?,?,?,?)";
		//ִ��
		try {
			stm = conn.prepareStatement(sql);
			//���ò���
			stm.setString(1, user.getName());
			stm.setString(2, user.getPwd());
			stm.setString(3, user.getEmail());
			stm.setString(4, user.getPhone());
			stm.setString(5, user.getAddress());
			stm.setString(6, user.getQq());
			stm.setString(7, user.getBsex());
			stm.setString(8, user.getBname());
			//�������
			row = stm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//�ر���Դ
			closeAll();
		}
		return row;
	}

	@Override
	public int updateUser(UserEntity user,int id) {
		int row = 0;
		//������
		openConn();
		//SQL���
		String sql = "update user set name=?,pwd=?,phone=?,email=? where id=?";
		//ִ��
		try {
			stm = conn.prepareStatement(sql);
			//���ò���
			stm.setString(1, user.getName());  //�û���
			stm.setString(2, user.getPwd());  //����
			stm.setString(3, user.getPhone());  //�绰����
			stm.setString(4, user.getEmail());  //����
			stm.setInt(5,id);  //id
			//�������
			row = stm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//�ر���Դ
			closeAll();
		}
		return row;
	}

}
