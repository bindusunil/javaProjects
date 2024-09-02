package com.google.voteridapplication.runner;
import com.google.voteridapplication.things.Bank;
public class BankRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Bank bank = new Bank();
            
            bank.setAccountNumber("2085496371");
            String accountNumber = bank.getAccountNumber();
            System.out.println("accountnumber: "+accountNumber);
            
            bank.setAccountHolderName("BINDU");
            String accountHolderName= bank.getAccountHolderName();
            System.out.println("accountholdername: "+accountHolderName);
            
            bank.setBankNmae("axis");
            String bankName = bank.getBankName();
            System.out.println("bankname: "+bankName);
            
            bank.setAdharcardNumber("254123698547");
            String adharNumber = bank.getAdharcardNumber();
            System.out.println("adaharcardnumber: "+adharNumber);
            
            bank.setBankBalance(50000);
            int bankBalance = bank.getBankBalance();
            System.out.println("bankbalance: "+bankBalance);
            
           bank.checkAccNumDigits("2085496371"); 
           bank.checkAdhardDigits("254123698547");
           bank.balanceCheck(45000, "AXIS", "BINDU");
           bank.balanceCheck(500, "AXIS", "BINDU");
           bank.withdraw(10000, 1000);
	}

}
