package com.cqt.service;

import com.cqt.dao.CustomerDAO;
import com.cqt.dao.CustomerDAOImpl;
import com.cqt.dto.Customer;

import java.util.ArrayList;

public class CustomerServiceImpl implements CustomerService {

    private CustomerDAO customerDAO;

    public CustomerServiceImpl() {
        customerDAO=CustomerDAOImpl.getCustomerDAOInstance();
    }

    @Override
    public int save(Customer cobj) {
        // TODO Auto-generated method stub
        return customerDAO.save(cobj);
    }

    @Override
    public int update(Customer cobj) {
        // TODO Auto-generated method stub
        return customerDAO.update(cobj);
    }

    @Override
    public int delete(int id) {
        // TODO Auto-generated method stub
        return customerDAO.delete(id);
    }

    @Override
    public Customer findById(int id) {
        // TODO Auto-generated method stub
        return customerDAO.findById(id);
    }

    @Override
    public ArrayList<Customer> findAll() {
        // TODO Auto-generated method stub
        return customerDAO.findAll();
    }

}
