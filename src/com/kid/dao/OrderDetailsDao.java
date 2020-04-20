package com.kid.dao;
import com.kid.entity.OrderDetailsEntity;
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
	 * 查询订单详情信息
	 * @param oId 订单表id
	 * @return 返回订单详情集合
	 */
	public List<OrderDetailsEntity> showOrderDetails(int oId);
}
