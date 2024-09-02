package com.google.voteridapplication.things;

public class AnotherBank {
      public String bankNmae;
      public String location;
      public String branchName;
      public int noOfEmp;
      
      public AnotherBank() {
    	  System.out.println("this is a no args constructor");
      }
      public AnotherBank(String bankName,String location,String branchName,int noOfEmp) {
    	  this.bankNmae = bankName;
    	  this.location = location;
    	  this.branchName = branchName;
    	  this.noOfEmp = noOfEmp;
      }
      public String toString() {
    	  return "Bank[]="+"[bankName: "+this.bankNmae+","+"location: "+this.location+","+"branch name: "+this.bankNmae+","+"number of employees: "+this.noOfEmp;
      }
}
