package com.xworkz.app.services;

import com.xworkz.app.Dto.BirdsDto;
import com.xworkz.app.Util.BirdsUtil;

public class Birds {
     private BirdsDto birds[] = new BirdsDto[3];
     private int index = 0;
     
     public String save(BirdsDto dto) {
    	 System.out.println("save method");
    	 if(dto==null) {
    		 return "not saved";
    	 }else {
    		 boolean duplicate = BirdsUtil.checkDetails(birds, dto);
    		 if(duplicate==false) {
    			 if(this.index<birds.length) {
    				 birds[index] = dto;
    				 index++;
    			 }
    		 }
    	 }
    	 return "not saved";
     }
}
