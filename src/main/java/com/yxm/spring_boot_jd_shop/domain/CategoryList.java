package com.yxm.spring_boot_jd_shop.domain;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2022/4/25
 * Time: 17:40
 * Description: 分类页左侧列表元素
 */
@Entity
@Table(name="category_list")
public class CategoryList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "status")
    private String status;
    @Column(name = "desc")
    private String desc;
    @Column(name = "sort")
    private String sort;

    public CategoryList() {
    }

    public CategoryList(Long id, String title, String status, String desc, String sort) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.desc = desc;
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "CategoryList{" + "id=" + id + ", title='" + title + '\'' + ", status='" + status + '\'' + ", desc='" + desc + '\'' + ", sort='" + sort + '\'' + '}';
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
