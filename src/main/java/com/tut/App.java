package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //SessionFactory is interface
        SessionFactory factory  = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        System.out.println(factory);
        
        //creating Student
        Student s = new Student();
        s.setId(2);
        s.setFirstname("Nikhil");
        s.setLastname("Rawat");
        
        
       Session session = factory.openSession();
      

       Transaction t = session.beginTransaction();       
       session.save(s);
      
       t.commit();
       session.close();
       
    }
}
