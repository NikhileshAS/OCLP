package com.onlineportal.tp.dao;
import java.util.LinkedList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.onlineportal.tp.bean.AdministratorBean;
import com.onlineportal.tp.bean.AssessmentBean;
import com.onlineportal.tp.bean.FacultyBean;
import com.onlineportal.tp.bean.StudentBean;
import com.onlineportal.tp.service.EmailDispatcher;
import com.onlineportal.tp.util.HibernateUtil;

public class UserDAO {
	private Session sess = HibernateUtil.getSessionFactory().openSession();
	
	private EmailDispatcher emailDispatcher = new EmailDispatcher();

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
			emailDispatcher.sendEmail(studentBeanObject.getEmailId(),"Here is your authentication details: \n User Name: "+studentBeanObject.getStudId()+"\n Password: "+ studentBeanObject.getStudPassword());
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
			
			System.out.println(facultyBeanObject.getEmailId()+" "+facultyBeanObject.getFacultyPassword());
			emailDispatcher.sendEmail(facultyBeanObject.getEmailId(), "Here is your authentication details: \n User Name: "+facultyBeanObject.getFacultyId()+"\n Password: "+facultyBeanObject.getFacultyPassword());
			sess.getTransaction().commit();
			sess.close();
			return true;
		}
		catch(Exception e){
			System.out.println(e);
		}
		return false;
	}
	
	public boolean addAssessment(AssessmentBean assessment) {
		Transaction tc = sess.beginTransaction();
		try {
			sess.save(assessment);
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