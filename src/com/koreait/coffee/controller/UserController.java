package com.koreait.coffee.controller;

import com.koreait.coffee.config.MysqlConfig;
import com.koreait.coffee.model.dto.Order;
import com.koreait.coffee.model.dto.ShoppingCart;
import com.koreait.coffee.model.dto.User;
import com.koreait.coffee.model.mapper.OrderMapper;
import com.koreait.coffee.model.mapper.UserMapper;

public class UserController {
    public UserMapper mapper = MysqlConfig.mysqlConnect().getMapper(UserMapper.class);
    public OrderMapper orderMapper = MysqlConfig.mysqlConnect().getMapper(OrderMapper.class);


    public void addUser(User user) {
        mapper.insertUser(user);
    }

    public void updateUserByPhoneNumber(User user) {
        mapper.updateUserByPhoneNumber(user);
    }

    public User getUserByPhoneNumber(String phoneNumber){return mapper.getUserByPhoneNumber(phoneNumber);}

    public void plusPoint(String phoneNumber , Integer point){
        User user = getUserByPhoneNumber(phoneNumber);
        user.setPoint(user.getPoint()+point);
        updateUserByPhoneNumber(user);
    }

    public void spendPoint(String phoneNumber, Order order) {
        User user = getUserByPhoneNumber(phoneNumber);
        if (user.getPoint() == 0){
            System.out.println("포인트가 없습니다.");
            return;
        }
        if (order.getAmount() > user.getPoint()){
            user.setPoint(0);
        }else{
            user.setPoint((int) (user.getPoint() - order.getAmount()));
        }

        updateUserByPhoneNumber(user);
    }
}
