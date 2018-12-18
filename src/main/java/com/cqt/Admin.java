package com.cqt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.sql.Date;

public class Admin {

    private static void printString(String msg) {
        for (int i = 0; i < msg.length(); i++) {
            System.out.print(msg.charAt(i));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generate catch block
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Admin.main()");

        //printString("Customer Query Tracker");

        Customer c1 = new Customer();
        c1.setC_name("Chen");
        c1.setC_password("chen123");
        c1.setC_email("chen@cogent.com");
        c1.setC_status(true);

        Customer c2 = new Customer();
        c2.setC_name("Sunit");
        c2.setC_password("sunit123");
        c2.setC_email("sunit@cogent.com");
        c2.setC_status(true);

        Order o1 = new Order();
        o1.setO_date(Date.valueOf("2018-01-01"));
        o1.setO_amount(1.11);
        o1.setO_customer(c1);

        Order o2 = new Order();
        o2.setO_date(Date.valueOf("2018-01-02"));
        o2.setO_amount(1.12);
        o2.setO_customer(c1);

        Type t1 = new Type();
        t1.setT_name("Defect Product");
        t1.setDepartment("Customer Service");

        Employee e1 = new Employee();
        e1.setE_name("John");
        e1.setE_password("john123");
        e1.setE_email("john@amazon.com");
        e1.setDepartment("Customer Service");
        e1.setE_role("staff");
        e1.setE_workload(1);

        Query q1 = new Query();
        q1.setQ_status(true);
        q1.setQ_feedback(-1);
        q1.setQ_type(t1);
        q1.setQ_customer(c1);
        q1.setQ_order(o1);
        q1.setQ_employee(e1);

        Configuration con = new Configuration().configure().addAnnotatedClass(Customer.class).addAnnotatedClass(Order.class).addAnnotatedClass(Type.class).addAnnotatedClass(Employee.class).addAnnotatedClass(Query.class);
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory sf = con.buildSessionFactory(reg); // sessionfactory is an interface
        Session session = sf.openSession();

        session.beginTransaction();


        session.save(c1);
        session.save(c2);
        session.save(o1);
        session.save(o2);
        session.save(t1);
        session.save(e1);
        session.save(q1);

        session.getTransaction().commit();

        session.close();

        System.out.println("-------------End--------------");
    }

}