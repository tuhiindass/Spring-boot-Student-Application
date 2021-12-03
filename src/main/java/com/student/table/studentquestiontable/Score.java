package com.student.table.studentquestiontable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Score {
	
	@Id
	private long id;
	
	private int Score;
	
	private long profileId;

	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Score(long id, int score, long profileId) {
		super();
		this.id = id;
		Score = score;
		this.profileId = profileId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	public long getProfileId() {
		return profileId;
	}

	public void setProfileId(long profileId) {
		this.profileId = profileId;
	}

	@Override
	public String toString() {
		return "Score [id=" + id + ", Score=" + Score + ", profileId=" + profileId + "]";
	}
	
	
	
	
	
	

}
