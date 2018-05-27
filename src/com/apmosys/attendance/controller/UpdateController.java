package com.apmosys.attendance.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.apmosys.attendance.dao.EmployeeDao;
import com.apmosys.attendance.dto.EmployeeDto;

/**
 * Servlet implementation class UpdateController
 */
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String empId=request.getParameter("empId");
		EmployeeDao dao=new EmployeeDao();
	EmployeeDto emp=dao.getEmployeebyId(empId);
	RequestDispatcher rd=request.getRequestDispatcher("updateform.jsp");
	request.setAttribute("employee", emp);
	rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String empId=request.getParameter("empId");
		String gender=request.getParameter("gender");
		String email=request.getParameter("email");
		String contactNo=request.getParameter("contactNo");
		String firstName=request.getParameter("fname");
		String lastName=request.getParameter("lname");
		
				EmployeeDto emp=new EmployeeDto();
				emp.setContactNo(contactNo);
				emp.setEmail(email);
				emp.setEmpId(empId);
				emp.setFirstName(firstName);
				emp.setLastName(lastName);
				emp.setGender(gender);
				//emp.setLeaves(28);
				//emp.setStatus(0);
				EmployeeDao dao=new EmployeeDao();
				int status=dao.updateUser(emp);
				if(status>0){
				EmployeeDto employee=dao.getEmployeebyId(empId);
				RequestDispatcher rd=request.getRequestDispatcher("dashboard.jsp");
				request.setAttribute("employee", employee);
				rd.forward(request,response);
				}
	}

}
