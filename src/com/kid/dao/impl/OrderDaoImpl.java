package com.kid.dao.impl;

import com.kid.dao.BaseDao;
import com.kid.dao.OrderDao;
import com.kid.entity.OrderEntity;
import com.kid.entity.TicketEntity;
import com.kid.entity.UserEntity;

import java.sql.SQLException;
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

    @Override
    public List<OrderEntity> showOrder(int pageSize, int pageNum) {
        return null;
    }

    @Override
    public int pageMaxPageNum(int pageSize) {
        return 0;
    }
}
