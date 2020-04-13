package com.kid.dao;

import com.kid.entity.ActionEntity;

import java.util.List;

/**
 * 亲子活动表接口类
 * @author Administrator
 *
 */
public interface ActionDao {
    /**
     * 分页查询所有票务信息
     * @param pageNum  页码
     * @param pageSize  每页显示多少行
     * @return  返回亲子活动表对象
     */
    public List<ActionEntity> showAction(int pageNum, int pageSize);

    /**
     * 查询最大页数
     * @param pageSize  每页显示几行
     * @return  返回最大页码数
     */
    public int pageMaxPageNum(int pageSize);
}
