package com.ems.model;

public class User {
	
	private String fname;
	private	String lname;
	private String pwd ;
	private String gender;
	private	String email;
	private	String phoneno;
	private String question;
	private	String answer;
	
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public String getPwd() {
		return pwd;
	}
	public String getGender() {
		return gender;
	}
	public String getEmail() {
		return email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public String getQuestion() {
		return question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
