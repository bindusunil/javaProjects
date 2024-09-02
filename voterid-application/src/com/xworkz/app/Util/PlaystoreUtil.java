package com.xworkz.app.Util;

import com.xworkz.app.Dto.PlaystoreDto;

public class PlaystoreUtil {
     
	public static boolean checkDuplicate(PlaystoreDto[] listOfApps,PlaystoreDto Dto) {
		System.out.println("duplicate check");
	    for(PlaystoreDto playdto:listOfApps) {
	    	if(playdto!=null && playdto.equals(Dto)) {
	    		return true;
	    	}
	    }
	
	   return false;
	}
}
