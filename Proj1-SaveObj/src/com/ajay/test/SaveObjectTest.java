package com.ajay.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ajay.entity.Product;

public class SaveObjectTest {
    public static void main(String[] args) {
        // Configuration object
        Configuration cfg = new Configuration();

        // Load Hibernate configuration from hibernate.cfg.xml
        cfg.configure("com/ajay/cfgs/hibernate.cfg.xml");

        // Build the session factory
        try (SessionFactory sf = cfg.buildSessionFactory();
             Session session = sf.openSession()) {

            // Begin a transaction
            Transaction transaction = session.beginTransaction();

            // Create and save multiple Product entities
//            saveProduct(session, 1, "Motherboard", 11000.00f, 1.00f);
            saveProduct(session, 2, "CPU", 5000.00f, 1.00f);
            saveProduct(session, 3, "RAM", 2000.00f, 2.00f);

            // Commit the transaction
            transaction.commit();
        }
    }

    private static void saveProduct(Session session, int pid, String pname, float price, float qty) {
        Product product = new Product();
        product.setPid(pid);
        product.setPname(pname);
        product.setPrice(price);
        product.setQty(qty);

        session.save(product);
    }
}
