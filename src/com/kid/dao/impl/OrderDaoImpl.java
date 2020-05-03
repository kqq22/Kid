package com.kid.dao.impl;

import com.kid.dao.BaseDao;
import com.kid.dao.OrderDao;
import com.kid.entity.OrderEntity;
import com.kid.entity.TicketEntity;
import com.kid.entity.UserEntity;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 订单表实现类
 * @author Administrator
 *
 */
public class OrderDaoImpl extends BaseDao implements OrderDao {
    /**
     * 插入订单信息
     * @param list  票务信息对象
     * @param count  数量
     * @return  返回受影响行数
     */
    @Override
    public int addOrder(List<TicketEntity> list, int count, UserEntity user) {
        TicketEntity ticket = null;
        int row = 0;
        //SQL语句
        String sql = "insert into `order` values(default,CEILING(RAND()*90000000000000+1000000000),?,?,?,?,?,now(),?)";
        for (int i=0;i<list.size();i++){
             ticket = list.get(i);
        }
         //设置参数
         Object [] objects = {ticket.getTopic(),ticket.getPtype(),ticket.getPrice(),count,(ticket.getPrice()*count),user.getName()};
        //调用添加方法
        row = executeUpdate(sql,objects);
        //返回受影响行数
        return row;
    }

    /**
     * 分页查询订单
     * @param pageSize  页码
     * @param pageNum  每页显示几行
     * @return
     */
    @Override
    public List<OrderEntity> showOrder(int pageNum, int pageSize,String name) {
        List<OrderEntity> list = new ArrayList<OrderEntity>();
        //jdbc操作
        try {
            //获取连接
            openConn();
            //SQL语句
            String sql = "select * from `order` where name=? limit ?,?";
            //获取执行对象
            stm = conn.prepareStatement(sql);
            //设置参数
            stm.setString(1,name);
            stm.setInt(2,(pageNum-1)*pageSize);
            stm.setInt(3,pageSize);
            //结果集处理
            rs = stm.executeQuery();
            while (rs.next()){
                //创建亲子活动表对象
                OrderEntity order = new OrderEntity();
                order.setOid(rs.getInt(1));  //id
                order.setOrdernumber(rs.getString(2));  //订单编号
                order.setTopic(rs.getString(3));  //主题
                order.setType(rs.getString(4));  //类型
                order.setPrice(rs.getDouble(5));  //价格
                order.setCount(rs.getInt(6));  //数量
                order.setTotalprice(rs.getDouble(7));  //总价格
                order.setDate(rs.getString(8));  //日期
                order.setName(rs.getString(9));  //用户名
                //加入返回集合中
                list.add(order);

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
     * @return  返回最大页码数
     */
    @Override
    public int pageMaxPageNum(int pageSize,String name) {
        int max = 0;
        //jdbc操作
        try {
            //获取连接
            openConn();
            //SQL语句
            String sql = "select count(*) from `order` where name =?";
            //获取执行对象
            stm = conn.prepareStatement(sql);
            //设置参数
            stm.setString(1,name);
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
}
