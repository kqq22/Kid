package com.kid.dao.impl;

import com.kid.dao.BaseDao;
import com.kid.dao.ShowDao;
import com.kid.entity.ShowEntity;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShowDaoImpl extends BaseDao implements ShowDao {
    @Override
    public List<ShowEntity> show(int pageNum, int pageSize) {
        List<ShowEntity> list = new ArrayList<ShowEntity>();
        //jdbc操作
        try {
            //获取连接
            openConn();
            //SQL语句
            String sql = "select * from `show` limit ?,?";
            //获取执行对象
            stm = conn.prepareStatement(sql);
            //设置参数
            stm.setInt(1,(pageNum-1)*pageSize);
            stm.setInt(2,pageSize);
            //结果集处理
            rs = stm.executeQuery();
            while (rs.next()){
                //创建活动展示表对象
                ShowEntity show = new ShowEntity();
                show.setSid(rs.getInt(1));
                show.setImage(rs.getString(2));
                show.setTopic(rs.getString(3));
                //加入返回集合中
                list.add(show);
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
    public int pageMaxPageNum(int pageSize) {
        int max = 0;
        //jdbc操作
        try {
            //获取连接
            openConn();
            //SQL语句
            String sql = "select count(*) from action";
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
