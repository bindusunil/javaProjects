package com.google.voteridapplication.runner;
import com.google.voteridapplication.things.Train;

public class TrainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Train bE = new Train();
         Train mE = new Train();
         
         //bE.equals(mE);
         
         bE.trainName = "banglore express";
         bE.from = "banglore";
         bE.to = "manglore";
         bE.trainNumber = 200;
         bE.isAvailable = true;
         
         if(bE.equals(bE))
        	 System.out.println("comparing the instance with itself");
         
         mE.trainName = "banglore express";
         mE.from = "banglore";
         mE.to = "manglore";
         mE.trainNumber = 200;
         mE.isAvailable = true;
         
         if(bE.equals(mE)) {
        	 System.out.println("both the instances are same");
         }else {
        	 System.out.println("both the instances are not same");
         }
         
	}

}
