package com.kid.dao.impl;
import java.sql.SQLException;
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
		//SQL���
		String sql = "insert into user values(default,?,?,?,?,?,?,?,?)";
		//���ò���
		Object [] objects = {user.getName(),user.getPwd(),user.getEmail(),user.getPhone(),user.getAddress(),user.getQq(),user.getBsex(),user.getBname()};
		//������ӷ���
		row = executeUpdate(sql,objects);
		//�ر���Դ
		closeAll();
		//������Ӱ������
		return row;
	}

	/**
	 * �޸��û���Ϣ
	 * @param user  �û�����
	 * @return ������Ӱ������
	 */
	@Override
	public int updateUser(UserEntity user,int id) {
		int row = 0;
		//SQL���
		String sql = "update user set name=?,pwd=?,phone=?,email=? where id=?";
		//���ò���
		Object [] objects = {user.getName(),user.getPwd(),user.getPhone(),user.getEmail(),id};
		//�����޸ķ���
		row = executeUpdate(sql,objects);
		//�ر���Դ
		closeAll();
		//������Ӱ������
		return row;
	}

}
