package com.kid.entity;
/**
 * ������ϸ��
 * @author Administrator
 *
 */
public class OrderDetailsEntity {
	private int did;  //����
	private String topic;  //����
	private String name;  //�û���
	private String phone;  //�绰����
	private String type;  //��ͯ\����
	private int count;  //Ʊ��
	private double price;  //����
	private double totalprice;  //�ܼ�
	private String gotype;  //���з�ʽ
	private String address;  //��ַ
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public String getGotype() {
		return gotype;
	}
	public void setGotype(String gotype) {
		this.gotype = gotype;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public OrderDetailsEntity(int did, String topic, String name, String phone,
							  String type, int count, double price, double totalprice,
							  String gotype, String address) {
		super();
		this.did = did;
		this.topic = topic;
		this.name = name;
		this.phone = phone;
		this.type = type;
		this.count = count;
		this.price = price;
		this.totalprice = totalprice;
		this.gotype = gotype;
		this.address = address;
	}
	//�޲ι��췽��
	public OrderDetailsEntity(){
		
	}
}
