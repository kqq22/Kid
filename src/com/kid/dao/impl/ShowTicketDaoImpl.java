package com.kid.dao.impl;

import com.kid.dao.BaseDao;
import com.kid.dao.ShowTicketDao;
import com.kid.entity.ShowTicketEntity;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShowTicketDaoImpl extends BaseDao implements ShowTicketDao {
    /**
     * 分页查询所有票务信息
     * @param pageNum  页码
     * @param pageSize  每页显示多少行
     * @return
     */
    @Override
    public List<ShowTicketEntity> showTicket(int pageNum, int pageSize) {
        List<ShowTicketEntity> list = new ArrayList<ShowTicketEntity>();
        //jdbc操作
        try {
            //获取连接
            openConn();
            //SQL语句
            String sql = "select * from showticket limit ?,?";
            //获取执行对象
            stm = conn.prepareStatement(sql);
            //设置参数
            stm.setInt(1,(pageNum-1)*pageSize);
            stm.setInt(2,pageSize);
            //结果集处理
            rs = stm.executeQuery();
            while (rs.next()){
                //创建亲子活动表对象
                ShowTicketEntity showTicket = new ShowTicketEntity();
                showTicket.setKid(rs.getInt(1));  //主键
                showTicket.setTopic(rs.getString(2));  //主题
                showTicket.setImage(rs.getString(3));  //图片
                showTicket.setPrice(rs.getDouble(4));  //价格
                showTicket.setMprice(rs.getDouble(5));  //门店价格
                //加入返回集合中
                list.add(showTicket);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            closeAll();
        }
        return list;
    }

    /**
     * 查询最大页数
     * @param pageSize  每页显示几行
     * @return
     */
    @Override
    public int pageMaxPageNum(int pageSize) {
        int max = 0;
        //jdbc操作
        try {
            //获取连接
            openConn();
            //SQL语句
            String sql = "select count(*) from showticket";
            //获取执行对象
            stm = conn.prepareStatement(sql);
            //结果集处理
            rs = stm.executeQuery();
            if (rs.next()){
                int i = rs.getInt(1);
                if (i%pageSize==0){
                    max = i/pageSize;
                }else{
                    max = i/pageSize+1;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            closeAll();
        }
        return max;
    }

    /**
     * 添加旅游票
     * @param showticket  活动票对象
     * @return  返回受影响行数
     */
    @Override
    public int insertShowTicket(ShowTicketEntity showticket) {
        int row = 0;
        //SQL语句
        String sql = "insert into showticket values(default,?,?,?,?)";
        //设置参数
        Object [] objects = {showticket.getTopic(),showticket.getImage(),showticket.getPrice(),showticket.getMprice()};
        //调用添加方法
        row = executeUpdate(sql,objects);
        //关闭资源
        closeAll();
        //返回受影响行数
        return row;

    }

    /**
     * 查询所有票务
     * @return  返回票务对象
     */
    @Override
    public List<ShowTicketEntity> selectShowTicket() {
        List<ShowTicketEntity> list = new ArrayList<ShowTicketEntity>();
        //jdbc操作
        try {
            //获取连接
            openConn();
            //SQL语句
            String sql = "select * from showticket";
            //获取执行对象
            stm = conn.prepareStatement(sql);
            //结果集处理
            rs = stm.executeQuery();
            while (rs.next()){
                //创建亲子活动表对象
                ShowTicketEntity showticket = new ShowTicketEntity();
                showticket.setKid(rs.getInt(1));  //主键
                showticket.setTopic(rs.getString(2));  //主题
                showticket.setImage(rs.getString(3));  //图片
                showticket.setPrice(rs.getDouble(4));  //价格
                showticket.setMprice(rs.getDouble(5));  //门店价格
                //加入返回集合中
                list.add(showticket);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            closeAll();
        }
        return list;
    }

    /**
     * 根据id查询票务
     * @param id  主键id
     * @return  返回票务对象
     */
    @Override
    public ShowTicketEntity findShowTicket(int id) {
        ShowTicketEntity showticket = null;
        //jdbc操作
        try {
            //获取连接
            openConn();
            //SQL语句
            String sql = "select * from showticket where kid=?";
            //获取执行对象
            stm = conn.prepareStatement(sql);
            //设置参数
            stm.setInt(1,id);
            //结果集处理
            rs = stm.executeQuery();
            while (rs.next()){
                //创建亲子活动表对象
                showticket = new ShowTicketEntity();
                showticket.setKid(rs.getInt(1));  //主键
                showticket.setTopic(rs.getString(2));  //主题
                showticket.setImage(rs.getString(3));  //图片
                showticket.setPrice(rs.getDouble(4));  //价格
                showticket.setMprice(rs.getDouble(5));  //门店价格
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            closeAll();
        }
        return showticket;
    }

    /**
     * 修改票务
     * @param showticket  票务对象
     * @param id  根据主键修改
     * @return  返回受影响行数
     */
    @Override
    public int updateShowTicket(ShowTicketEntity showticket, int id) {
        int row = 0;
        //SQL语句
        String sql = "update showticket set topic=?,price=?,mprice=? where kid=?";
        //设置参数
        Object [] objects = {showticket.getTopic(),showticket.getPrice(),showticket.getMprice(),id};
        //调用修改方法
        row = executeUpdate(sql,objects);
        //关闭资源
        closeAll();
        //返回受影响行数
        return row;
    }

    /**
     * 删除票务
     * @param id  根据主键修改
     * @return  返回受影响行数
     */
    @Override
    public int deleteShowTicket(int id) {
        int row = 0;
        //SQL语句
        String sql = "delete from showticket where kid=?";
        //设置参数
        Object [] objects = {id};
        //调用修改方法
        row = executeUpdate(sql,objects);
        //关闭资源
        closeAll();
        //返回受影响行数
        return row;
    }
}
