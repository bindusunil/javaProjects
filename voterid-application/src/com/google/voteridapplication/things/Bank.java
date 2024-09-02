package com.google.voteridapplication.things;

public class Bank {
     private String accountNumber;
     private String accountHolderName;
     private String bankName;
     private String adharcardNumber;
     private int bankBalance;
     public double totalBankBalance = 0;
     
     public Bank() {
    	 System.out.println("this is a no args constructor");
     }
     
     public void setAccountNumber(String accountNumber) {
    	 this.accountNumber=accountNumber;
     }
     public String getAccountNumber() {
    	 return this.accountNumber;
     }
     public void setAccountHolderName(String accountHolderName) {
    	 this.accountHolderName=accountHolderName;
     }
     public String getAccountHolderName(){
    	 return this.accountHolderName;
     }
     public void setBankNmae(String bankName) {
    	 this.bankName=bankName;
     }
     public String getBankName() {
    	 return this.bankName;
     }
     public void setAdharcardNumber(String adharcardNumber) {
    	 this.adharcardNumber=adharcardNumber;
     }
     public String getAdharcardNumber() {
    	 return this.adharcardNumber;
     }
     public void setBankBalance(int bankBalance) {
    	 this.bankBalance=bankBalance;
     }
     public int getBankBalance() {
    	 return this.bankBalance;
     }
     
     public void checkAccNumDigits(String accountNumber) {
    	 if(accountNumber.length()==10) {
    		 System.out.println("account holder name: "+this.accountHolderName);
    		 System.out.println("bank name: "+this.bankName);
    	 }else {
    		 System.out.println("the account number has more than 10 digits");
    	 }
     }
     
     public void checkAdhardDigits(String adharCardNumber) {
    	 if(adharCardNumber.length() == 10) {
    		 System.out.println("it is a 10 digit adharcard number");
    	 }
    	 else {
    		 System.out.println("the number of digits in a adharcard is not equal to 10");
    	 }
     }
     
     public void balanceCheck(double bankBalance,String bankName,String accountHolderName) {
    	 if(bankBalance<=500) {
    		 System.out.println("please maintain the bank balance");
    	 }
//    	 else if(bankBalance == 500){
//    		 System.out.println("the bank balance is equal to 500");
//    	 }
    	 else if(bankBalance>500 && bankBalance<=10000) {
    		 totalBankBalance = (0.1* bankBalance)+ bankBalance;
    		 System.out.println("total balance"+totalBankBalance);
    	 }
//    	 else if(bankBalance == 10000) {
//    		 System.out.println("the bank balance is equal to 10000");
//    	 }
    	 else if(bankBalance>10000 && bankBalance<=50000) {
    		 totalBankBalance = (0.2* bankBalance)+ bankBalance;
    		 System.out.println("total balance: "+totalBankBalance);
    	 }else {
    		 System.out.println("any condition is not matched");
    	 }
     }
     
     public void withdraw(double bankBalance,int amount) {
    	 if(amount<1000) {
    		 System.out.println("account balance is low, you cant withdraw the amount");
    	 }else {
    		 bankBalance = bankBalance-amount;
    		 System.out.println("the remaining balance: "+bankBalance);
    	 }
     }
     
}
