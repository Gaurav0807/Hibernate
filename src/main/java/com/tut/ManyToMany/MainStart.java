package com.tut.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainStart {
	public static void main(String[] args) 
	{
	
		SessionFactory factory  = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        System.out.println(factory);
        

               
        
       Session session = factory.openSession();
       
       Emp e1 = new Emp();
       Emp e2 = new Emp();
       
       e1.setEid(1);
       e1.setName("Gaurav Rawat");
       
       e2.setEid(2);
       e2.setName("Nikhil");
       
       Project p1 = new Project();
       Project p2 = new Project();
       
       p1.setId(11);
       p1.setProjectName("Live Video");
       
       p2.setId(22);
       p2.setProjectName("SpringBoot");
       
       List<Emp> l1 = new ArrayList<Emp>();
       List<Project> l2 = new ArrayList<Project>();
       
       l1.add(e2);
       l1.add(e1);
       
       
       l2.add(p1);
       l2.add(p2);
       
      e1.setProject(l2);
      p2.setEmp(l1);
      

       Transaction t = session.beginTransaction();       
       session.save(e1);
       session.save(e2);
       session.save(l1);
       session.save(l2);
      
       t.commit();
       session.close();
	}

}
