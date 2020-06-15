package com.kid.dao.impl;

import com.kid.dao.BaseDao;
import com.kid.dao.TicketDao;
import com.kid.entity.TicketEntity;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * 票务表实现类
 * @author Administrator
 *
 */
public class TicketDaoImpl extends BaseDao implements TicketDao {
    /**
     * 根据主题查询票务信息
     * @param topic  主题
     * @return
     */
    @Override
    public List<TicketEntity> showTicket(String topic) {
        List<TicketEntity> list = new ArrayList<TicketEntity>();
        //jdbc操作
        try {
            //获取连接
            openConn();
            //SQL语句
            String sql = "select * from ticket where topic=?";
            //获取执行对象
            stm = conn.prepareStatement(sql);
            //设置参数
            stm.setString(1,topic);
            //结果集处理
            rs = stm.executeQuery();
            while (rs.next()){
                //创建亲子活动表对象
                TicketEntity tictet = new TicketEntity();
                tictet.setPid(rs.getInt(1));  //id
                tictet.setPrice(rs.getDouble(2));  //价格
                tictet.setPaddress(rs.getString(3));  //地址
                tictet.setPtype(rs.getString(4));  //类型
                tictet.setGotype(rs.getString(5));  //出行方式
                tictet.setGodate(rs.getString(6));  //出行日期
                tictet.setTopic(rs.getString(7));  //主题
                //加入返回集合中
                list.add(tictet);

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
