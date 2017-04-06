package com.helloworld.dao;

import java.util.List;


import com.helloworld.model.Registerusers;


public interface UserDao {
	
	public void addUsers(Registerusers registerusers);

	public List<Registerusers> listusers();
	
	
}
