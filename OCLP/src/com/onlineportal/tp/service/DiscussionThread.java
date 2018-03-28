package com.onlineportal.tp.service;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.onlineportal.tp.bean.DiscussionBean;
import com.onlineportal.tp.dao.UserDAO;
import com.onlineportal.tp.util.HibernateUtil;

public class DiscussionThread {

	public List<DiscussionBean> getDiscussionThread(){
		
		Session sess = HibernateUtil.getSessionFactory().openSession();
		List<DiscussionBean> discussionThread = new LinkedList<DiscussionBean>();
		Transaction tc = sess.beginTransaction();
		discussionThread = sess.createQuery("from DiscussionBean").list();
		return discussionThread;
		
	}
}
