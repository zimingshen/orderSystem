package com.autocruis.ordersystem.service;

import com.autocruis.ordersystem.dao.CustomerDao;
import com.autocruis.ordersystem.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ziming Shen
 * @create 2022-06-27 18:25
 */
@Service
public class CustomerService {

    private CustomerDao customerDao;

    @Autowired
    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void signUp(Customer customer) {
        customerDao.signUp(customer);
    }

    public Customer getCustomer(String email) {
        return customerDao.getCustomer(email);
    }
}

