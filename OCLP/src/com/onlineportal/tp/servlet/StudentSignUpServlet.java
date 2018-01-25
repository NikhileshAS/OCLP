package com.onlineportal.tp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.onlineportal.tp.bean.StudentBean;
import com.onlineportal.tp.dao.UserDAO;

import sun.rmi.runtime.Log;

/**
 * Servlet implementation class StudentSignUpServlet
 */
@WebServlet("/Home/StudentSignUpServlet")
public class StudentSignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected List<StudentBean> _sbList = new LinkedList<StudentBean>();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String userName = request.getParameter("username");
    	String id = "S_"+request.getParameter("rollno");
    	String gender=request.getParameter("gender");
       	String dept = request.getParameter("dept");
    	String dob = request.getParameter("dateofbirth");
    	String streetAddress = request.getParameter("stAddress");
    	String streetAddress2 = request.getParameter("st2Address");
    	String city = request.getParameter("city");
    	String state = request.getParameter("state");
    	String zip = request.getParameter("zipcode");
    	String country = request.getParameter("country");
    	String mobile = request.getParameter("phone number");
    	String email = request.getParameter("email");
    	double cgpa =Double.parseDouble(request.getParameter("cgpa"));
    	    
       	_sbList.add(new StudentBean());
       	_sbList.get(_sbList.size()-1).setStudId(id);
       	_sbList.get(_sbList.size()-1).setStudPassword(id);
    	_sbList.get(_sbList.size()-1).setCity(city);
    	_sbList.get(_sbList.size()-1).setContactNo(mobile);
    	_sbList.get(_sbList.size()-1).setDateOfBirth(dob);
    	_sbList.get(_sbList.size()-1).setDepartment(dept);
    	_sbList.get(_sbList.size()-1).setEmailId(email);
    	_sbList.get(_sbList.size()-1).setLocation(country);
    	_sbList.get(_sbList.size()-1).setPincode(zip);
    	_sbList.get(_sbList.size()-1).setStudName(userName);
    	_sbList.get(_sbList.size()-1).setStudId(id);
    	_sbList.get(_sbList.size()-1).setStreet(streetAddress+","+streetAddress2);
    	_sbList.get(_sbList.size()-1).setState(state);
    	_sbList.get(_sbList.size()-1).setGender(gender); 
    	_sbList.get(_sbList.size()-1).setCgpa(cgpa);
    	UserDAO daoObj = new UserDAO();
    
    	
    	if(daoObj.studentRegister(_sbList.get(_sbList.size()-1))){
    		response.sendRedirect("Login.jsp");	
    	}
    }

}
