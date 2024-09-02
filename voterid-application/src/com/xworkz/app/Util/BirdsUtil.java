package com.xworkz.app.Util;

import com.xworkz.app.Dto.BirdsDto;

public class BirdsUtil {
    public static boolean checkDetails(BirdsDto[] birdsdto,BirdsDto dto) {
    	System.out.println("duplicate check");
    	for(BirdsDto checkDto:birdsdto) {
    		if(birdsdto!=null && birdsdto.equals(dto)) {
    			return true;
    		}
    	}
    	return false;
    }
}
