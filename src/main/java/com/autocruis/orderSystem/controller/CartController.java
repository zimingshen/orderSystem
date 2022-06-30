package com.autocruis.orderSystem.controller;

import com.autocruis.orderSystem.entity.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Ziming Shen
 * @create 2022-06-29 22:19
 */
@Controller
public class CartController {

    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    @ResponseBody
    public Cart getCart(){
        return new Cart();
    }
}
