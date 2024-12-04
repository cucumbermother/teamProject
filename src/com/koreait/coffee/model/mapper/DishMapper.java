package com.koreait.coffee.model.mapper;

import com.koreait.coffee.model.dto.Dish;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DishMapper {
    @Select("select * from dish")
    List<Dish> getAllDishes();

    @Select("select * from dish where category_id = #{categoryId}")
    List<Dish> getDishesByCategoryId(int categoryId);

    @Select("select * from dish where id = #{dishId}")
    Dish getDishById(int dishId);
}
