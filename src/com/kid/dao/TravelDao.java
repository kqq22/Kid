package com.kid.dao;
import com.kid.entity.TravelEntity;

import java.util.List;

/**
 * 亲子旅游表接口
 * @author Administrator
 *
 */
public interface TravelDao {
    /**
     * 分页查询所有亲子旅游表的信息
     * @param pageNum  页码
     * @param pageSize  每页显示多少行
     * @param dayTour  分类关键字
     * @return
     */
    public List<TravelEntity> showTravel(int pageNum, int pageSize,String dayTour);

    /**
     * 查询最大页数
     * @param pageSize  每页显示几行
     * @param dayTour  分类关键字
     * @return
     */
    public int pageMaxPageNum(int pageSize,String dayTour);

    /**
     * 添加旅游票
     * @param travel  活动票对象
     * @return  返回受影响行数
     */
    public int insertTravel(TravelEntity travel);

    /**
     * 查询所有旅游票
     * @return  返回旅游票对象
     */
    public List<TravelEntity> selectTravel();

    /**
     * 根据id查询旅游票
     * @param id  主键id
     * @return  返回旅游票对象
     */
    public TravelEntity findTravel(int id);

    /**
     * 修改旅游票
     * @param travel  旅游票对象
     * @param id  根据主键修改
     * @return  返回受影响行数
     */
    public int updateTravel(TravelEntity travel,int id);

    /**
     * 删除旅游票
     * @param id  根据主键修改
     * @return  返回受影响行数
     */
    public int deleteTravel(int id);
}
