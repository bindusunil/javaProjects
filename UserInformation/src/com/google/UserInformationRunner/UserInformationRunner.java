package com.google.UserInformationRunner;

import com.google.UserInformationServices.UserInformation;
import com.goole.userinformation.dto.UserInformationDto;
import com.google.UserInformationServices.UserInformationAbstract;
import com.google.userinformation.constant.GenderConstant;

public class UserInformationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			UserInformationDto userinformation = new UserInformationDto();
			UserInformation userinfo = new UserInformation();
			
			userinformation.setUserName("remo");
			userinfo.onSave(userinformation);
			
			//userinformation.setUserName("");
			//userinfo.onSave(userinformation);
			
			userinformation.setEmailId("remo123@gmail.com");
			userinfo.emialCheck(userinformation);
			
			//userinformation.setEmailId("remo123@gmail.com");
			//userinfo.emialCheck(userinformation);
			
			//userinformation.setContactNumber(8618808830L);
			//userinfo.phoneCheck(userinformation);
			
			userinformation.setContactNumber(8618808830L);
			userinfo.phoneCheck(userinformation);
			
			//userinformation.setAge(18);
			//userinfo.ageCheck(userinformation);
			
			userinformation.setAge(17);
			userinfo.ageCheck(userinformation);

			//userinformation.setEducation("B.E");
			//userinfo.educationCheck(userinformation);
			
			userinformation.setEducation("B");
			userinfo.educationCheck(userinformation);
			
			userinformation.setGender(GenderConstant.FEMALE);
			userinfo.genderCheck(userinformation);
			
			//userinformation.setGender(null);
			//userinfo.genderCheck(userinformation);
			
			//userinformation.setDesignation("developer");
			//userinfo.desigantionCheck(userinformation);
			
			userinformation.setAdharCardNumber(367528640984L);;
			userinfo.adharCheck(userinformation);
			
			//userinformation.setAdharCardNumber(36752864098L);;
			//userinfo.adharCheck(userinformation);

	}

}
