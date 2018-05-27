package com.apmosys.attendance.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.apmosys.attendance.dao.EmployeeDao;
import com.apmosys.attendance.dto.EmployeeDto;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userId=request.getParameter("userId");
		String password=request.getParameter("password");
		System.out.println(userId);
		System.out.println(password);
		EmployeeDao dao=new EmployeeDao();
		String status=dao.doLogin(userId, password);
		if(status.equals("A")){
		    EmployeeDto employee=dao.getEmployeebyId(userId);
			RequestDispatcher rd=request.getRequestDispatcher("dashboard.jsp");
			request.setAttribute("employee", employee);
			rd.forward(request,response);
			
		}
		else{
			request.setAttribute("status",status);
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		
			rd.forward(request,response);
		}
		//doGet(request, response);
	}

}
