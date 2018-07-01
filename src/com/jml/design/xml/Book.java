package com.jml.design.xml;

/**
 * @Author: jml
 * @Date: 18-3-24
 * @Description:
 */
public class Book {
    private String id;
    private String name;
    private Double price;
    private String memo;

    public Book(String id, String name, Double price, String memo) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.memo = memo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
