package com.kid.dao;
import com.kid.entity.OrderEntity;
import com.kid.entity.TicketEntity;
import com.kid.entity.UserEntity;

import java.util.List;

/**
 * 订单详情表接口类
 * @author Administrator
 *
 */
public interface OrderDetailsDao {
	/**
	 * 插入订单详情信息
	 * @param list  票务表集合
	 * @param user  用户对象
	 * @param count  数量
	 * @return  返回受影响行数
	 */
	public int addOrderDeails(List<TicketEntity> list, UserEntity user,int count);

	/**
	 * 分页查询订单
	 * @param pageSize  页码
	 * @param pageNum  每页显示几行
	 * @return
	 */
	public List<OrderEntity> showOrder(int pageSize, int pageNum);

	/**
	 * 查询最大页数
	 * @param pageSize  每页显示几行
	 * @return  返回最大页码数
	 */
	public int pageMaxPageNum(int pageSize);
}
