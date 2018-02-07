package com.onlineportal.tp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineportal.tp.bean.DiscussionBean;
import com.onlineportal.tp.service.AddDiscussion;


@WebServlet("/Faculty/DiscussionServlet")
public class DiscussionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
         protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		String id = (String) request.getParameter("roll");
    		String name = (String)request.getParameter("name");
    		String message = (String)request.getParameter("msg");
    		System.out.println(id+" "+name+" "+message);
    		HttpSession session = request.getSession(true);
    		DiscussionBean discussionBean = new DiscussionBean(id, name, message);
    		
    		boolean val = new AddDiscussion().addDiscussion(discussionBean);
    		System.out.println(discussionBean.getRollNum());
    		if(val) {
    			session.setAttribute("discuss", "added");
    			
    		}
    		else {
    			session.setAttribute("discuss", "failed");
    		}
    		
    		response.sendRedirect("Discussion_form.jsp");
    			
    	}

	

}
