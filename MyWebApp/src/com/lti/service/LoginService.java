package com.lti.service;

public class LoginService {

	public boolean authenticate(String uname, String pwd) {
		if(uname.equals("bhavya") && pwd.equals("123"))
			return true;
		else
			return false;
		
	}
	

}
