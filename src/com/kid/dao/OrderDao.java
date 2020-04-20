package com.kid.dao;

import java.util.List;

import com.kid.entity.OrderEntity;
import com.kid.entity.TicketEntity;

/**
 * 订单表接口类
 * @author Administrator
 *
 */
public interface OrderDao {
	/**
	 * 插入订单信息
	 * @param list  票务信息对象
	 * @param count  数量
	 * @return  返回受影响行数
	 */
	public int addOrder(List<TicketEntity> list,int count);

	/**
	 * 分页查询订单
	 * @param pageSize  页码
	 * @param pageNum  每页显示几行
	 * @return
	 */
	public List<OrderEntity> showOrder(int pageSize, int pageNum,String name);

	/**
	 * 查询最大页数
	 * @param pageSize  每页显示几行
	 * @return  返回最大页码数
	 */
	public int pageMaxPageNum(int pageSize);
}
