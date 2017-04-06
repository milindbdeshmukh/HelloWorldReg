package com.helloworld.userreg;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.helloworld.form.Registration;

@Configuration
@Component("registrationValidator")
public class RegistrationValidation {
	public boolean supports(Class<?> klass) {
		return Registration.class.isAssignableFrom(klass);
	}
	@Bean
	public HibernateJpaSessionFactoryBean sessionFactory() {
	    return new HibernateJpaSessionFactoryBean();
	}
	
	public List userreport()
	{
		
		List<Registration> list = new ArrayList<Registration>();
		
		Registration registration = new Registration();
		
		registration.setUserName("Milind");
		registration.setLastName("Deshmukh");
		registration.setAddress1("address1");
		registration.setAddress2("address2");
		registration.setCity("Detroit");
		registration.setZip("12345");
		registration.setState("MI");
		
		list.add(registration);
		
		return list;
	}
	
	public void validate(Object target, Errors errors) {
		Registration registration = (Registration) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName",
				"NotEmpty.registration.userName",
				"User Name must not be Empty.");
		String userName = registration.getUserName();
		if ((userName.length()) > 50) {
			errors.rejectValue("userName",
					"lengthOfUser.registration.userName",
					"User Name must not more than 50 characters.");
		}
		
	}
}
