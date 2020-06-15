package com.kid.dao.impl;

import com.kid.dao.AdminDao;
import com.kid.dao.BaseDao;
import com.kid.entity.AdminEntity;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDaoImpl extends BaseDao implements AdminDao {
    /**
     * 管理员登录
     * @param name  姓名
     * @param pwd  密码
     * @return  返回管理员对象
     */
    @Override
    public AdminEntity cLogin(String name,String pwd) {
        AdminEntity admins = null;
        //打开连接
        openConn();
        //创建SQL语句
        String sql = "select * from admin where name=? and pwd=?";
        //执行
        try {
            stm = conn.prepareStatement(sql);
            //设置参数
            stm.setString(1,name);
            stm.setString(2,pwd);
            //结果处理
            rs = stm.executeQuery();
            while (rs.next()) {
                admins = new AdminEntity(rs.getString(1),rs.getString(2),rs.getInt(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            //关闭资源
            closeAll();
        }
        return admins;
    }

    /**
     * 添加管理员
     * @param admin  管理员对象
     * @return  返回受影响行数
     */
    @Override
    public int addAdmin(AdminEntity admin) {
        int row = 0;
        //SQL语句
        String sql = "insert into admin values(default,?,?,1)";
        //设置参数
        Object [] objects = {admin.getName(),admin.getPwd()};
        //调用添加方法
        row = executeUpdate(sql,objects);
        //关闭资源
        closeAll();
        //返回受影响行数
        return row;
    }

    /**
     * 查询所有管理员
     * @return  返回管理员集合
     */
    @Override
    public List<AdminEntity> selectAdmin() {
        List<AdminEntity> list = new ArrayList<AdminEntity>();
        //打开连接
        openConn();
        //创建SQL语句
        String sql = "select * from admin";
        //执行
        try {
            stm = conn.prepareStatement(sql);
            //结果处理
            rs = stm.executeQuery();
            while (rs.next()) {
                AdminEntity admin = new AdminEntity();
                admin.setId(rs.getInt(1));//id
                admin.setName(rs.getString(2));//用户名
                admin.setPwd(rs.getString(3));//密码
                list.add(admin);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            //关闭资源
            closeAll();
        }
        return list;
    }

    /**
     * 删除管理员
     * @param id 根据主键删除
     * @return  返回用户集合
     */
    @Override
    public int deleteAdmin(int id) {
        int row = 0;
        //SQL语句
        String sql = "delete from admin where id=?";
        //设置参数
        Object [] objects = {id};
        //调用修改方法
        row = executeUpdate(sql,objects);
        //关闭资源
        closeAll();
        //返回受影响行数
        return row;
    }

    /**
     * 根据id查询管理员信息
     * @param id  主键id
     * @return  返回管理员对象
     */
    @Override
    public AdminEntity findAdmin(int id) {
        AdminEntity admin = null;
        //jdbc操作
        try {
            //获取连接
            openConn();
            //SQL语句
            String sql = "select * from admin where id=?";
            //获取执行对象
            stm = conn.prepareStatement(sql);
            //设置参数
            stm.setInt(1,id);
            //结果集处理
            rs = stm.executeQuery();
            while (rs.next()){
                //创建亲子活动表对象
                admin = new AdminEntity();
                admin.setId(rs.getInt(1));
                admin.setName(rs.getString(2));
                admin.setPwd(rs.getString(3));
               admin.setCtype(rs.getInt(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            closeAll();
        }
        return admin;
    }

    /**
     * 修改管理员信息
     * @param admin  管理员对象
     * @param id  根据主键修改
     * @return  返回受影响行数
     */
    @Override
    public int updateAdmin(AdminEntity admin, int id) {
        int row = 0;
        //SQL语句
        String sql = "update admin set name=?,pwd=? where id=?";
        //设置参数
        Object [] objects = {admin.getName(),admin.getPwd(),id};
        //调用修改方法
        row = executeUpdate(sql,objects);
        //关闭资源
        closeAll();
        //返回受影响行数
        return row;
    }
}
