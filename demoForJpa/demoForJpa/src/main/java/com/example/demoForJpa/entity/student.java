package com.example.demoForJpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class student {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
private String studentName;
private String studentEmail;
private String studentAdress;
public student() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "student [id=" + id + ", studentName=" + studentName + ", studentEmail=" + studentEmail + ", studentAdress="
			+ studentAdress + "]";
}

public student(long id, String studentName, String studentEmail, String studentAdress) {
	super();
	this.id = id;
	this.studentName = studentName;
	this.studentEmail = studentEmail;
	this.studentAdress = studentAdress;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentEmail() {
	return studentEmail;
}
public void setStudentEmail(String studentEmail) {
	this.studentEmail = studentEmail;
}
public String getStudentAdress() {
	return studentAdress;
}
public void setStudentAdress(String studentAdress) {
	this.studentAdress = studentAdress;
}
}
