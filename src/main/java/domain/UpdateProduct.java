package domain;
import domain.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateProduct {
    public static void main(String[] args) {
        Configuration cfg;
        Transaction tx;
        SessionFactory factory;
        Session ses;
        //step-1 activate hibernate framework
        cfg=new Configuration();
        cfg=cfg.configure();//reads the data from cfg
        //step-2 establish the communication link
        factory= cfg.buildSessionFactory();
        //step-3 start session
        ses=factory.openSession();
        Product p=ses.load(Product.class,1);
        p.setProductName("Smart Watch");
        //step-5 start the transaction
        tx= ses.beginTransaction();
        ses.update(p);
        tx.commit();
        System.out.println("Record updated");
    }
}
