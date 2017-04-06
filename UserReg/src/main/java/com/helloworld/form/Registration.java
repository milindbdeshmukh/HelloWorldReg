package com.helloworld.form;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Registration implements Comparable<Registration>{
	@NotEmpty
	@Length(max = 20)
	private String userName;
	

	@NotEmpty
	@Length(max = 20)
	private String lastName;
	@NotEmpty
	@Length(max = 40)
	private String address1;
	private String address2;
	@NotEmpty
	@Length(max = 40)
	private String city;
	@NotEmpty
	private String state;
	@NotEmpty
	@Length(min = 5, max = 5, message = "{zip.length}")
    @Pattern(regexp = "[0-9]+")
	private String zip;
	private  String country="US";
	
	
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public int compareTo(Registration o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	/*public int  compareTo(Registration registration) {
        return registration.userName = this.userName;
    }*/
	

}