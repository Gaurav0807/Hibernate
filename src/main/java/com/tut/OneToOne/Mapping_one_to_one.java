package com.tut.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class Mapping_one_to_one {

	public static void main(String[] args) {
	
		 SessionFactory factory  = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	        
	        
	       Question q = new Question();
	       
	       q.setQid(1);
	       q.setQuestion("What is your name");
	      
	       
	       Answer a = new Answer();
	       a.setAid(22);
	       a.setAnswer("Gaurav Rawat");
	       
	       q.setAnswer(a);
	       a.setQuestion(q);
	        
	        
	       Session session = factory.openSession();
	      

	       Transaction t = session.beginTransaction();       
	       session.save(q);
	       session.save(a);
	      
	       t.commit();
	       session.close();
	
	}

}
