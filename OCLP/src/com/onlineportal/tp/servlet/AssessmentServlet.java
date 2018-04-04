
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
	static int testId = 0;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int count = (int) request.getSession().getAttribute("count");
				
		Question[] question = new Question[count];
		AssessmentBean assessment = new AssessmentBean();
		FacultyBean faculty = (FacultyBean)request.getSession().getAttribute("session");
		
		System.out.println(faculty.getFacultyId());
		try{
			String courseId = request.getParameter("courseId");
			String[] quest = request.getParameterValues("question");
			String[] optionA = request.getParameterValues("optionA");
			String[] optionB = request.getParameterValues("optionB");
			String[] optionC = request.getParameterValues("optionC");
			String[] optionD = request.getParameterValues("optionD");
			
		
		for(int i=0;i<count;i++) {
			question[i] = new Question(quest[i], optionA[i], optionB[i], optionC[i], optionD[i]);
		}
		UserDAO dao = new UserDAO();
		assessment.setCourseId(courseId);
		assessment.setQuestion(question);
		assessment.setFacultyId(faculty.getFacultyId());
		assessment.setTestId(faculty.getFacultyId()+"_T_"+(++testId));
		String status = dao.addAssessment(assessment);
		if(status.equals("success")) {
			System.out.println("success");
			session.setAttribute("testId", null);
			session.setAttribute("count", 0);
			session.setAttribute("testId",assessment.getTestId());
			response.sendRedirect("Assessment.jsp");
		}
		else if(status.equals("constraint fault")) {
			System.out.println("failure");
			session.setAttribute("testId", null);
			testId--;
			response.sendRedirect("Assessment.jsp");
		}
		else if(status.equals("null pointer")) {
			System.out.println("failure");
			session.setAttribute("testId", null);
			testId--;
			session.setAttribute("exception", " ff ");
			response.sendRedirect("Assessment.jsp");
		}
		}
		catch(NullPointerException e) {
			session.setAttribute("exception", " ff ");
			response.sendRedirect("Assessment.jsp");
			e.printStackTrace();
		}
		
		
	}

}
