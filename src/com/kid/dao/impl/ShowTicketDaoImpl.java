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
}
