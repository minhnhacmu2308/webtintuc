package com.example.model;

public class New {
    private int id;
    private String title;
    private String desc;
    private String createTime;
    private int idCat;
    private String image;
    private int count;

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public New(int id, String title, String desc, String createTime, int idCat, String image, int count) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.createTime = createTime;
        this.idCat = idCat;
        this.image = image;
        this.count = count;
    }



    public New() {
    }

    @Override
    public String toString() {
        return "New{" +
                "id=" + id +
                ", title=" + title +
                ", desc='" + desc + '\'' +
                ", createTime='" + createTime + '\'' +
                ", idCat=" + idCat +
                ", image='" + image + '\'' +
                '}';
    }
}
