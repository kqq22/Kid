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
}
