package com.kid.dao.impl;

import com.kid.dao.BaseDao;
import com.kid.dao.OrderDetailsDao;
import com.kid.entity.OrderDetailsEntity;
import com.kid.entity.TicketEntity;
import com.kid.entity.UserEntity;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * 订单详情表实现类
 * @author Administrator
 *
 */
public class OrderDetailsDaoImpl extends BaseDao implements OrderDetailsDao {
    /**
     * 插入订单详情信息
     * @param list  票务表集合
     * @param user  用户对象
     * @param count  数量
     * @return  返回受影响行数
     */
    @Override
    public int addOrderDeails(List<TicketEntity> list, UserEntity user,int count) {
        TicketEntity ticket = null;
        int row = 0;
        //SQL语句
        String sql = "insert into orderdetails values(default,?,?,?,?,?,?,?,?,?)";
        for (int i = 0;i<list.size();i++){
            ticket = list.get(i);
        }
        //设置参数
        Object [] objects = {ticket.getTopic(),user.getName(),user.getPhone(),ticket.getPtype(),ticket.getPrice(),count,(ticket.getPrice()*count),ticket.getGotype(),ticket.getPaddress()};

           /* stm.setString(1,ticket.getTopic());  //主题
            stm.setString(2,user.getName());  //用户名
            stm.setString(3,user.getPhone());  //电话号码
            stm.setString(4,ticket.getPtype());  //类型
            stm.setDouble(5,ticket.getPrice());  //价格
            stm.setInt(6,count);  //数量
            stm.setDouble(7,(ticket.getPrice()*count));  //总价格
            stm.setString(8,ticket.getGotype());  //出行方式
            stm.setString(9,ticket.getPaddress());  //地址*/
            //结果处理
        row = executeUpdate(sql,objects);

        return row;
    }

    /**
     * 查询订单详情信息
     * @param oId 订单表id
     * @return 返回订单详情集合
     */
    @Override
    public List<OrderDetailsEntity> showOrderDetails(int oId) {
        List<OrderDetailsEntity> list = new ArrayList<OrderDetailsEntity>();
        //jdbc操作
        try {
            //获取连接
            openConn();
            //SQL语句
            String sql = "select * from orderdetails where did=?";
            //获取执行对象
            stm = conn.prepareStatement(sql);
            //设置参数
            stm.setInt(1,oId);
            //结果集处理
            rs = stm.executeQuery();
            while (rs.next()){
                //创建亲子活动表对象
                OrderDetailsEntity orderDetails = new OrderDetailsEntity();
                orderDetails.setDid(rs.getInt(1));  //id
                orderDetails.setTopic(rs.getString(2));  //主题
                orderDetails.setName(rs.getString(3));  //用户名
                orderDetails.setPhone(rs.getString(4));  //电话号码
                orderDetails.setType(rs.getString(5));  //类型
                orderDetails.setPrice(rs.getDouble(6));  //价格
                orderDetails.setCount(rs.getInt(7));  //数量
                orderDetails.setTotalprice(rs.getDouble(8));  //总价格
                orderDetails.setGotype(rs.getString(9));  //出行方式
                orderDetails.setAddress(rs.getString(10));  //地址
                //加入返回集合中
                list.add(orderDetails);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            closeAll();
        }
        return list;
    }
}
