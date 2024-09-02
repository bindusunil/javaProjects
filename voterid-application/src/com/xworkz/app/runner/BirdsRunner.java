package com.xworkz.app.runner;

import com.xworkz.app.constant.BirdsTypeConstant;
import com.xworkz.app.Dto.BirdsDto;
import com.xworkz.app.services.Birds;



public class BirdsRunner {
     public static void main(String[] args) {
		BirdsDto birds = new BirdsDto(BirdsTypeConstant.EAGLE.toString(),"green",true,100);
		System.out.println(birds);
		System.out.println(birds);
		System.out.println(birds);
		System.out.println(birds);
        Birds bird = new Birds();
        System.out.println(bird.equals(birds));
	}
}
