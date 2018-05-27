package com.apmosys.attendance.util;

import java.sql.Connection;
import java.sql.DriverManager;

import com.apmosys.attendance.dao.EmployeeDao;
import com.apmosys.attendance.dto.EmployeeDto;

public class ConnectionManager {
	static Connection conn=null;
public static Connection getConnection(){
	try{Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Connecting to database...");
  
    
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	System.out.println(conn);
	}catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn;
	
	
}
public static void main(String[] args) {
	//getConnection();
	EmployeeDao dao=new EmployeeDao();
	EmployeeDto emp=new EmployeeDto();
	/*emp.setContactNo("9776696683");
	emp.setEmail("tapas@gmail.com");
	emp.setEmpId("E100");
	emp.setFirstName("Tapas");
	emp.setLastName("Sahu");
	emp.setGender("M");
	emp.setLeaves(23);
	emp.setStatus(0);
	dao.doRegistration(emp);*/
	dao.doLogin("E100","1234");
	System.out.println(dao.getEmployeebyId("E100"));
	

}
}
