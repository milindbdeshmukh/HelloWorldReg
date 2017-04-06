package com.helloworld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.helloworld.dao.UserDao;
import com.helloworld.model.Registerusers;



@Service("userservice")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
@PropertySource({"classpath:application.properties"})
public class UserServiceImpl implements UserService {

	 @Autowired
	 private UserDao userDao;
	
	public void addUsers(Registerusers registerusers) {
		// TODO Auto-generated method stub
		userDao.addUsers(registerusers);
		
	}

	public List<Registerusers> listUSer() {
		// TODO Auto-generated method stub
		 return userDao.listusers();
	}

	

}
