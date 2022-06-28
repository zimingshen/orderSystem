package com.autocruis.ordersystem.dao;

import com.autocruis.ordersystem.entity.Customer;
import org.springframework.stereotype.Repository;

/**
 * @author Ziming Shen
 * @create 2022-06-27 18:25
 */
@Repository
public class CustomerDao {

    public void signUp(Customer customer) {
    }

    public Customer getCustomer(String email) {
        return new Customer();
    }
}

