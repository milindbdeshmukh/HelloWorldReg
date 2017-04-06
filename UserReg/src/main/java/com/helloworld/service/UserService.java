package com.helloworld.service;

import java.util.List;


import com.helloworld.model.Registerusers;


public interface UserService {
	
	public void addUsers(Registerusers registerusers);

	public List<Registerusers> listUSer();
	
	
}
