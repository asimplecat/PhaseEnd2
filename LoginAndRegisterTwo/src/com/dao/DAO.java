package com.dao;

import java.sql.ResultSet;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Registration;

import com.dal.HibernateUtility;

public class DAO {
	public static boolean login(String username , String password)
	{
		Session sesh = HibernateUtility.getSession();
		Transaction tx = sesh.beginTransaction();
		
		Query query = sesh.createQuery("FROM Registration WHERE USERNAME = '" + username + "'");
		List<Registration> sam = query.list();
		System.out.println(sam);
		if (sam.size() != 0 && sam.get(0).getPassword().equals(password))
		{
			
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static boolean register(Registration r)
	{
		Session sesh = HibernateUtility.getSession();
		Transaction tx = sesh.beginTransaction();
		
		sesh.save(r);
		tx.commit();
		//Query query = sesh.createQuery("FROM REGISTRATION WHERE USERNAME = '" + username + "'");
		
		return true;
	}
}
