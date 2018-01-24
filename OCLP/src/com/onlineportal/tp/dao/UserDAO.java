package com.onlineportal.tp.dao;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.onlineportal.tp.bean.AdministratorBean;
import com.onlineportal.tp.bean.FacultyBean;
import com.onlineportal.tp.bean.FacultyBean;
import com.onlineportal.tp.bean.StudentBean;
import com.onlineportal.tp.util.HibernateUtil;

public class UserDAO {
	private Session sess = HibernateUtil.getSessionFactory().openSession();
	@SuppressWarnings({ "unchecked" })
	//-------- Admin Sign in---------------------
	public AdministratorBean checkAdministratorSignIn(String uname,String password ){
		Transaction tc = sess.beginTransaction();
		try{
				
		List<AdministratorBean> _abList = new LinkedList<AdministratorBean>();
				
			_abList = sess.createQuery(" from admin where rollno = :uname").setParameter(uname,password).list();	
			if(_abList.size() == 1 && _abList.get(0).getPassword().equals(password)){
				tc.commit();
				return  _abList.get(0);
			}
		
		}	
		catch(Exception e){
			System.out.println(e);
		}
		return null;
		
	}
	
	//------------- Faculty Sign In -------------------
	
	public FacultyBean checkFacultySignIn(String uname,String password ){
		Transaction tc = sess.beginTransaction();
		try{
				
		List<FacultyBean> _fbList = new LinkedList<FacultyBean>();
		_fbList = sess.createQuery("Select password from admin where rollno = :uname").list();	
			if(_fbList.size() == 1 && _fbList.get(0).getFacultyPassword().equals(password)){
				tc.commit();
				return  _fbList.get(0);
			}
		
		}	
		catch(Exception e){
			System.out.println(e);
		}
		return null;
		
	}
	
	//------------- Student Sign In ----------------------
	
	public StudentBean checkStudentSignIn(String uname,String password ){
		Transaction tc = sess.beginTransaction();
		try{
				
		List<StudentBean> _sbList = new LinkedList<StudentBean>();
								
			_sbList = sess.createQuery("Select studpassword from student where studid = :uname").setParameter(uname, password).list();	
			System.out.println(_sbList.get(0).getStudId());
			
			if(_sbList.size() == 1 && _sbList.get(0).getStudPassword().equals(password)){
				tc.commit();
				return  _sbList.get(0);
			}
		
		}	
		catch(Exception e){
			System.out.println(e);
		}
		return null;
		
	}
	
	//--------- Register new Student -------------------------
	public boolean studentRegister(StudentBean studentBeanObject){
		Transaction tc = sess.beginTransaction();
		try{
			sess.save(studentBeanObject);
			tc.commit();
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
			tc.commit();
			return true;
		}
		catch(Exception e){
			System.out.println(e);
		}
		return false;
	}
		

		
		
}
	
	

