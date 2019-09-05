package com.incture.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.incture.vms.MeetingTable;


//import com.incture.hib.vms.NotificationTable;
@Repository
public class MeetingDao implements MeetingDaoLocal {

	@Autowired
	private SessionFactory sessionFactory;
	Session s;
	
	public Session getSession(){
		try {
		return sessionFactory.getCurrentSession();
		} catch(HibernateException e) {
			return sessionFactory.openSession();
		}
	}
	
	public void save(MeetingTable nt) {
		// TODO Auto-generated method stub
		getSession().save(nt);
		
	}
	

}
