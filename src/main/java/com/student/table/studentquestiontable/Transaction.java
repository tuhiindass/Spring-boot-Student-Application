package com.student.table.studentquestiontable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Transaction {
	@Id
	@GeneratedValue
	private Long id;
	
	private int answerId;
	
	private int questionId;
	
	private String result;

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Transaction(Long id, int answerId, int questionId, String result) {
		super();
		this.id = id;
		this.answerId = answerId;
		this.questionId = questionId;
		this.result = result;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", answerId=" + answerId + ", questionId=" + questionId + "]";
	}
	
	
	

}
