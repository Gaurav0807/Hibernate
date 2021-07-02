package com.tut.OneToMany_ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	
	@Id
	private int aid;
	private String answer;
	
	
	@ManyToOne
	private Question question;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
		
	
	public Answer(int aid, String answer) {
		super();
		this.aid = aid;
		this.answer = answer;
	}




	public Answer(int aid, String answer, Question question) {
		super();
		this.aid = aid;
		this.answer = answer;
		this.question = question;
	}
	
	


	public Question getQuestion() {
		return question;
	}


	public void setQuestion(Question question) {
		this.question = question;
	}


	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	

}
