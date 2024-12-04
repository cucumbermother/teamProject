package com.koreait.coffee.controller;

import com.koreait.coffee.config.MysqlConfig;
import com.koreait.coffee.model.dto.Order;
import com.koreait.coffee.model.dto.OrderDetail;
import com.koreait.coffee.model.mapper.OrderMapper;
import org.apache.ibatis.session.SqlSession;

public class OrderController {
    public SqlSession sqlSession = MysqlConfig.mysqlConnect();
    public OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);

    void getAllOder(){mapper.getAllOder();}

    void addOrders(){mapper.addOrders();}

    void updateOrder(Order order){
        mapper.updateOrders(order);
    }

    void setPoint(Order order){
        Integer point = (int) (order.getAmount() / 10);
        order.setPoint(point);
        updateOrder(order);
    }

    Order getOrdersById(Integer id){
        return mapper.getOrderById(id);
    }

    void addOrderDetail(OrderDetail orderDetail){

    }



}
