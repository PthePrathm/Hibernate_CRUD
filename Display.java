package demo;

import domain.Customer;
import domain.Orders;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer id");
        int id= sc.nextInt();
        Configuration cfg;
        SessionFactory factory;
        Session ses;


        cfg=new Configuration();
        cfg=cfg.configure();
        cfg=cfg.addAnnotatedClass(Customer.class);
        cfg=cfg.addAnnotatedClass(Orders.class);
        factory= cfg.buildSessionFactory();
        ses= factory.openSession();
        Customer c1=ses.load(Customer.class,id);
        System.out.println(c1.getCustomerName());
        List<Orders> orderList=c1.getOrderList();
        for (Orders o:orderList){
            System.out.println(o);
        }

    }
}
