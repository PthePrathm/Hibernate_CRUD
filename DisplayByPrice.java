package demo;

import domain.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class DisplayByPrice {
    public static void main(String[] args) {
        Configuration cfg;
        SessionFactory factory;
        Session ses;

        cfg=new Configuration();
        cfg=cfg.configure();
        cfg=cfg.addAnnotatedClass(Product.class);
        factory=cfg.buildSessionFactory();
        ses= factory.openSession();
        //HQL--> To display all the objects of product class
        Query q= ses.createQuery("select p from Product p where p.productPrice<30000");
        List<Product> productList=q.list();
        for (Product p:productList){
            System.out.println(p);
        }
    }
}
