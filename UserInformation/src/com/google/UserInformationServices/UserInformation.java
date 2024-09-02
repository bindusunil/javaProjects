package com.google.UserInformationServices;

import com.google.UserInformationServices.UserInformationAbstract;
import com.google.userinformation.constant.GenderConstant;
import com.goole.userinformation.dto.UserInformationDto;

public class UserInformation extends UserInformationAbstract{

	@Override
	public String onSave(UserInformationDto userinformation) {
		// TODO Auto-generated method stub
		//start
		    System.out.println("save method started");
		//logic
		//duplicate check
			if(userinformation!=null && userinformation.getUserName().length()>=3) {
				System.out.println("name is saved");
			}else if(userinformation.getUserName().isBlank()&&userinformation.getUserName().isEmpty()) {
				System.out.println("name is not valid");
			}
		System.out.println("save method ended");
		return "not saved successfully";
}
   public boolean emailValid(String email) {
	   String emailid[] = email.split("");
	   for(String valid:emailid) {
		 if(valid.contains("@")) {
			 return true;
		 }
	   }
	   return false;
   }
   public String emialCheck(UserInformationDto userinformatio) {
	   System.out.println("email check method started");
	   //logic
	   //duplicatecheck
	   if(userinformatio!=null && emailValid(userinformatio.getEmailId())) {
		   System.out.println("email id is saved");
		   return "saved";
	   }else if(userinformatio.getEmailId().isBlank()&&userinformatio.getEmailId().isEmpty()) {
		   System.out.println("email id is not valid");
	   }
	   
	   System.out.println("email check method ended");
	   return "null";
   }
   public boolean phoneValid(long phoneNumber) {
	   String num = Long.toString(phoneNumber);
	   int digits = num.length();
	   if(digits==10) {
		   return true;
	   }
	   return false;
   }
   public String phoneCheck(UserInformationDto userinformation) {
	   System.out.println("phonecheck method started");
	   //logic
	   //duplicatecheck
	   if(userinformation!=null && phoneValid(userinformation.getContactNumber())) {
		   System.out.println("phone number is saved");
		   return "saved";
	   }else{
		   System.out.println("phone number is not valid");
	   }
	     
	   System.out.println("phonecheck method ended");
	   return "not saved";
   }
   public boolean ageValid(int age) {
	   if(age>0 && age>=18) {
		   return true;
	   }
	   return false;
   }
   public String ageCheck(UserInformationDto userinformation) {
	   System.out.println("age check method started");
	   //logic
	   //duplicate check
	   if(userinformation!=null && ageValid(userinformation.getAge())) {
		   System.out.println("age saved");
		   return "age saved successfully";
	   }else{
		   System.out.println("age not saved");
	   }
	   System.out.println("age check method ended");
	   return "age not saved successfully";
   }
   public boolean educationValid(String education) {
	  if(education!=null && education.length()>=2) {
		  return true;
	  }
	  return false;
   }
   public String educationCheck(UserInformationDto userinformation) {
	   System.out.println("education check method started");
	   if(userinformation!=null && educationValid(userinformation.getEducation())) {
		   System.out.println("education saved successfully");   
	   }
	   else if(userinformation.getEducation().isBlank()&&userinformation.getEducation().isEmpty()){
		   System.out.println("education not saved successfully");
	   }
	   System.out.println("education check method ended");
	   return "education not saved";
   }
   public boolean genderValid(GenderConstant gender) {
	   if(gender.equals(gender.FEMALE) || gender.equals(gender.MALE)) {
		   return true;
	   }
	   return false;
   }
   public String genderCheck(UserInformationDto userinformation) {
	   System.out.println("gender check method started");
	   if(userinformation!=null && genderValid(userinformation.getGender())) {
		   System.out.println("gender saved successfully");
	   }else {
		   System.out.println("gender is not valid");
	   }
	   System.out.println("gender check method ended");
	   return "gender not saved successfully";
   }
   public boolean designationValid(String designation) {
	   if(designation!=null && designation.length()>=3) {
		   return true;
	   }
	   return false;
   }
   public String desigantionCheck(UserInformationDto userinformation) {
	   System.out.println("designationcheck method started");
	   if(userinformation!=null && designationValid(userinformation.getDesignation())) {
		   System.out.println("desigantion saved successfully");
	   }else if(userinformation.getDesignation().isBlank() && userinformation.getDesignation().isEmpty()) {
		   System.out.println("designation is not valid");
	   }
	   System.out.println("designation is not saved successfully");
	   return "designation not saved";
	   }
   public boolean addressValid(String address) {
	   if(address!=null && address.length()>=10) {
		   return true;
	   }
	   return false;
   }
   public String addressCheck(UserInformationDto userinformation) {
	   System.out.println("address check method is started");
	   if(userinformation!=null && addressValid(userinformation.getAddress())) {
		   System.out.println("address saved successfully");
	   }else if(userinformation.getAddress().isBlank() && userinformation.getAddress().isEmpty()) {
		   System.out.println("address is not valid");
	   }
	   System.out.println("address is not saved successfully");
	   return "address is not saved";
   }
   public boolean adharValid(long adhar) {
	   String num = Long.toString(adhar);
	   int digits = num.length();
	   if(digits==12) {
		   return true;
	   }
	   return false;
   }
   public String adharCheck(UserInformationDto userinformation) {
	   System.out.println("adharcheck method started");
	   if(userinformation!=null && adharValid(userinformation.getAdharCardNumber())) {
		   System.out.println("adhar number saved successfully");
	   }else {
		   System.out.println("adhar number is not valid");
	   }
	   System.out.println("adharcheck method is ended");
	   return "adhar not saved";
   }
   
   }

