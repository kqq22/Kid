package com.kid.dao.impl;

import com.kid.dao.BaseDao;
import com.kid.dao.OrderDao;
import com.kid.entity.OrderEntity;
import com.kid.entity.TicketEntity;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 订单表实现类
 * @author Administrator
 *
 */
public class OrderDaoImpl extends BaseDao implements OrderDao {
    @Override
    public int addOrder(List<TicketEntity> list,int count) {
        TicketEntity ticket = null;
        int row = 0;
        //打开连接
        openConn();
        //SQL语句
        String sql = "insert into `order` values(default,CEILING(RAND()*90000000000000+1000000000),?,?,?,?,?,now())";
        //执行
        try {
            stm = conn.prepareStatement(sql);
            for (int i=0;i<list.size();i++){
                ticket = list.get(i);
            }
            //设置参数
            stm.setString(1,ticket.getTopic());  //主题
            stm.setString(2,ticket.getPtype());  //类型
            stm.setDouble(3,ticket.getPrice());  //价格
            stm.setInt(4,count);  //数量
            stm.setDouble(5,(ticket.getPrice()*count));  //总价
            //结果处理
            row = stm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            //关闭资源
            closeAll();
        }
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
    public int pageMaxPageNum(int pageSize) {
        int max = 0;
        //jdbc操作
        try {
            //获取连接
            openConn();
            //SQL语句
            String sql = "select count(*) from `order`";
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
}
