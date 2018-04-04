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

@WebServlet("/Home/StudentSignUpServlet")
public class StudentSignUpServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	StudentBean studentBean = new StudentBean();
    	
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
    	    
       	studentBean.setStudId(id);
       	
       	studentBean.setStudPassword(id);
       	
    	studentBean.setCity(city);
    	
    	studentBean.setContactNo(mobile);
    	
    	studentBean.setDateOfBirth(dob);
    	
    	studentBean.setDepartment(dept);
    	
    	studentBean.setEmailId(email);
    	
    	studentBean.setLocation(country);
    	
    	studentBean.setPincode(zip);
    	
    	studentBean.setStudName(userName);
    	
    	studentBean.setStudId(id);
    	
    	studentBean.setStreet(streetAddress+","+streetAddress2);
    	
    	studentBean.setState(state);
    	
    	studentBean.setGender(gender); 
    	
    	studentBean.setCgpa(cgpa);
    	
    	UserDAO daoObj = new UserDAO();
    
    	
    	if(daoObj.studentRegister(studentBean)){
    		
    		response.sendRedirect("Login.jsp");	
    	}
    }

}
