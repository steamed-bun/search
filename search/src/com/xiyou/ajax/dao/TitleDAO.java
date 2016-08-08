package com.xiyou.ajax.dao;

import java.util.List;

import org.hibernate.Transaction;

import com.xiyou.ajax.entities.Title;
import com.xiyou.ajax.hibernate.HibernateUtils;


public class TitleDAO {

	public static List<Title> getList(String likeString){
		
		Transaction transaction = HibernateUtils.getInit().getSession().beginTransaction();
		
		String hql = "from Title t where t.text like '%" + likeString + "%'";
		@SuppressWarnings("unchecked")
		List<Title> list = HibernateUtils.getInit().getSession()
										 .createQuery(hql)
										 .list(); 
		transaction.commit();
		return list; 
	}
	
}
