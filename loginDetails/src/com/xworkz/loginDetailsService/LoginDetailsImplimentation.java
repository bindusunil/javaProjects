package com.xworkz.loginDetailsService;

import java.time.LocalDate;
import java.util.Iterator;

import com.xworkz.loginDetailsDto.LoginDetailsDto;
import com.xworkz.loginDetailsUtil.LoginDetailsUtilImplimentation;

public class LoginDetailsImplimentation extends AbstractLoginDetails {
    
	LoginDetailsDto listOfLoginDetails[] = new LoginDetailsDto[3];
	int index = 0;
	LoginDetailsUtilImplimentation loginDetails = new LoginDetailsUtilImplimentation();
	@Override
	public String validateAndSave(LoginDetailsDto logindetailsDto){
		 boolean duplicate = loginDetails.duplicateCheck(listOfLoginDetails,logindetailsDto);
		if(duplicate==false) {
		if(logindetailsDto!=null) {
			if(loginDetails.validateName(logindetailsDto.getUseName())
					&& loginDetails.validateEmail(logindetailsDto.getEmail())
					&& loginDetails.validatePassword(logindetailsDto.getPassword())) {
				if(index<listOfLoginDetails.length) {
					listOfLoginDetails[index] = logindetailsDto;
					index++;
					return "saved";
				}
			}
		}
		}
		return "not saved";
	}
	@Override
	public void read() {
		for(LoginDetailsDto dto:listOfLoginDetails) {
			System.out.println("the instance is: "+dto);
		}
		
	}
	
	@Override
	public String searchByName(String name) {
		for (LoginDetailsDto dto:listOfLoginDetails) {
			if(name!=null && name.equals(dto.getUseName())) {
				System.out.println("search element is found");
			}
		}
		
		return "search element is not found";
	}
	@Override
	public String update(String oldName,String newName) {
		for (LoginDetailsDto dto:listOfLoginDetails) {
			if(oldName!=null && oldName.equals(dto.getUseName()) && loginDetails.validateName(newName)){
				dto.setUseName(newName);
				System.out.println("updated successfully");
				return "updated";
			}
		}

		return "not updated";
	}
	@Override
	public String update(String oldname, LoginDetailsDto dto,String newName) {
		for(LoginDetailsDto newdto:listOfLoginDetails) {
			if(oldname!=null && oldname.equals(dto.getUseName()) && loginDetails.validateName(oldname)) {
				dto.setUseName(newName);
				dto.setEmail(newName+"@gmail.com");
				dto.setPassword(newName+"123");
				System.out.println("updated successfully");
				return "updated";
			}
		}
		return "not updated";
	}
	
}
