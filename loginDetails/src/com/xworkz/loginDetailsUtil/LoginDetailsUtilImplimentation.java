package com.xworkz.loginDetailsUtil;

import com.xworkz.loginDetailsDto.LoginDetailsDto;

public class LoginDetailsUtilImplimentation extends AbstractLoginDetailsUtil {

	@Override
	public boolean validateName(String userName) {
		if(userName!=null && userName.length()>=3) {
			System.out.println("user name is valid ");
			return true;
		}else {
			System.out.println("user name is not valid");
			return false;
		}
		
	}

	@Override
	public boolean validateEmail(String email) {
	    if(email!=null && email.contains("@")) {
	    	System.out.println("email is valid");
	    	return true;
	    }else {
	    	System.out.println("email is not valid");
	    	return false;
	    }
		
	}

	@Override
	public boolean validatePassword(String password) {
		if(password!=null && password.length()>=8 && password.length()<=16) {
			System.out.println("password is valid");
			return true;
		}else {
			System.out.println("password is not valid");
			return false;
		}
		
	}

	@Override
	public  boolean duplicateCheck(LoginDetailsDto[] listOfLoginDetails, LoginDetailsDto loginDetailsDto) {
		System.out.println("duplicate check");
	    for( LoginDetailsDto logindto:listOfLoginDetails) {
	    	if(logindto!=null && logindto.equals(loginDetailsDto)) {
	    		return true;
	    	}
	    }
		return false;
	}
}