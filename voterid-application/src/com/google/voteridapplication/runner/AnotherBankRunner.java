package com.google.voteridapplication.runner;
import com.google.voteridapplication.things.AnotherBank;
public class AnotherBankRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         AnotherBank bank = new AnotherBank();
         AnotherBank newBank = new AnotherBank("SBI","BTM","BTM branch",50);
         System.out.println(bank.toString());
         System.out.println(newBank.toString());
	}

}
