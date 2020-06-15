package com.kid.entity;
/**
 * 亲子旅游表实体类
 * @author Administrator
 *
 */
public class TravelEntity {
	private int tid;  //主键
	private String image;  //图片
	private String topic;  //主题
	private String address;  //地址
	private double price;  //价格
	private int age;  //年龄限制
	private String daytour;  //几日游类型

    public TravelEntity(String topic, String address, double price, int age, String daytour,String image) {
		this.image = image;
		this.topic = topic;
		this.address = address;
		this.price = price;
		this.age = age;
		this.daytour = daytour;
    }

    public TravelEntity(String topic, String address, int age, String daytour, double price) {
		this.topic = topic;
		this.address = address;
		this.price = price;
		this.age = age;
		this.daytour = daytour;
    }

    public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDaytour() {
		return daytour;
	}

	public void setDaytour(String daytour) {
		this.daytour = daytour;
	}

	public TravelEntity(int tid, String image, String topic, String address, double price, int age, String daytour) {
		this.tid = tid;
		this.image = image;
		this.topic = topic;
		this.address = address;
		this.price = price;
		this.age = age;
		this.daytour = daytour;
	}

	//无参构造方法
	public TravelEntity(){

	}
}
