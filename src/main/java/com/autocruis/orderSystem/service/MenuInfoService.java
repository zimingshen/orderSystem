package com.autocruis.orderSystem.service;

import com.autocruis.orderSystem.dao.MenuInfoDao;
import com.autocruis.orderSystem.entity.MenuItem;
import com.autocruis.orderSystem.entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ziming Shen
 * @create 2022-07-10 14:37
 */
@Service
public class MenuInfoService {

    @Autowired
    private MenuInfoDao menuInfoDao;


    public List<Restaurant> getRestaurants() {
        return menuInfoDao.getRestaurants();
    }

    public List<MenuItem> getAllMenuItem(int restaurantId) {
        return menuInfoDao.getAllMenuItem(restaurantId);
    }

    public MenuItem getMenuItem(int id) {
        return menuInfoDao.getMenuItem(id);
    }
}

