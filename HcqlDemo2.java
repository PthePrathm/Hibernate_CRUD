package demo;

import domain.Product;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class HcqlDemo2 {
    public static void main(String[] args) {
        Configuration cfg;
        SessionFactory factory;
        Session ses;

        cfg=new Configuration();
        cfg=cfg.configure();
        cfg=cfg.addAnnotatedClass(Product.class);
        factory=cfg.buildSessionFactory();
        ses= factory.openSession();
        //fetch the first 3 records from the database table
        Criteria crt1= ses.createCriteria(Product.class);
        crt1.setMaxResults(3);
        List<Product> productList =crt1.list();
        for (Product p:productList){
            System.out.println(p);
        }
        System.out.println("=====================================");
        //exclude first 3 results
        Criteria crt2=ses.createCriteria(Product.class);
        crt2.setFirstResult(3);
        List<Product> list1=crt2.list();
        for (Product p:list1){
            System.out.println(p);
        }
        //display only product names of first 2 products
        System.out.println("=============================================");
        Criteria crt3=ses.createCriteria(Product.class);
        crt3.setMaxResults(2);
        crt3.setProjection(Projections.property("productName"));
        List<String> list2=crt3.list();
        for (String s:list2){
            System.out.println(s);
        }
        //display product having price less than 30000
        System.out.println("===============================================");
        Criteria crt4= ses.createCriteria(Product.class);
        crt4.add(Restrictions.lt("productPrice",30000.0));
        List<Product> list3=crt4.list();
        for (Product p:list3){
            System.out.println(p);
        }
        //display products having price between 10000 and 20000
        System.out.println("==============================================");
        Criteria crt5= ses.createCriteria(Product.class);
        crt5.add(Restrictions.between("productPrice",10000.0,20000.0));
        List<Product> list4=crt5.list();
        for (Product p:list4){
            System.out.println(p);
        }
        //display all products from electronics category
        System.out.println("======================================");
        Criteria crt6= ses.createCriteria(Product.class);
        crt6.add(Restrictions.ilike("productCategory","Electronics"));
        List<Product> list5=crt6.list();
        for (Product p:list5){
            System.out.println(p);
        }
        //products whose name start with L
        System.out.println("=======================================");
        Criteria crt7= ses.createCriteria(Product.class);
        crt7.add(Restrictions.like("productName","A%"));
        List<Product> list6=crt7.list();
        for (Product p:list6){
            System.out.println(p);
        }
        //display all products from gadget category having price greater than 10000
        System.out.println("=======================================");
        Criteria crt8= ses.createCriteria(Product.class);
        crt8.add(Restrictions.ilike("productCategory","Gadget"));
        crt8.add(Restrictions.gt("productPrice",15000.0));
        List<Product> list7=crt8.list();
        for (Product p:list7){
            System.out.println(p);
        }
        //display all products in ascending order according to their price
        System.out.println("=========================================");
        Criteria crt9= ses.createCriteria(Product.class);
        crt9.addOrder(Order.asc("productPrice"));//Order.desc for descending order
        List<Product> list8=crt9.list();
        for (Product p:list8){
            System.out.println(p);
        }
    }
}
