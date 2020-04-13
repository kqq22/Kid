package com.kid.service.impl;

import com.kid.dao.UserDao;
import com.kid.dao.impl.UserDaoImpl;

import com.kid.entity.UserEntity;
import com.kid.service.UserService;
/**
 * �û���ҵ���߼�ʵ����
 * @author Administrator
 *
 */
public class UserServiceImpl implements UserService {
	private UserDao dao = new UserDaoImpl();

	/**
	 * ��¼
	 * @param name  �û���
	 * @param pwd  ����
	 * @return  ����һ���û�����
	 */
	@Override
	public UserEntity login(String name, String pwd) {
		return dao.Login(name, pwd);
	}

	/**
	 * ע��
	 * @param user �û�����
	 * @return ������Ӱ������
	 */
	@Override
	public int register(UserEntity user) {
		return dao.Register(user);
	}

}
