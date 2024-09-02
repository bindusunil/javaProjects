package com.google.voteridapplication.runner;
import com.google.voteridapplication.things.Earth;
import com.gooogle.voteridapplication.constant.Days;

public class EarthRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Earth blue = new Earth();
         blue.numOfStates = 24;
         blue.population = 120000;
         blue.countryName = "india";
         blue.isRevolving = true;
         blue.days = Days.MONDAY;
         
         Earth sky = new Earth();
         sky.numOfStates = 24;
         sky.population = 120000;
         sky.countryName = "india";
         sky.isRevolving = true;
         sky.days = Days.MONDAY;
         
         System.out.println(blue.toString());
         if(blue.equals(blue)) {
        	 System.out.println("comparing the instance with itself");
         }
         else {
        	 System.out.println("not same");
         }
         
         System.out.println(blue.hashCode());
         
         if(blue.equals(sky)) {
        	 System.out.println("both the instances are same");
         }
         else {
        	 System.out.println("not same");
         }
         
         System.out.println(sky.hashCode());
	}

}
