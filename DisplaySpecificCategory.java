package demo;

import domain.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

public class DisplaySpecificCategory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select which category you want to see\n1:Electronics\n2:Gadget");
        String category= sc.next();

        Configuration cfg;
        SessionFactory factory;
        Session ses;

        cfg=new Configuration();
        cfg=cfg.configure();
        cfg=cfg.addAnnotatedClass(Product.class);
        factory=cfg.buildSessionFactory();
        ses= factory.openSession();

        Query q= ses.createQuery("select p from Product p where p.productCategory='"+category+"'");
        List<Product> productList=q.list();
        for (Product p:productList){
            System.out.println(p);
        }
    }
}
