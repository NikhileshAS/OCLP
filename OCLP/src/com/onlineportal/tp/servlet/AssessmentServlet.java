<<<<<<< Upstream, based on branch 'master' of https://github.com/NikhileshAS/OCLP.git
package com.onlineportal.tp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineportal.tp.bean.AssessmentBean;
import com.onlineportal.tp.bean.FacultyBean;
import com.onlineportal.tp.bean.Question;
import com.onlineportal.tp.dao.UserDAO;


@WebServlet("/Faculty/AssessmentServlet")
public class AssessmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int count = (int) request.getSession().getAttribute("count");
		
		Question[] question = new Question[count];
		AssessmentBean assessment = new AssessmentBean();
		FacultyBean faculty = (FacultyBean)request.getSession().getAttribute("session");
		String[] quest = request.getParameterValues("question");
		String[] optionA = request.getParameterValues("optionA");
		String[] optionB = request.getParameterValues("optionB");
		String[] optionC = request.getParameterValues("optionC");
		String[] optionD = request.getParameterValues("optionD");
				
		for(int i=0;i<count;i++) {
			
			question[i].setQuestion(quest[i]);
			question[i].setOptionA(optionA[i]);
			question[i].setOptionB(optionB[i]);
			question[i].setOptionC(optionC[i]);
			question[i].setOptionD(optionD[i]);
		}
		UserDAO dao = new UserDAO();
		assessment.setQuestion(question);
		assessment.setFacultyId(faculty.getFacultyId());
		assessment.setTestId();
		if(dao.addAssessment(assessment)) {
			session.setAttribute("testId",assessment.getTestId());
			response.sendRedirect("Assessment.jsp");
		}
		else {
			session.setAttribute("testId", null);
			response.sendRedirect("Assessment.jsp");
		}
		
	}

}
=======
package com.onlineportal.tp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineportal.tp.bean.AssessmentBean;
import com.onlineportal.tp.bean.FacultyBean;
import com.onlineportal.tp.bean.Question;
import com.onlineportal.tp.dao.UserDAO;


@WebServlet("/Faculty/AssessmentServlet")
public class AssessmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int count = (int) request.getSession().getAttribute("count");
		
		Question[] question = new Question[count];
		AssessmentBean assessment = new AssessmentBean();
		FacultyBean faculty = (FacultyBean)request.getSession().getAttribute("session");
		String[] quest = request.getParameterValues("question");
		String[] optionA = request.getParameterValues("optionA");
		String[] optionB = request.getParameterValues("optionB");
		String[] optionC = request.getParameterValues("optionC");
		String[] optionD = request.getParameterValues("optionD");
				
		for(int i=0;i<count;i++) {
			
			question[i].setQuestion(quest[i]);
			question[i].setOptionA(optionA[i]);
			question[i].setOptionB(optionB[i]);
			question[i].setOptionC(optionC[i]);
			question[i].setOptionD(optionD[i]);
		}
		UserDAO dao = new UserDAO();
		assessment.setQuestion(question);
		assessment.setFacultyId(faculty.getFacultyId());
		assessment.setTestId();
		if(dao.addAssessment(assessment)) {
			session.setAttribute("testId",assessment.getTestId());
			response.sendRedirect("Assessment.jsp");
		}
		else {
			session.setAttribute("testId", null);
			response.sendRedirect("Assessment.jsp");
		}
		
	}

}
>>>>>>> e5f0b52 Assessment
