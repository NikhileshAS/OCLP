  package com.onlineportal.tp.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineportal.tp.bean.BookBean;
import com.onlineportal.tp.bean.FacultyBean;
import com.onlineportal.tp.dao.UserDAO;
import com.sun.xml.internal.ws.wsdl.writer.document.Part;
@WebServlet("/Faculty/BookServlet")
@MultipartConfig
public class BookServlet extends HttpServlet
{
	private  BookBean bookBean = new BookBean();
	
	protected void doget(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
		
		FacultyBean facultyBean=(FacultyBean) request.getSession().getAttribute("session");
		String facultyId=facultyBean.getFacultyId();
		
		// String sub = session.getAttribute("userId").toString();
		ServletContext context=getServletContext();  
		String sub=(String)context.getAttribute("user");
	   //String sub=request.getParameter("user");
	   System.out.println("subject"+sub);
	   InputStream inputStream = null;
	   final Part filePart = (Part) request.getPart("file");
	   if (filePart != null)
	   {
         inputStream = ((ServletRequest) filePart).getInputStream();
       }
	   System.out.println("inputstream="+inputStream );
	   
	   
	   
	   
	   if(sub.equals("DataStructures"))
	    {
		bookBean.setDataStructure((Blob) inputStream);
		bookBean.setFacultyId(facultyId);
	    }
	   else if(sub.equals("C"))
	   {
		  bookBean.setC( (Blob)inputStream); 
		  bookBean.setFacultyId(facultyId);
	   }
	   else if(sub.equals("C++"))
	   {
		   bookBean.setCpp( (Blob)inputStream);
		   bookBean.setFacultyId(facultyId);
	   }
	   else if(sub.equals("OS"))
	   {
		   bookBean.setOs((Blob) inputStream);
		   bookBean.setFacultyId(facultyId); 
	   }
	   else if(sub.equals("Java"))
	   {
		   bookBean.setJava((Blob) inputStream);
		   bookBean.setFacultyId(facultyId);
	   }
	   else if(sub.equals("ComputerNetworks"))
	   {
		   bookBean.setCn((Blob) inputStream);
		   bookBean.setFacultyId(facultyId);
	   }
	   else if(sub.equals("DBMS"))
	   {
		   bookBean.setDbms((Blob) inputStream);
		   bookBean.setFacultyId(facultyId);
	   }
	   else if(sub.equals("Aptitude"))
	   {
		   bookBean.setAptitude((Blob) inputStream);
		   bookBean.setFacultyId(facultyId);
	   }
	   
		   
		UserDAO daoObj = new UserDAO();
	
		if(daoObj.uploadBook(bookBean))
		{
			response.sendRedirect("Login.jsp");
		}
		else
		{
			response.sendRedirect("error.html");	
		}
		
	}
}


