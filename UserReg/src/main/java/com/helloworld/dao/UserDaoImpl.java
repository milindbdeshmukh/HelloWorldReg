package com.helloworld.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.helloworld.model.Registerusers;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addUsers(Registerusers registerusers) {
		sessionFactory.getCurrentSession().saveOrUpdate(registerusers);
	}

	@SuppressWarnings("unchecked")
	public List<Registerusers> listusers() {
		return (List<Registerusers>) sessionFactory.getCurrentSession().createCriteria(Registerusers.class).list();
	}

	

}
