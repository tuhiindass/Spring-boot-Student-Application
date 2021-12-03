package com.student.table.studentquestiontable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
public class Question {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String question;
	
	@OneToMany(
			cascade = CascadeType.ALL,
			orphanRemoval = true
			)
	@JoinColumn(name = "question_id")
	private List<QuestionOptions> questionOption=new ArrayList<>();

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question( String question, List<QuestionOptions> questionOption) {
		this.question = question;
		this.questionOption = questionOption;
	}

	public String getQuestion() {
		return question;
	}

	public List<QuestionOptions> getQuestionOption() {
		return questionOption;
	} 
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void setQuestionOption(List<QuestionOptions> questionOption) {
		this.questionOption = questionOption;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", questionOption=" + questionOption + "]";
	}
	
}
