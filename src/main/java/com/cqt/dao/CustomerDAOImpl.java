package com.cqt.dao;

import java.util.ArrayList;

import com.cqt.dto.Customer;

public class CustomerDAOImpl implements CustomerDAO {

    private static CustomerDAO customerDAO=null;

    public static CustomerDAO getCustomerDAOInstance()
    {
        if(customerDAO==null)
            customerDAO= new CustomerDAOImpl();
        return customerDAO;
    }



    @Override
    public int save(Customer cobj) {
        // Business Login of function Code
        return 0;
    }

    @Override
    public int update(Customer cobj) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete(int id) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Customer findById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<Customer> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

}
