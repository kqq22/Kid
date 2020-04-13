package com.kid.entity;

import java.util.Date;

/**
 * 订单表实体类
 * @author Administrator
 *
 */
public class OrderEntity {
	private int oid;  //主键
	private String ordernumber;  //订单编号
	private String topic;  //主题
	private String type;  //儿童\成人
	private double price;  //单价
	private int count;  //票数
	private double totalprice;  //总价
	private String status;  //状态
	private Date date;  //日期
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOrdernumber() {
		return ordernumber;
	}
	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public OrderEntity(int oid, String ordernumber, String topic, String type,
					   double price, int count, double totalprice, String status, Date date) {
		super();
		this.oid = oid;
		this.ordernumber = ordernumber;
		this.topic = topic;
		this.type = type;
		this.price = price;
		this.count = count;
		this.totalprice = totalprice;
		this.status = status;
		this.date = date;
	}
	//无参构造方法
	public OrderEntity(){

	}
}
