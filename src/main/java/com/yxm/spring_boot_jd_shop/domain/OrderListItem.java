package com.yxm.spring_boot_jd_shop.domain;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * Author: YXM
 * Date: 2022/6/7
 * Time: 15:41
 * Description:
 */
@Entity
@Table(name = "order_list_item")
public class OrderListItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "product_id")
    private long productId;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private double price;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "color")
    private String color;
    @Column(name = "size")
    private String size;
    @Column(name = "url")
    private String url;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "nick_name")
    private String nickName;
    @Column(name = "address")
    private String address;

    public OrderListItem() {
    }

    public OrderListItem(Long id, long productId, String title, String description, double price, int quantity, String color, String size, String url, Long userId, String userName, String nickName, String address) {
        this.id = id;
        this.productId = productId;
        this.title = title;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.size = size;
        this.url = url;
        this.userId = userId;
        this.userName = userName;
        this.nickName = nickName;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "OrderListItem{" + "id=" + id + ", productId=" + productId + ", title='" + title + '\'' + ", description='" + description + '\'' + ", price=" + price + ", quantity=" + quantity + ", color='" + color + '\'' + ", size='" + size + '\'' + ", url='" + url + '\'' + ", userId=" + userId + ", userName='" + userName + '\'' + ", nickName='" + nickName + '\'' + ", address='" + address + '\'' + '}';
    }
}
