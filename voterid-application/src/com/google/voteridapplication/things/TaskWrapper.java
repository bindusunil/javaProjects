package com.google.voteridapplication.things;

public class TaskWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          byte b = 10;
          short s = 45;
          int i = 100;
          long l = 8618808830L;
          float f = 3.5f;
          double d = 40.80;
          char c = 'B';
          boolean bo = true;
          String name = "bindu";
          String something = "12";
          
          //byte to Byte
          Byte byteB = b;
          
          //short to Short 
          Short shortS = s;
          
          //int to Integer
          Integer integer = i;
          
          //long to Long
          Long longL = l;
          
          //float to Float
          Float floatF = f;
          
          //double to Double
          Double double1 = d;
          
          //char to Character
          Character charecter = c;
          
          //boolean to Boolean
          Boolean booleanB = bo;
          
          //char to Integer
          int num = charecter.charValue();
          System.out.println("char to int: "+num);
          
          
          //String to byte
          byte bb = Byte.parseByte(something);
          System.out.println("String to byte: "+bb);
          
          //String to short 
          short ss = Short.parseShort(something);
          System.out.println("string to short: "+ss);
          
          //String to int
          int a = Integer.parseInt(something);
          System.out.println("string to int: "+a);
          
          //String to long
          long ll= Long.parseLong(something);
          System.out.println("string to long: "+ll);
          
          //String to float
          float ff = Float.parseFloat(something);
          System.out.println("string to float: "+ff);
          
          //String to double
          double dd = Double.parseDouble(something);
          System.out.println("string to double: "+dd);
          
          //String to boolean
          boolean bbb = Boolean.parseBoolean(something);
          System.out.println("string to boolean: "+bbb);
          
          //byte to String 
          String sss = Byte.toString(b);
          System.out.println("byte to string: "+b);
          
          //short to String
          String ssss = Short.toString(s);
          System.out.println("short to String: "+ ssss);
          
          //int to String
          String sssss = Integer.toString(i);
          System.out.println("int to String: "+sssss);
          
          //long to String
          String s6 = Long.toString(l);
          System.out.println("long to String: "+s6);
          
          //float to String
          String s7 = Float.toString(f);
          System.out.println("float to String: "+s7);
          
          //double to String
          String s8 = Double.toString(d);
          System.out.println("double to String: "+s8);
          
          //char to String
          String s9 = Character.toString(c);
          System.out.println("char to String: "+s9);
          
          //boolean to String
          String s10 = Boolean.toString(bo);
          System.out.println("boolean to String: "+s10);
	}

}
