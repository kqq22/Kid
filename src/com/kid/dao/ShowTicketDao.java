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

    /**
     * 添加票务
     * @param showticket  票务对象
     * @return  返回受影响行数
     */
    public int insertShowTicket(ShowTicketEntity showticket);

    /**
     * 查询所有票务
     * @return  返回票务对象
     */
    public List<ShowTicketEntity> selectShowTicket();

    /**
     * 根据id查询票务
     * @param id  主键id
     * @return  返回票务对象
     */
    public ShowTicketEntity findShowTicket(int id);

    /**
     * 修改票务
     * @param showticket  票务对象
     * @param id  根据主键修改
     * @return  返回受影响行数
     */
    public int updateShowTicket(ShowTicketEntity showticket,int id);

    /**
     * 删除票务
     * @param id  根据主键修改
     * @return  返回受影响行数
     */
    public int deleteShowTicket(int id);
}
