package demo;

import domain.Customer;
import domain.Orders;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class delete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter customer id");
        int id=sc.nextInt();
        Configuration cfg;
        SessionFactory factory;
        Session ses;
        Transaction tx;

        cfg=new Configuration();
        cfg=cfg.configure();
        cfg=cfg.addAnnotatedClass(Customer.class);
        cfg=cfg.addAnnotatedClass(Orders.class);
        factory= cfg.buildSessionFactory();
        ses= factory.openSession();
        Customer c1=ses.load(Customer.class,id);
        tx= ses.beginTransaction();
        ses.delete(c1);

        tx.commit();
        System.out.println("Order deleted");
    }
}
