package demo;

import domain.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Scanner;

public class UpdatePriceInSpecificCategory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select category to update price\n1:Electronics\n2:Gadget");
        String cate=sc.next();
        System.out.println("Enter price to be Updated");
        double price=sc.nextDouble();
        Configuration cfg;
        SessionFactory factory;
        Session ses;
        Transaction tx;
        cfg=new Configuration();
        cfg=cfg.configure();
        cfg=cfg.addAnnotatedClass(Product.class);
        factory=cfg.buildSessionFactory();
        ses= factory.openSession();
        tx= ses.beginTransaction();
        Query q= ses.createQuery("update Product p set p.productPrice='"+price+"'"+"where p.productCategory='"+cate+"'");
        int count=q.executeUpdate();
        tx.commit();
        System.out.println(count+" products updated");
    }
}
