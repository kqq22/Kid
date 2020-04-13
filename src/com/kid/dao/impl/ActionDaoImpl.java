package com.kid.dao.impl;

import com.kid.dao.ActionDao;
import com.kid.dao.BaseDao;
import com.kid.entity.ActionEntity;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * 亲子活动表实现类
 * @author Administrator
 *
 */
public class ActionDaoImpl extends BaseDao implements ActionDao {
    /**
     * 分页查询所有票务信息
     * @param pageNum  页码
     * @param pageSize  每页显示多少行
     * @return
     */
    @Override
    public List<ActionEntity> showAction(int pageNum, int pageSize) {
        List<ActionEntity> list = new ArrayList<ActionEntity>();
        //jdbc操作
        try {
            //获取连接
            openConn();
            //SQL语句
            String sql = "select * from action limit ?,?";
            //获取执行对象
            stm = conn.prepareStatement(sql);
            //设置参数
            stm.setInt(1,(pageNum-1)*pageSize);
            stm.setInt(2,pageSize);
            //结果集处理
            rs = stm.executeQuery();
            while (rs.next()){
                //创建亲子活动表对象
                ActionEntity action = new ActionEntity();
                action.setAid(rs.getInt(1));//id
                action.setImage(rs.getString(2));//图片
                action.setStatu(rs.getString(3));//状态
                action.setTopic(rs.getString(4));//主题
                action.setDate(rs.getString(5));//日期
                action.setPrice(rs.getDouble(6));//价格
                //加入返回集合中
                list.add(action);
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
