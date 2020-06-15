package com.kid.entity;

/**
 * 票务展示表实体类
 * @author Administrator
 *
 */
public class ShowTicketEntity {
    private int kid;  //主键
    private String topic;  //主题
    private String image;  //图片
    private double price;  //价格
    private double mprice;  //门店价格

    public ShowTicketEntity(String topic, double price, double mprice, String image) {
        this.topic = topic;
        this.image = image;
        this.price = price;
        this.mprice = mprice;
    }

    public ShowTicketEntity(String topic, double price, double mprice) {
        this.topic = topic;
        this.price = price;
        this.mprice = mprice;
    }

    public int getKid() {
        return kid;
    }

    public void setKid(int kid) {
        this.kid = kid;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMprice() {
        return mprice;
    }

    public void setMprice(double mprice) {
        this.mprice = mprice;
    }

    /**
     * 有参构造方法
     * @param kid
     * @param topic
     * @param image
     * @param price
     * @param mprice
     */
    public ShowTicketEntity(int kid, String topic, String image, double price, double mprice) {
        this.kid = kid;
        this.topic = topic;
        this.image = image;
        this.price = price;
        this.mprice = mprice;
    }

    /**
     * 无参构造方法
     */
    public ShowTicketEntity() {
    }
}
