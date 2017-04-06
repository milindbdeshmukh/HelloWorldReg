package com.helloworld.userreg;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import javax.validation.Valid;

import com.helloworld.form.Registration;
import com.helloworld.model.Registerusers;
import com.helloworld.service.UserService;
import com.helloworld.service.UserServiceImpl;
import com.helloworld.userreg.RegistrationValidation;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@EnableAutoConfiguration
@RequestMapping("/registrationform.html")
public class HelloWorldController {
	
	@Autowired
	private RegistrationValidation registrationValidation;
	
	@Autowired
	private UserService userService;
	
	
	
	
	/*@Autowired
	private Registerusers registerusers;*/

	public void setRegistrationValidation(
			RegistrationValidation registrationValidation) {
		this.registrationValidation = registrationValidation;
	}
	

	// Display the form on the get request
	@RequestMapping(method = RequestMethod.GET)
	public String showRegistration(Map model) {
		Registration registration = new Registration();
		model.put("registration", registration);
		return "registrationform";
	}

	// Process the form.
	@RequestMapping(method = RequestMethod.POST)
	public String processRegistration(@Valid Registration registration,
			BindingResult result) {
		
		Registerusers registerusers = new Registerusers();
		// set custom Validation by user
		registrationValidation.validate(registration, result);
		if (result.hasErrors()) {
			return "registrationform";
		}
		try {
			BeanUtils.copyProperties(registerusers, registration);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		userService.addUsers(registerusers);
		
		return "registrationsuccess";
	}
}