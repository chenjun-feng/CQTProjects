package com.cqt.dao;

import java.util.ArrayList;

import com.cqt.dto.Customer;

public interface CustomerDAO {

    public int save(Customer cobj);
    public int update(Customer cobj);
    public int delete(int id);
    public Customer findById(int id);
    public ArrayList<Customer> findAll();

}
