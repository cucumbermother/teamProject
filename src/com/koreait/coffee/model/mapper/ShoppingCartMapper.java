package com.koreait.coffee.model.mapper;

import com.koreait.coffee.model.dto.ShoppingCart;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import java.util.List;

public interface ShoppingCartMapper {
    //add
    void insertShoppingCart(ShoppingCart shoppingCart);

    //update
    void updateShoppingCartByDishId(ShoppingCart shoppingCart);

    @Delete("delete from shopping_cart where dish_id = #{dishId}")
    void deleteShoppingCartByDishId(Integer dishId);

    @Delete("delete from shopping_cart where id =#{id}")
    void deleteShoppingCartById(Integer id);

    @Select("select * from shopping_cart")
    List<ShoppingCart> selectShoppingCart();

    void getAmount(Integer ShoppingCartId,Integer dishId);
}
