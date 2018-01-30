package com.onlineportal.tp.servlet;

import java.io.IOException;
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

import com.onlineportal.tp.bean.FacultyBean;
import com.onlineportal.tp.dao.UserDAO;

/**
 * Servlet implementation class FacultySignUpServlet
 */
@WebServlet("/Home/FacultySignUpServlet")
public class FacultySignUpServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    private List<FacultyBean> _fbList = new LinkedList<FacultyBean>();	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String userName = request.getParameter("username");
        	String id = "F_"+request.getParameter("facultyId");
        	String dept = request.getParameter("dept");
        	String dob = request.getParameter("dob");
    		String streetAddress = request.getParameter("stAddress");
        	String streetAddress2 = request.getParameter("st2Address");
        	String city = request.getParameter("city");
        	String state = request.getParameter("state");
        	String zip = request.getParameter("zipcode");
        	String country = request.getParameter("country");
        	String mobile = request.getParameter("phone number");
        	String email = request.getParameter("email");
        	String experience  = request.getParameter("exp");
        	String faculty_subject =request.getParameter("subject");
        	String gender=request.getParameter("gender");
        	        	
        	_fbList.add(new FacultyBean());
        	_fbList.get(_fbList.size()-1).setFacultyName(userName);
        	_fbList.get(_fbList.size()-1).setFacultyId(id);
        	_fbList.get(_fbList.size()-1).setDepartment(dept);
        	_fbList.get(_fbList.size()-1).setDateOfBirth(dob);
        	_fbList.get(_fbList.size()-1).setCity(city);
        	_fbList.get(_fbList.size()-1).setState(state);
        	_fbList.get(_fbList.size()-1).setPincode(zip);
        	_fbList.get(_fbList.size()-1).setLocation(country);
        	_fbList.get(_fbList.size()-1).setContactNo(mobile);
        	_fbList.get(_fbList.size()-1).setEmailId(email);
        	_fbList.get(_fbList.size()-1).setExperience(experience);
        	_fbList.get(_fbList.size()-1).setFacultyPassword(id);
        	_fbList.get(_fbList.size()-1).setFaculty_subject(faculty_subject);
        	_fbList.get(_fbList.size()-1).setGender(gender);
        	
        	
        	UserDAO daoObj = new UserDAO();
        	if(daoObj.facultyRegister(_fbList.get(_fbList.size()-1))){
        		response.sendRedirect("Login.jsp");
        	}
       }

}
