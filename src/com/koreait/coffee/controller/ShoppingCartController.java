package com.koreait.coffee.controller;

import com.koreait.coffee.config.MysqlConfig;
import com.koreait.coffee.model.dto.ShoppingCart;
import com.koreait.coffee.model.mapper.ShoppingCartMapper;
import org.apache.ibatis.session.SqlSession;
import java.util.List;

public class ShoppingCartController {
    public SqlSession sqlSession = MysqlConfig.mysqlConnect();
    public ShoppingCartMapper mapper = sqlSession.getMapper(ShoppingCartMapper.class);

    public void add(ShoppingCart shoppingCart){

        mapper.insertShoppingCart(shoppingCart);
    }

    public void updateByDishId(ShoppingCart shoppingCart){
        mapper.updateShoppingCartByDishId(shoppingCart);
    }

    public void deleteByDishId(Integer dishId){
        mapper.deleteShoppingCartByDishId(dishId);
    }

    public void deleteById(Integer id){
        mapper.deleteShoppingCartById(id);
    }

    public List<ShoppingCart> getShoppingCart(){
        return mapper.selectShoppingCart();
    }

    public void getAmount(Integer shoppingCartId, Integer dishId){
         mapper.getAmount(shoppingCartId,dishId);
    }
}
