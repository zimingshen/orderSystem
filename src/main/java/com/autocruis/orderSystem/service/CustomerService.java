package com.autocruis.orderSystem.service;

import com.autocruis.orderSystem.dao.CustomerDao;
import com.autocruis.orderSystem.entity.Cart;
import com.autocruis.orderSystem.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ziming Shen
 * @create 2022-06-27 18:25
 */
@Service
public class CustomerService {
    @Autowired
    private CustomerDao customerDao;

    public void signUp(Customer customer) {
        Cart cart = new Cart();
        customer.setCart(cart);

        customer.setEnabled(true);
        customerDao.signUp(customer);
    }

    public Customer getCustomer(String email) {
        return customerDao.getCustomer(email);
    }
}

