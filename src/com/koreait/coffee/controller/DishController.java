package com.koreait.coffee.controller;

import com.koreait.coffee.config.MysqlConfig;
import com.koreait.coffee.model.dto.Dish;
import com.koreait.coffee.model.mapper.CategoryMapper;
import com.koreait.coffee.model.mapper.DishFlavorMapper;
import com.koreait.coffee.model.mapper.DishMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class DishController {
    public SqlSession sqlSession = MysqlConfig.mysqlConnect();
    public DishMapper mapper = sqlSession.getMapper(DishMapper.class);
    public DishFlavorMapper dishFlavorMapper = sqlSession.getMapper(DishFlavorMapper.class);

    /**
     * 메뉴이름 전체출력
     * @return
     */
    public List<Dish> getAllDishes(){
        return mapper.getAllDishes();
    }

    /**
     * 카테고리 id 로 메뉴출력
     * @param categoryId
     * @return
     */
    public List<Dish> getDishesByCategoryId(int categoryId){
        return mapper.getDishesByCategoryId(categoryId);
    }

    /**
     *
     * @param dish
     */
    public void addDishFlavor(Dish dish){
        dishFlavorMapper.addDishFlavor(dish);
    }

    /**
     *
     * @param dishId
     * @return
     */
    public Dish getDishById(int dishId){
        return mapper.getDishById(dishId);
    }
}
