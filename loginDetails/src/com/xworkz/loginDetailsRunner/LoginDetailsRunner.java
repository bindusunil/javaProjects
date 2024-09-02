package com.xworkz.loginDetailsRunner;

import java.time.LocalDateTime;

import com.xworkz.loginDetailsDto.LoginDetailsDto;
import com.xworkz.loginDetailsService.AbstractLoginDetails;
import com.xworkz.loginDetailsService.LoginDetailsImplimentation;
import com.xworkz.loginDetailsUtil.AbstractLoginDetailsUtil;
import com.xworkz.loginDetailsUtil.LoginDetailsUtilImplimentation;

public class LoginDetailsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginDetailsDto loginDetailsDto = new LoginDetailsDto();
        AbstractLoginDetails login = new LoginDetailsImplimentation();
        loginDetailsDto.setUseName("bindu");
        loginDetailsDto.setEmail("bindu@gmnail.com");
        loginDetailsDto.setPassword("bindu123");
        loginDetailsDto.setLoginDateTime(LocalDateTime.now());
         //System.out.println(loginDetailsDto);
         String saveResult = login.validateAndSave(loginDetailsDto);
         System.out.println("saved result: "+saveResult);
         
         LoginDetailsDto newuser = new LoginDetailsDto();
         newuser.setUseName("mahadevi");
         newuser.setEmail("mahadevi@gmnail.com");
         newuser.setPassword("mahadevi123");
         newuser.setLoginDateTime(LocalDateTime.of(2024, 8, 30, 11, 30));

         String saveResult1 = login.validateAndSave(newuser);
         System.out.println("saved result: "+saveResult1);
         
         LoginDetailsDto anotheruser = new LoginDetailsDto();
         anotheruser.setUseName("vinoda");
         anotheruser.setEmail("vinoda@gmnail.com");
         anotheruser.setPassword("vinoda123");
         anotheruser.setLoginDateTime(LocalDateTime.of(2024, 8, 30, 11, 30));

         String saveResult2 = login.validateAndSave(anotheruser);
         System.out.println("saved result: "+saveResult2);
         
         
         login.read();
         login.searchByName("bindu");
         login.searchByName("mahadevi");
         login.searchByName("vinoda");
         
         String updateResult = login.update("bindu", "aishwarya");
         System.out.println(updateResult);
         login.read();
         
         String updateResult1 = login.update("aishwarya", loginDetailsDto,"bindu");
         System.out.println(updateResult1);
         login.read();
         
         }

}
