package com.kid.dao;

import com.kid.entity.ShowTicketEntity;

import java.util.List;

/**
 * 票务展示表接口类
 * @author Administrator
 *
 */
public interface ShowTicketDao {
    /**
     * 分页查询所有票务信息
     * @param pageNum  页码
     * @param pageSize  每页显示多少行
     * @return
     */
    public List<ShowTicketEntity> showTicket(int pageNum, int pageSize);

    /**
     * 查询最大页数
     * @param pageSize  每页显示几行
     * @return
     */
    public int pageMaxPageNum(int pageSize);
}
