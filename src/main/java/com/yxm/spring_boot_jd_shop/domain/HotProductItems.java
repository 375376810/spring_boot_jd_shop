package com.yxm.spring_boot_jd_shop.domain;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2022/5/12
 * Time: 18:38
 * Description: 热门商品改为通过接口访问返回
 */
@Entity
@Table(name = "hot_product_items")
public class HotProductItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "list_id")
    private Long listId;

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

    public HotProductItems() {
    }

    public HotProductItems(Long id, Long listId, String title, double price, String desc, String url, String sort) {
        this.id = id;
        this.listId = listId;
        this.title = title;
        this.price = price;
        this.desc = desc;
        this.url = url;
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "HotProductItems{" + "id=" + id + ", listId=" + listId + ", title='" + title + '\'' + ", price=" + price + ", desc='" + desc + '\'' + ", url='" + url + '\'' + ", sort='" + sort + '\'' + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getListId() {
        return listId;
    }

    public void setListId(Long listId) {
        this.listId = listId;
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
