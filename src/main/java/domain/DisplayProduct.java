package domain;
import domain.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.security.auth.login.AppConfigurationEntry;

public class DisplayProduct {
    public static void main(String[] args) {
        Configuration cfg;
        SessionFactory factory;
        Session ses;
        //step-1 activate hibernate framework
        cfg=new Configuration();
        cfg=cfg.configure();//reads the data from cfg
        //step-2 establish the communication link
        factory= cfg.buildSessionFactory();
        //step-3 start session
        ses=factory.openSession();
        //step-4 read data from table
        Product p=ses.load(Product.class,1);
        System.out.println(p.getProductId());
        System.out.println(p.getProductName());
        System.out.println(p.getProductCategory());
        System.out.println(p.getProductPrice());
    }
}
