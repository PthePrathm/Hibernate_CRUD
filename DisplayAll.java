package demo;

import domain.Customer;
import domain.Orders;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class DisplayAll {
    public static void main(String[] args) {
        Configuration cfg;
        SessionFactory factory;
        Session ses;


        cfg=new Configuration();
        cfg=cfg.configure();
        cfg=cfg.addAnnotatedClass(Customer.class);
        cfg=cfg.addAnnotatedClass(Orders.class);
        factory= cfg.buildSessionFactory();
        ses= factory.openSession();
        Criteria crt1= ses.createCriteria(Customer.class);
        List<Customer> productList=crt1.list();

        for (Customer p:productList){
            System.out.println(p.getCustomerName());
            List<Orders> orderList=p.getOrderList();
            for (Orders o:orderList){
                System.out.println(o.getOrderNumber());
            }
        }
    }
}
