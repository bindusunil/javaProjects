package com.xworkz.classTaskRunner;

public class ClassTaskRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String password = "Bi1du Mahadevi p";
         char[] ch = password.toCharArray();
         if(password!=null && 
        		 ch.length>=8 && ch.length<=16 && 
        		 Character.isUpperCase(ch[0]) && 
        		 Character.isLowerCase(ch[ch.length-1]) && 
        		 Character.isDigit(ch[2]) && Character.isLowerCase(ch[9])) {
        	     System.out.println("the entered password is alphanumeric and the password is valid");
         }
         String password1 = "Bi1du Mahadevi P";
         char[] ch1=password.toCharArray();
         if(ch1.length>=10 && password1!=null){
        	 if(ch1.length>=8 && ch1.length<=16 && 
        		 Character.isUpperCase(ch[0]) && 
        		 Character.isLowerCase(ch[ch.length-1]) && 
        		 Character.isDigit(ch[2]) ) {
        		 System.out.println("the entered password is alphanumeric and the password is valid >10 char");

        	 }
        	 else if(password1!=null && 
        		 ch1.length>=8 && ch1.length<=16 && 
        		 Character.isUpperCase(password1.charAt(0)) && 
        		 Character.isLowerCase(password1.charAt(password.length()-1)) && 
        		 Character.isDigit(password1.charAt(2)) && Character.isLowerCase(ch[9])) {
        	     System.out.println("the entered password is alphanumeric and the password is valid ");
         }
         
         }else {
        	 System.out.println("the password is invalid");
         }
	}

}
