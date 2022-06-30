package com.autocruis.orderSystem.controller;

import com.autocruis.orderSystem.entity.Customer;
import com.autocruis.orderSystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Ziming Shen
 * @create 2022-06-27 17:51
 */
@Controller
public class SignUpController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void signUp(@RequestBody Customer customer) {
//        if (customerService.getCustomer(customer.getEmail()) == null) {
//            customerService.signUp(customer);
//        }
        customerService.signUp(customer);
    }
}
