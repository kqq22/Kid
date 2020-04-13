package com.kid.dao;

import com.kid.entity.ShowEntity;

import java.util.List;

/**
 * 活动展示表接口类
 * @author Administrator
 *
 */

public interface ShowDao {
    /**
     * 分页查询所有活动展示表的信息
     * @param pageNum  页码
     * @param pageSize  每页显示多少行
     * @return  返回亲子活动表对象
     */
    public List<ShowEntity> show(int pageNum, int pageSize);

    /**
     * 查询最大页数
     * @param pageSize  每页显示几行
     * @return  返回最大页码数
     */
    public int pageMaxPageNum(int pageSize);
}
