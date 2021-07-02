package com.tut.cascading;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.OneToMany_ManyToOne.Answer;
import com.tut.OneToMany_ManyToOne.Question;

public class CascadeinHibernate {
	public static void main(String[] args) 
	{
		 SessionFactory factory  = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	        
	       Session session = factory.openSession();
	       Question q1 = new Question();
	       q1.setQid(3456);
	       q1.setQuestion("What is my hobbies");
	       
	       Answer a1 = new Answer(234,"Cricket");
	       Answer a2 = new Answer(566,"Badminton");
	       
	       
	       List<Answer> l = new ArrayList();
	       l.add(a1);
	       l.add(a2);
	       
	       
	       q1.setAnswer(l);
	       Transaction t = session.beginTransaction();
	       
	       
	       
	       session.save(q1);
	       
	       t.commit();
	       session.close();
	       
	       
	       
	       
		
	}

}
