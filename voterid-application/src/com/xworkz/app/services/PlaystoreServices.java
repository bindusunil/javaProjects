package com.xworkz.app.services;

import com.xworkz.app.Dto.PlaystoreDto;
import com.xworkz.app.Util.PlaystoreUtil;

public class PlaystoreServices {
     public PlaystoreDto listOfApps[] = new PlaystoreDto[3];
     private int index = 0;
     
     //create
     
     public String save(PlaystoreDto dto) {
    	 if(dto == null) {
    		 System.out.println("dto is null, can't save");
    		 return "dto not saved";
    	 }else {
    		 boolean duplicateResult = PlaystoreUtil.checkDuplicate(listOfApps, dto);
    		 if(duplicateResult==false) {
    			 if(this.index<listOfApps.length) {
    				 listOfApps[index]=dto;
    				 index++;
    				 System.out.println("saved");
    				 return "saved succesfully";
    			 }
    		 }
       	 }
    	 System.out.println("not saved");
		 return "not saved";
      }
     public void read() {
    	 for(PlaystoreDto appdto:listOfApps) {
    		 System.out.println(appdto);
    	 }
     }
     public PlaystoreDto searchApp(String appName) {
    	 for(PlaystoreDto dto:listOfApps){
    		 if(dto!=null && dto.getApplicationName().equals(appName)) {
    		 System.out.println(dto);
    		 } 
    	 }
    	 return null;
     }
     public PlaystoreDto searchByType(String appType) {
    	 for(PlaystoreDto dto:listOfApps) {
    		 if(dto!=null && dto.getApplicationType().equals(appType)) {
    			 System.out.println(dto);
    		 }
    	 }
    	 return null;
     }
     public PlaystoreDto searchBySize(String appSize) {
    	 for(PlaystoreDto dto:listOfApps) {
    		 if(dto!=null && dto.getApplicationSize().equals(appSize)) {
    			 System.out.println(dto);
    		 }
    	 }
    	 return null;
     }
     public PlaystoreDto searchByRdate(String appRDate) {
    	 for(PlaystoreDto dto:listOfApps) {
    		 if(dto!=null && dto.getApplicationRdate().equals(appRDate)) {
    			 System.out.println(dto);
    		 }
    	 }
    	 return null;
     }
}
