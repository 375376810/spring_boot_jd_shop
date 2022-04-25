package com.yxm.spring_boot_jd_shop.domain;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2022/5/14
 * Time: 18:10
 * Description: 猜你喜欢元素
 */
@Entity
@Table(name = "guess_you_like_items")
public class GuessYouLikeItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "gs_id")
    private String gsId;
    @Column(name = "title")
    private String title;
    @Column(name = "price")
    private double price;
    @Column(name = "desc")
    private String desc;
    @Column(name = "url")
    private String url;
    @Column(name = "sort")
    private String sort;

    public GuessYouLikeItems() {
    }

    public GuessYouLikeItems(Long id, String gsId, String title, double price, String desc, String url, String sort) {
        this.id = id;
        this.gsId = gsId;
        this.title = title;
        this.price = price;
        this.desc = desc;
        this.url = url;
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "GuessYouLikeItems{" + "id=" + id + ", gsId='" + gsId + '\'' + ", title='" + title + '\'' + ", price=" + price + ", desc='" + desc + '\'' + ", url='" + url + '\'' + ", sort='" + sort + '\'' + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGsId() {
        return gsId;
    }

    public void setGsId(String gsId) {
        this.gsId = gsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
