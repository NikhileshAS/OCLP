

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

    private FacultyBean facultyBean = new FacultyBean();
    
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
        	System.out.println(experience);
        	String[] subs = request.getParameterValues("course");

        	String courses = "";
        	
        	for(String s : subs) {
        		courses += s;
        	}
        	
        	String gender=request.getParameter("gender");
        	
        	System.out.println(courses);

        	        	

        	
        	facultyBean.setFacultyName(userName);

        	facultyBean.setFacultyId(id);

        	facultyBean.setDepartment(dept);

        	facultyBean.setDateOfBirth(dob);

        	facultyBean.setCity(city);

        	facultyBean.setState(state);

        	facultyBean.setPincode(zip);

        	facultyBean.setLocation(country);

        	facultyBean.setContactNo(mobile);

        	facultyBean.setEmailId(email);

        	facultyBean.setExperience(experience);

        	facultyBean.setFacultyPassword(id);

        	facultyBean.setCoursesEnrolled(courses.toString());

        	facultyBean.setGender(gender);

        	

        	

        	UserDAO daoObj = new UserDAO();

        	if(daoObj.facultyRegister(facultyBean)){

        		response.sendRedirect("Login.jsp");

        	}

       }



}
