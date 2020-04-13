package com.kid.entity;

import java.util.Date;

/**
 * 亲子活动表实体类
 * @author Administrator
 *
 */
public class ActionEntity {
	private int aid;  //主键
	private String image;  //图片
	private String statu;  //状态
	private String topic;  //主题
	private String date;  //日期
	private double price;  //价格
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getStatu() {
		return statu;
	}
	public void setStatu(String statu) {
		this.statu = statu;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ActionEntity(int aid, String image, String statu, String topic, String date,
						double price) {
		super();
		this.aid = aid;
		this.image = image;
		this.statu = statu;
		this.topic = topic;
		this.date = date;
		this.price = price;
	}
	//无参构造方法
	public ActionEntity(){
		
	}
}
