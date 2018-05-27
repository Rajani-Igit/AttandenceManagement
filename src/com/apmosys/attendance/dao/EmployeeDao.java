package com.apmosys.attendance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.apmosys.attendance.dto.EmployeeDto;
import com.apmosys.attendance.util.ConnectionManager;

public class EmployeeDao {
	int status = 2;
	int employeeIdExistStatus = 0;
	private static final String CHECK_EMPLOYEEID = "SELECT COUNT(*) FROM apmosys_employee_tbl where EMP_ID=?";
	private static final String LOGIN_CHECK = "SELECT EMP_ID, EMP_FNAME,EMP_LNAME,EMP_GENDER, EMP_EMAIL, EMP_CONTACT_NO, EMP_STATUS, EMP_LEAVES,EMP_PASSWORD FROM apmosys_employee_tbl WHERE EMP_ID=? AND EMP_PASSWORD=?";
	private static final String REGSTRATION_QUERY = "INSERT INTO apmosys_employee_tbl (EMP_ID, EMP_FNAME,EMP_LNAME,EMP_GENDER, EMP_EMAIL, EMP_CONTACT_NO, EMP_STATUS, EMP_LEAVES,EMP_PASSWORD) VALUES(?,?,?,?,?,?,?,?,?)";
	private static final String FETCH_USER_QUER= "SELECT EMP_ID, EMP_FNAME,EMP_LNAME,EMP_GENDER, EMP_EMAIL, EMP_CONTACT_NO, EMP_STATUS, EMP_LEAVES,EMP_PASSWORD FROM apmosys_employee_tbl WHERE EMP_ID=?";
    private static final String UPDATE_USER_QUERY="UPDATE apmosys_employee_tbl SET EMP_FNAME=?,EMP_LNAME=?,EMP_EMAIL=?,EMP_CONTACT_NO=?";
	public String doLogin(String userId, String password) {

		try {
			Connection con = ConnectionManager.getConnection();

			PreparedStatement pss = con.prepareStatement(CHECK_EMPLOYEEID);
			pss.setString(1, userId);
			ResultSet rss = pss.executeQuery();
			if (rss.next()) {
				employeeIdExistStatus = rss.getInt(1);
				System.out.println(status);
			}
			if (employeeIdExistStatus >= 1) {
				PreparedStatement ps = con.prepareStatement(LOGIN_CHECK);
				ps.setString(1, userId);
				ps.setString(2, password);
				ResultSet rs = ps.executeQuery();
				int count = 0;
				if (rs.next()) {
					status = rs.getInt(7);
					
					System.out.println(status);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		if(employeeIdExistStatus>0&&status==1){
			// Employee Exist with Admin Approve
			return "A";
		}else if(employeeIdExistStatus>0&&status==0){
			//Employee Exist not Approved by admin
			return "E";
			
		}
		else if(employeeIdExistStatus>0&&status==2){
			//Employee Exist wrong password
			return "P";
			
		}
		else {
			//Worng user id
			return "N";
		}
		

		//return status;

	}

	public int doRegistration(EmployeeDto employee) {
		int status = 0;
		try {
			Connection conn = ConnectionManager.getConnection();
			PreparedStatement ps = conn.prepareStatement(REGSTRATION_QUERY);
			ps.setString(1, employee.getEmpId());
			ps.setString(2, employee.getFirstName());
			ps.setString(3, employee.getLastName());
			ps.setString(4, employee.getGender());
			ps.setString(5, employee.getEmail());
			ps.setString(6, employee.getContactNo());
			ps.setInt(7, employee.getStatus());
			ps.setInt(8, employee.getLeaves());
			ps.setString(9, employee.getPassword());
			status = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	public EmployeeDto getEmployeebyId(String id){
		EmployeeDto emp=new EmployeeDto();
		try{
			Connection conn = ConnectionManager.getConnection();
			PreparedStatement ps=conn.prepareStatement(FETCH_USER_QUER);
			ps.setString(1, id);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				emp.setContactNo(rs.getString(6));
				emp.setEmail(rs.getString(5));
				emp.setEmpId(rs.getString(1));
				emp.setFirstName(rs.getString(2));
				emp.setLastName(rs.getString(3));
				emp.setGender(rs.getString(4));
				emp.setLeaves(rs.getInt(8));
			}
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		return emp;
	}
	public int updateUser(EmployeeDto employee){
		int status=0;
		try{
			
			Connection conn = ConnectionManager.getConnection();
			PreparedStatement ps = conn.prepareStatement(UPDATE_USER_QUERY);
			ps.setString(1, employee.getFirstName());
			ps.setString(2, employee.getLastName());
			ps.setString(3, employee.getEmail());
			ps.setString(4, employee.getContactNo());
			//ps.setString(5, employee.getPassword());
			status = ps.executeUpdate();
		}catch(Exception e){
			
		}
		return status;
	}

}
