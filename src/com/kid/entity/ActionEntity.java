package com.kid.entity;

import java.util.Date;

/**
 * ���ӻ��ʵ����
 * @author Administrator
 *
 */
public class ActionEntity {
	private int aid;  //����
	private String image;  //ͼƬ
	private String statu;  //״̬
	private String topic;  //����
	private String date;  //����
	private double price;  //�۸�
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
	//�޲ι��췽��
	public ActionEntity(){
		
	}
}
