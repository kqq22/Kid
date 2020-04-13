package com.kid.entity;

/**
 * 活动展示表实体类
 * @author Administrator
 *
 */
public class ShowEntity {
    private int sid;  //主键
    private String image;  //图片
    private String topic;  //主题

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
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

    public ShowEntity(int sid, String image, String topic) {
        this.sid = sid;
        this.image = image;
        this.topic = topic;
    }

    /**
     * 无参构造方法
     */
    public ShowEntity() {
    }
}
