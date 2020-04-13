package com.kid.entity;

import java.util.Date;

/**
 * 票务表实体类
 * @author Administrator
 *
 */
public class TicketEntity {
	private int pid;  //主键
	private double price;  //价格
	private String paddress;  //地址
	private String ptype;  //类型
	private String gotype;  //出行方式
	private String godate;  //出行日期
	private String topic;  //主题

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getGotype() {
		return gotype;
	}

	public void setGotype(String gotype) {
		this.gotype = gotype;
	}

	public String getGodate() {
		return godate;
	}

	public void setGodate(String godate) {
		this.godate = godate;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public TicketEntity(int pid, double price, String paddress, String ptype, String gotype, String godate, String topic) {
		this.pid = pid;
		this.price = price;
		this.paddress = paddress;
		this.ptype = ptype;
		this.gotype = gotype;
		this.godate = godate;
		this.topic = topic;
	}

	/**
	 * 无参构造方法
	 */
	public TicketEntity(){

	}
}
