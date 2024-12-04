package com.koreait.coffee.model.dto;

import java.time.LocalDateTime;

public class ShoppingCart {
    private Integer id;
    private Integer userId;
    private Integer dishId;
    private double amount;
    private Integer number;
    private Type type;
    private LocalDateTime createTime;

    public ShoppingCart(Integer id, Integer userId, Integer dishId, double amount, Integer number, Type type, LocalDateTime createTime) {
        this.id = id;
        this.userId = userId;
        this.dishId = dishId;
        this.amount = amount;
        this.number = number;
        this.type = type;
        this.createTime = createTime;
    }

    public ShoppingCart() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", userId=" + userId +
                ", dishId=" + dishId +
                ", amount=" + amount +
                ", number=" + number +
                ", type=" + type +
                ", createTime=" + createTime +
                '}';
    }
}
