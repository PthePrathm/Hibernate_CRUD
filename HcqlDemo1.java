package demo;

import domain.Product;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import java.util.Iterator;
import java.util.List;

public class HcqlDemo1 {
    public static void main(String[] args) {
        Configuration cfg;
        SessionFactory factory;
        Session ses;

        cfg=new Configuration();
        cfg=cfg.configure();
        cfg=cfg.addAnnotatedClass(Product.class);
        factory=cfg.buildSessionFactory();
        ses= factory.openSession();
        //create criteria
        Criteria crt1 =ses.createCriteria(Product.class);
        //execute criteria
        List<Product> productList=crt1.list();
        for(Product p:productList){
            System.out.println(p);
        }
        System.out.println("=====================================");
        Criteria crt2=ses.createCriteria(Product.class);
        //add requirement deatils
        crt2.setProjection(Projections.property("productName"));
        //execute criteria
        List<String> name=crt2.list();
        for (String s:name){
            System.out.println(s);
        }
        System.out.println("=====================================");
        //fetch details from name and price
        Criteria crt3=ses.createCriteria(Product.class);
        //add requirement deatils
        ProjectionList pList=Projections.projectionList();
        pList.add((Projections.property("productName")));
        pList.add(Projections.property("productPrice"));
        crt3.setProjection(pList);
        //execute criteria
        List p=crt3.list();
        Iterator it=p.iterator();
        while(it.hasNext()){
            Object ob[] = (Object[])it.next();
            System.out.println(ob[0]+"--->"+ob[1]);
        }
        //or it can be done in simple way, but it is not optimal solution
        /*List<Product> productData=crt3.list();
        for (Product p:productData){
            System.out.println(p.getProductName()+"\t"+p.getProductPrice());
        }*/

    }
}
