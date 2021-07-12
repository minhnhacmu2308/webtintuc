package com.example.model;

public class Comment {
    private int id;
    private int userId;
    private int newId;
    private String comment;
    private String createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getNewId() {
        return newId;
    }

    public void setNewId(int newId) {
        this.newId = newId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Comment(int id, int userId, int newId, String comment, String createTime) {
        this.id = id;
        this.userId = userId;
        this.newId = newId;
        this.comment = comment;
        this.createTime = createTime;
    }

    public Comment() {
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", userId=" + userId +
                ", newId=" + newId +
                ", comment='" + comment + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
