package com.kid.dao.impl;

import com.kid.dao.BaseDao;
import com.kid.dao.TravelDao;
import com.kid.entity.TravelEntity;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TravelDaoImpl extends BaseDao implements TravelDao {
    /**
     * 分页查询所有亲子旅游表的信息
     * @param pageNum  页码
     * @param pageSize  每页显示多少行
     * @param dayTour  分类关键字
     * @return
     */
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

    /**
     * 查询最大页数
     * @param pageSize  每页显示几行
     * @param dayTour  分类关键字
     * @return
     */
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

    /**
     * 添加旅游票
     * @param travel  活动票对象
     * @return  返回受影响行数
     */
    @Override
    public int insertTravel(TravelEntity travel) {
        int row = 0;
        //SQL语句
        String sql = "insert into travel values(default,?,?,?,?,?,?)";
        //设置参数
        Object [] objects = {travel.getImage(),travel.getTopic(),travel.getAddress(),travel.getPrice(),travel.getAge(),travel.getDaytour()};
        //调用添加方法
        row = executeUpdate(sql,objects);
        //关闭资源
        closeAll();
        //返回受影响行数
        return row;
    }

    /**
     * 查询所有旅游票
     * @return  返回旅游票对象
     */
    @Override
    public List<TravelEntity> selectTravel() {
        List<TravelEntity> list = new ArrayList<TravelEntity>();
        //jdbc操作
        try {
            //获取连接
            openConn();
            //SQL语句
            String sql = "select * from travel";
            //获取执行对象
            stm = conn.prepareStatement(sql);
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
                travel.setDaytour(rs.getString(7));
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

    /**
     * 根据id查询旅游票
     * @param id  主键id
     * @return  返回旅游票对象
     */
    @Override
    public TravelEntity findTravel(int id) {
        TravelEntity travel = null;
        //jdbc操作
        try {
            //获取连接
            openConn();
            //SQL语句
            String sql = "select * from travel where tid=?";
            //获取执行对象
            stm = conn.prepareStatement(sql);
            //设置参数
            stm.setInt(1,id);
            //结果集处理
            rs = stm.executeQuery();
            while (rs.next()){
                //创建亲子活动表对象
                travel = new TravelEntity();
                travel.setTid(rs.getInt(1));
                travel.setImage(rs.getString(2));
                travel.setTopic(rs.getString(3));
                travel.setAddress(rs.getString(4));
                travel.setPrice(rs.getDouble(5));
                travel.setAge(rs.getInt(6));
                travel.setDaytour(rs.getString(7));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            closeAll();
        }
        return travel;
    }

    /**
     * 修改旅游票
     * @param travel  旅游票对象
     * @param id  根据主键修改
     * @return  返回受影响行数
     */
    @Override
    public int updateTravel(TravelEntity travel, int id) {
        int row = 0;
        //SQL语句
        String sql = "update travel set topic=?,address=?,price=?,age=?,daytour=? where tid=?";
        //设置参数
        Object [] objects = {travel.getTopic(),travel.getAddress(),travel.getPrice(),travel.getAge(),travel.getDaytour(),id};
        //调用修改方法
        row = executeUpdate(sql,objects);
        //关闭资源
        closeAll();
        //返回受影响行数
        return row;
    }

    /**
     * 删除旅游票
     * @param id  根据主键修改
     * @return  返回受影响行数
     */
    @Override
    public int deleteTravel(int id) {
        int row = 0;
        //SQL语句
        String sql = "delete from travel where tid=?";
        //设置参数
        Object [] objects = {id};
        //调用修改方法
        row = executeUpdate(sql,objects);
        //关闭资源
        closeAll();
        //返回受影响行数
        return row;
    }
}
