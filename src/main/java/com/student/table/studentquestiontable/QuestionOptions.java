package com.student.table.studentquestiontable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class QuestionOptions {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	@Column
	private String options;
	
	@Column
	private String answer;

	public QuestionOptions() {
		
	}

	public QuestionOptions(Long id, String options, String answer) {
		super();
		Id = id;
		this.options = options;
		this.answer = answer;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "QuestionOptions [Id=" + Id + ", options=" + options + ", answer=" + answer + "]";
	}

	
	
	
}
