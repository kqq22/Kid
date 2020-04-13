package com.kid.dao.impl;

import com.kid.dao.BaseDao;
import com.kid.dao.TravelDao;
import com.kid.entity.ActionEntity;
import com.kid.entity.ShowTicketEntity;
import com.kid.entity.TravelEntity;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TravelDaoImpl extends BaseDao implements TravelDao {
    @Override
    public List<TravelEntity> showTravel(int pageNum, int pageSize,String dayTour) {
        List<TravelEntity> list = new ArrayList<TravelEntity>();
        //jdbc操作
        try {
            //获取连接
            openConn();
            //SQL语句
            String sql = "select * from travel where daytour like ? limit ?,?";
            //获取执行对象
            stm = conn.prepareStatement(sql);
            //设置参数
            stm.setString(1,dayTour);
            stm.setInt(2,(pageNum-1)*pageSize);
            stm.setInt(3,pageSize);

            //结果集处理
            rs = stm.executeQuery();
            while (rs.next()){
                //创建亲子活动表对象
                TravelEntity travel = new TravelEntity();
                travel.setTid(rs.getInt(1));
                travel.setImage(rs.getString(2));
                travel.setTopic(rs.getString(3));
                travel.setAddress(rs.getString(4));
                travel.setPrice(rs.getDouble(5));
                travel.setAge(rs.getInt(6));
                //加入返回集合中
                list.add(travel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            closeAll();
        }
        return list;
    }

    @Override
    public int pageMaxPageNum(int pageSize,String dayTour) {
        int max = 0;
        //jdbc操作
        try {
            //获取连接
            openConn();
            //SQL语句
            String sql = "select count(*) from travel where daytour like ?";
            //获取执行对象
            stm = conn.prepareStatement(sql);
            //设置参数
            stm.setString(1,dayTour);
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
