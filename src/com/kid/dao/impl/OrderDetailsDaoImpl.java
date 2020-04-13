package com.kid.dao.impl;

import com.kid.dao.BaseDao;
import com.kid.dao.OrderDetailsDao;
import com.kid.entity.OrderDetailsEntity;
import com.kid.entity.OrderEntity;
import com.kid.entity.TicketEntity;
import com.kid.entity.UserEntity;

import java.sql.SQLException;
import java.util.List;

public class OrderDetailsDaoImpl extends BaseDao implements OrderDetailsDao {
    @Override
    public int addOrderDeails(List<TicketEntity> list, UserEntity user,int count) {
        TicketEntity ticket = null;
        int row = 0;
        //打开连接
        openConn();
        //SQL语句
        String sql = "insert into orderdetails values(default,?,?,?,?,?,?,?,?,?)";
        //执行
        try {
            stm = conn.prepareStatement(sql);
            //设置参数
            for (int i = 0;i<list.size();i++){
                ticket = list.get(i);
            }
            stm.setString(1,ticket.getTopic());  //主题
            stm.setString(2,user.getName());  //用户名
            stm.setString(3,user.getPhone());  //电话号码
            stm.setString(4,ticket.getPtype());  //类型
            stm.setDouble(5,ticket.getPrice());  //价格
            stm.setInt(6,count);  //数量
            stm.setDouble(7,(ticket.getPrice()*count));  //总价格
            stm.setString(8,ticket.getGotype());  //出行方式
            stm.setString(9,ticket.getPaddress());  //地址
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

    @Override
    public List<OrderEntity> showOrder(int pageSize, int pageNum) {
        return null;
    }

    @Override
    public int pageMaxPageNum(int pageSize) {
        return 0;
    }
}
