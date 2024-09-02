package com.google.voteridapplication.things;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  long m_Number = 8618808830L;
          System.out.println("m_Number: "+m_Number);
          
          //assigning a primitive datatype to a non primitive
          Long l = m_Number;
          System.out.println("long converted to wrapper class Long: "+l);
          
          //comapres two values if the values are same return 0, <0 if l is less than arg and >0 if l is greater than arg
          System.out.println(l.compareTo(9972803256L));
          
          //converts the value to double
          System.out.println(l.doubleValue());
          
          //compares current object with the arg return true only if current obj and arg object are both same long values
          System.out.println(l.equals(l));
          
          //converts the current object to float
          System.out.println(l.floatValue());
          
          System.out.println(l.intValue());
          
          boolean yes = true;
          System.out.println("yes: "+yes);
          Boolean b = yes;
          System.out.println("boolean converyted to Wrapper Boolean: "+b);
          
          System.out.println(b.booleanValue());
	}

}
