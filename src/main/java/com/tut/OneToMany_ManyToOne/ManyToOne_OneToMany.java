package com.tut.OneToMany_ManyToOne;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.tut.OneToMany_ManyToOne.*;

public class ManyToOne_OneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SessionFactory factory  = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	        
	        
	       Question q = new Question();
	       
	       q.setQid(1);
	       q.setQuestion("What is your name");
	      
	       
	       Answer a1 = new Answer();
	       a1.setAid(22);
	       a1.setAnswer("Gaurav Rawat");
	       a1.setQuestion(q);
	       
	       
	       Answer a2 = new Answer();
	       a2.setAid(23);
	       a2.setAnswer("Shivam Pundir");
	       a2.setQuestion(q);
	       
	       
	       
	       
	       List<Answer> list = new ArrayList<Answer>();
	       list.add(a1);
	       list.add(a2);
	       q.setAnswer(list);
	       
	       
	       
	       
	      
	       
	        
	       Session session = factory.openSession();
	      

	       Transaction t = session.beginTransaction();       
//	       session.save(q);
//	       session.save(a1);
//	       session.save(a2);
	       
	       
	       Question q1 = (Question) session.get(Question.class, 1);
	       System.out.println(q1.getQuestion());
	       System.out.println(q1.getQid());
	       //System.out.println(q1.getAnswer().size());
	       	      
	       t.commit();
	       session.close();
	

	}

}
