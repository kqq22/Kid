package com.kid.entity;

/**
 * 管理员表实体类
 * @author Administrator
 *
 */
public class AdminEntity {
    private  int id;  //id
    private  String name;  //名字
    private String pwd;  //密码
    private  int ctype;  //用户类型  管理员为1，普通用户为2

    public AdminEntity(int id,String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }



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

    public int getCtype() {
        return ctype;
    }

    public void setCtype(int ctype) {
        this.ctype = ctype;
    }

    public AdminEntity(String name, String pwd, int ctype) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.ctype = ctype;
    }
    public AdminEntity(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }
    public AdminEntity() {
    }
}
