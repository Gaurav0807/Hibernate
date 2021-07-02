package com.tut.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class HQL {

	public static void main(String[] args) {
	
		
		 SessionFactory factory  = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	        
	       Session session = factory.openSession();
	      
	    // String query="from Student where lastname= 'Rawat'";
	      // String query="from Student where lastname=:x";
	       String query="from Student as s where s.lastname=:x and s.firstname=:y";
	       Query q = session.createQuery(query);
	       
	       q.setParameter("x","Rawat");
	       q.setParameter("y","Gaurav");
	     //single-Unique
	     
	     //multiple-list
	     List<Student> list =q.list();
	      for(Student s:list)
	      {
	    	  System.out.println(s.getFirstname()+" "+ s.getLastname());
	      }
	      
	      System.out.println("_______________________Delete Query_______________________________");
	      /*
	      Query q1 =session.createQuery("delete from Student as s where s.id=:p");
	       q1.setParameter("p", 3);
	      
	      
	       Transaction t = session.beginTransaction();
	       int r = q1.executeUpdate();
	       System.out.println("Deleted");
	       System.out.println(r);
	       t.commit();
	      session.close();*/
	      
	     /* System.out.println("_______________________Update Query_______________________________");

	      Query q2 =session.createQuery("update from Student as s set s.lastname=:b where s.id=:p");
	       q2.setParameter("p", 2);
	      q2.setParameter("b","Singh");
	      
	       Transaction t = session.beginTransaction();
	       int r = q2.executeUpdate();
	       System.out.println("Updated");
	       System.out.println(r);
	       t.commit();
	      session.close();  */
	      
	      
	      
	      //how to execute join query
	      Query q3 =session.createQuery("select q.question,q.qid,a.answer from Question as q INNER JOIN q.answer as a");
	      
	      List<Object[]> list3 = q3.getResultList();
	      for(Object[] arr : list3)
	      {
	    	  System.out.println(Arrays.toString(arr));
	      }
	}

}






















