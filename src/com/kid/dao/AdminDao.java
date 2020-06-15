package com.kid.dao;

import com.kid.entity.AdminEntity;

import java.util.List;

/**
 * 管理员表接口类
 * @author Administrator
 *
 */
public interface AdminDao {
    /**
     * 管理员登录
     * @param name  姓名
     * @param pwd  密码
     * @return  返回管理员对象
     */
    public AdminEntity cLogin(String name,String pwd);

    /**
     * 添加管理员
     * @param admin  管理员对象
     * @return  返回受影响行数
     */
    public int addAdmin(AdminEntity admin);

    /**
     * 查询所有管理员
     * @return  返回管理员集合
     */
    public List<AdminEntity> selectAdmin();

    /**
     * 删除管理员
     * @param id 根据主键删除
     * @return  返回用户集合
     */
    public int deleteAdmin(int id);

    /**
     * 根据id查询管理员信息
     * @param id  主键id
     * @return  返回管理员对象
     */
    public AdminEntity findAdmin(int id);

    /**
     * 修改管理员信息
     * @param admin  管理员对象
     * @param id  根据主键修改
     * @return  返回受影响行数
     */
    public int updateAdmin(AdminEntity admin,int id);
}
