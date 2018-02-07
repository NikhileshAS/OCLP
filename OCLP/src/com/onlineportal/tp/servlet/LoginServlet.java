package com.onlineportal.tp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineportal.tp.bean.AdministratorBean;
import com.onlineportal.tp.bean.FacultyBean;
import com.onlineportal.tp.bean.StudentBean;
import com.onlineportal.tp.dao.UserDAO;
@WebServlet("/Home/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		//PrintWriter out=response.getWriter();
		//System.out.println("Hello");
		String loginId=request.getParameter("userName");
		String password=request.getParameter("password");
		HttpSession session = request.getSession(true);
		String successDestination = "../Faculty/Home.jsp";
		
		try{
		UserDAO dao = new UserDAO();
	
		if(loginId.startsWith("S_"))
		{
			StudentBean stud = dao.checkStudentSignIn(loginId, password);
			if(stud != null) {
				session.setAttribute("session", stud);
				//getServletContext().getRequestDispatcher(successDestination).forward(request, response);
				response.sendRedirect(successDestination);
			}
			else {
				//session.invalidate();
				session.setAttribute("session", "invalid");
				response.sendRedirect("Login.jsp");
			}
		}
		
		else if(loginId.startsWith("F_"))
		{
			FacultyBean facultyBeanObj = dao.checkFacultySignIn(loginId, password);
			
			if(facultyBeanObj != null) 
			{
				session.setAttribute("session", facultyBeanObj);
				//getServletContext().getRequestDispatcher(successDestination).forward(request, response);
				response.sendRedirect(successDestination);

			}
			else
			{
				//session.invalidate();
				session.setAttribute("session", "invalid");
				response.sendRedirect("Login.jsp");
			}
		}
			
		else if(loginId.startsWith("A_"))
		{
			AdministratorBean administratorBeanObj = dao.checkAdministratorSignIn(loginId, password);
			if(administratorBeanObj != null) {
				session.setAttribute("session", administratorBeanObj);
				
				//getServletContext().getRequestDispatcher(successDestination).forward(request, response);
				response.sendRedirect(successDestination);

			}
			else
			{
				//session.invalidate();
				session.setAttribute("session", "invalid");
				response.sendRedirect("Login.jsp");
				}
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
		
		
		
	}


