package com.kid.dao;

import java.util.List;

import com.kid.entity.TicketEntity;

/**
 * 票务表接口类
 * @author Administrator
 *
 */
public interface TicketDao {
	/**
	 * 根据主题查询票务信息
	 * @param topic  主题
	 * @return
	 */
	public List<TicketEntity> showTicket(String topic);
}
