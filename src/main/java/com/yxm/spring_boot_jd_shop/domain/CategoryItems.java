package com.yxm.spring_boot_jd_shop.domain;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2022/4/25
 * Time: 17:50
 * Description: 分类页右侧元素
 */
@Entity
@Table(name = "category_items")
public class CategoryItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "category_list_id")
    private Long categoryListId;
    @Column(name = "title")
    private String title;
    @Column(name = "status")
    private String status;
    @Column(name = "desc")
    private String desc;
    @Column(name = "url")
    private String url;
    @Column(name = "sort")
    private String sort;

    public CategoryItems() {
    }

    public CategoryItems(Long id, Long categoryListId, String title, String status, String desc, String url, String sort) {
        this.id = id;
        this.categoryListId = categoryListId;
        this.title = title;
        this.status = status;
        this.desc = desc;
        this.url = url;
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "CategoryItems{" + "id=" + id + ", categoryListId=" + categoryListId + ", title='" + title + '\'' + ", status='" + status + '\'' + ", desc='" + desc + '\'' + ", url='" + url + '\'' + ", sort='" + sort + '\'' + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryListId() {
        return categoryListId;
    }

    public void setCategoryListId(Long categoryListId) {
        this.categoryListId = categoryListId;
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
