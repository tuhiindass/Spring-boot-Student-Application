package com.student.table.studentquestiontable;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Session {
	@Id
	@GeneratedValue
	private Long id;
	
	private Time startTime;

	private Time endTime;
	
	@OneToMany(
			cascade = CascadeType.ALL,
			orphanRemoval = true
			)
	@JoinColumn(name = "session_id")
	private List<Transaction> transaction=new ArrayList<>();

	public Session() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Session(Long id, Time startTime, Time endTime, List<Transaction> transaction) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.transaction = transaction;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public List<Transaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}

	@Override
	public String toString() {
		return "Session [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", transaction="
				+ transaction + "]";
	}
	
	

}
