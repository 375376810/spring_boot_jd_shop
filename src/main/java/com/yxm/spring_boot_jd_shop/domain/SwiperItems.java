package com.yxm.spring_boot_jd_shop.domain;

import javax.persistence.*;
/**
 * Created with Android Studio.
 * Author: YXM
 * Date: 2022/4/22
 * Time: 22:09
 * Description:首页轮播图元素
 */
@Entity
@Table(name = "swiper_items")
public class SwiperItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title = "";
    @Column(name = "status")
    private String status = "";
    @Column(name = "pic")
    private String pic = "";
    @Column(name = "url")
    private String url = "";

    public SwiperItems() {
    }

    public SwiperItems(Long id, String title, String status, String pic, String url) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.pic = pic;
        this.url = url;
    }

    @Override
    public String toString() {
        return "SwiperItems{" + "id=" + id + ", title='" + title + '\'' + ", status='" + status + '\'' + ", pic='" + pic + '\'' + ", url='" + url + '\'' + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

