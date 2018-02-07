package com.onlineportal.tp.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.onlineportal.tp.bean.DiscussionBean;
import com.onlineportal.tp.util.HibernateUtil;

public class AddDiscussion {
		private Session ses = HibernateUtil.getSessionFactory().openSession();
		public boolean addDiscussion(DiscussionBean discussionBean) {
			Transaction tc = ses.beginTransaction();
			try {
				ses.save(discussionBean);
				tc.commit();
				System.out.println(1);
				return true;
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(0);
			return false;
		}
}
