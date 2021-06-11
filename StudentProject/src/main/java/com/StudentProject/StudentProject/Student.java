package com.StudentProject.StudentProject;

import org.springframework.stereotype.Service;

@Service
public class Student {
	public String firstName = "";
	public String lastName = "";
	public int phoneNumber=0;
	public int SSN=0;
	public double GPA=0.0;
	public int StudentID=0;
	public String Email = "";
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(int d) {
		this.phoneNumber = d;
	}
	
	public int getSSN() {
		return SSN;
	}
	
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	
	public double getGPA() {
		return GPA;
	}
	
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	public int getStudentID() {
		return StudentID;
	}
	
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String email) {
		Email = email;
	}
	
	public Student() {
		
	}
	
	public Student(String firstName, String lastName, int phoneNumber, int SSN, double GPA, int StudentID, String Email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.SSN = SSN;
		this.GPA = GPA;
		this.StudentID = StudentID;
		this.Email = Email;
	}
	
}
