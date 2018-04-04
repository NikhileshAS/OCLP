package com.onlineportal.tp.dao;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

import com.onlineportal.tp.bean.AdministratorBean;
import com.onlineportal.tp.bean.AssessmentBean;
import com.onlineportal.tp.bean.CourseBean;
import com.onlineportal.tp.bean.FacultyBean;
import com.onlineportal.tp.bean.StudentBean;
import com.onlineportal.tp.service.EmailDispatcher;
import com.onlineportal.tp.util.HibernateUtil;


public class UserDAO {
	private Session sess = HibernateUtil.getSessionFactory().openSession();
	
	private EmailDispatcher emailDispatcher;

	@SuppressWarnings({ "unchecked" })
	//-------- Admin Sign in---------------------
	public AdministratorBean checkAdministratorSignIn(String uname,String password )
	{
		Transaction tc = sess.beginTransaction();
		try{
				
		List<AdministratorBean> _abList = new LinkedList<AdministratorBean>();
				
			_abList = sess.createQuery(" from AdministratorBean").list();	
			tc.commit();
			for(AdministratorBean administratorBean : _abList) {
				if(administratorBean.getAdminId().equals(uname) && administratorBean.getPassword().equals(password)) {
				System.out.println(administratorBean.getAdminId());
				sess.close();
				return administratorBean;
				}
			}
	 }	
		catch(Exception e){
			System.out.println(e);
		}
		return null;
		
	}
	
	//------------- Faculty Sign In -------------------
	
	public FacultyBean checkFacultySignIn(String uname,String password )
	{
		Transaction tc = sess.beginTransaction();
		try{
				List<FacultyBean> _fbList = new LinkedList<FacultyBean>();
       _fbList = sess.createQuery("from FacultyBean").list();	
		tc.commit();
		for(FacultyBean facultyBean : _fbList) {
				if(facultyBean.getFacultyId().equals(uname) && facultyBean.getFacultyPassword().equals(password)) {
					sess.close();
					return facultyBean;
				}

			}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

	
	//------------- Student Sign In ----------------------
	
	public StudentBean checkStudentSignIn(String uname,String password )
	{
		Transaction tc = sess.beginTransaction();
		try
		{
	  List<StudentBean> _sbList = new LinkedList<StudentBean>();
								
			_sbList = sess.createQuery("from StudentBean ").list();	
			
			for(StudentBean studentBean : _sbList)
			{
				if(studentBean.getStudId().equals(uname) && studentBean.getStudPassword().equals(password)){
					System.out.println(studentBean.getStudId()+" "+studentBean.getStudName());
					sess.close();
					return studentBean;
				}
				return null;
			}
		
	}
		catch(Exception e){
			System.out.println(e);
		}
		return null;
		}
	
	//--------- Register new Student -------------------------
	public boolean studentRegister(StudentBean studentBeanObject)
	{
		Transaction tc = sess.beginTransaction();
		try{
			sess.save(studentBeanObject);
			System.out.println(studentBeanObject.getEmailId());
			emailDispatcher = new EmailDispatcher(studentBeanObject.getEmailId(),"\n Here is your authentication details: \n User Name: "+studentBeanObject.getStudId()+"\n Password: "+ studentBeanObject.getStudPassword());
			emailDispatcher.sendEmail();
			sess.getTransaction().commit();
			sess.close();
			return true;
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		return false;
	}
	
	//------------- Register new Faculty ----------------------
	public boolean facultyRegister(FacultyBean facultyBeanObject){
		Transaction tc = sess.beginTransaction();
		try{
			sess.save(facultyBeanObject);
			String email = facultyBeanObject.getEmailId();			
			System.out.println(email+" "+facultyBeanObject.getFacultyPassword());
			emailDispatcher = new EmailDispatcher(email, "\n Here is your authentication details:  \n User Name: "+facultyBeanObject.getFacultyId()+"\n Password: "+facultyBeanObject.getFacultyPassword());
			emailDispatcher.sendEmail();
			sess.getTransaction().commit();
			sess.close();
			return true;
		}
		catch(Exception e){
			System.out.println(e);
		}
		return false;
	}
	//------add assessment-------
	public String  addAssessment(AssessmentBean assessment) {
		Transaction tc = sess.beginTransaction();
		try {
			sess.save(assessment);
			sess.getTransaction().commit();
			sess.close();
			return "success";
		}
		catch(ConstraintViolationException e) {
			e.printStackTrace();
			return	"constraint fault";	
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			return "null pointer";
		}
		
	}
	
	//--------------------- Add Course-----------------------
	
	public boolean addCourse(CourseBean courseObj) {
		Transaction tc = sess.beginTransaction();
		try {
			sess.save(courseObj);
			sess.getTransaction().commit();
			sess.close();
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
