package com.helloworld.userreg;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.helloworld.form.Registration;
import com.helloworld.model.Registerusers;
import com.helloworld.service.UserService;

@Controller
@RequestMapping("/registrationreport.html")
public class RegisteredUserReport {

	@Autowired
	private RegistrationValidation registrationValidation;
	
	@Autowired
	private UserService userServiceImpl;

	public void setRegistrationValidation(
			RegistrationValidation registrationValidation) {
		this.registrationValidation = registrationValidation;
	}

	// Display the form on the get request
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView showRegistrationreport() {
		List<Registration> list = registrationValidation.userreport();
		
		ModelAndView model = new ModelAndView("registrationreport");
		
		//Map<String Object> model = new HashMap<String Object>();
		
		//model.addObject("lists", list);
		
		 model.addObject("lists",  prepareListofBean(userServiceImpl.listUSer()));
		 
		

		return model;
	}

	
	
	
	private List<Registration> prepareListofBean(List<Registerusers> registerusers){
		  List<Registration> beans = null;
		  if(registerusers != null && !registerusers.isEmpty()){
		   beans = new ArrayList<Registration>();
		   Registration bean = null;
		   for(Registerusers registeruser : registerusers){
		    bean = new Registration();
		    bean.setUserName(registeruser.getUserName());
		    bean.setLastName(registeruser.getLastName());
		    bean.setAddress1(registeruser.getAddress1());
		    bean.setAddress2(registeruser.getAddress2());
		    bean.setCity(registeruser.getCity());
		    bean.setState(registeruser.getState());
		    bean.setZip(registeruser.getZip());
		    bean.setCountry(registeruser.getCountry());
		    /*add all pending prop*/
		    beans.add(bean);
		   }
		  }
		  return beans;
		 }
}
