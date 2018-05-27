package com.apmosys.attendance.dto;

public class EmployeeDto {
private String empId;
private String firstName;
private String lastName;
private String gender;
private String email;
private String contactNo;
private int status;
private int leaves;
private String password;


public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
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
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}

public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContactNo() {
	return contactNo;
}
public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public int getLeaves() {
	return leaves;
}
public void setLeaves(int leaves) {
	this.leaves = leaves;
}
@Override
public String toString() {
	return "EmployeeDto [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
			+ ", email=" + email + ", contactNo=" + contactNo + ", status=" + status + ", leaves=" + leaves
			+ ", password=" + password + "]";
}




}
