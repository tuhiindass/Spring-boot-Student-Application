package com.student.table.studentquestiontable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Profile {
    @Id
	private Long id;
	
	private String fname;
	
	private String lname;
	
	private String email;
	
	private String gender;
		

	
	@OneToMany(
			cascade = CascadeType.ALL,
			orphanRemoval = true
			)
	@JoinColumn(name = "profile_id")
	private List<Session> session=new ArrayList<>();

	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profile(Long id, String fname, String lname, String email, String gender, List<Session> session) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.gender = gender;
		this.session = session;
	}

	public Long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = (long) id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Session> getSession() {
		return session;
	}

	public void setSession(List<Session> session) {
		this.session = session;
	}

	@Override
	public String toString() {
		return "Profile [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", gender=" + gender
				+ ", session=" + session + "]";
	}
	
	
}
