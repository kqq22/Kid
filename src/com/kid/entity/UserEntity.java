package com.kid.entity;
/**
 * 用户表实体类
 * 这个命名 UserEntity 这样好些其他的实体类一样
 * @author Administrator
 *
 */
public class UserEntity {
	private int id;  //主键
	private String name;  //用户名
	private String pwd;  //密码
	private String email;  //邮箱
	private String phone;  //电话号码
	private String address;  //地址
	private String qq;  //QQ号码
	private String bsex;  //宝宝性别
	private String bname;  //宝宝姓名
	private int ctype;  //用户类型

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getBsex() {
		return bsex;
	}
	public void setBsex(String bsex) {
		this.bsex = bsex;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getCtype() {
		return ctype;
	}

	public void setCtype(int ctype) {
		this.ctype = ctype;
	}

	public UserEntity(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}
	public UserEntity(int id,String name, String pwd, String email, String phone,
					  String address, String qq, String bsex, String bname,int ctype) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.qq = qq;
		this.bsex = bsex;
		this.bname = bname;
		this.ctype = ctype;
	}

	public UserEntity(String name, String pwd, String email, String phone,
					  String address, String qq, String bsex, String bname) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.qq = qq;
		this.bsex = bsex;
		this.bname = bname;
	}

	public UserEntity(String name, String pwd, String email, String phone) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.email = email;
		this.phone = phone;
	}


	//无参构造方法
	public UserEntity(){

	}
}
