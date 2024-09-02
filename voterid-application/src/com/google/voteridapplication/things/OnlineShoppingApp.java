package com.google.voteridapplication.things;

public class OnlineShoppingApp {
       public String searchItem;
       public String cart;
       public boolean isItemAvailable;
       public String appName;
       
       public OnlineShoppingApp() {
    	   System.out.println("this is a no args constructor");
       }
       
       public String display() {
    	   return "onlineshoppingapp-> "+" "+"searchItem: "+searchItem+" "+"cart: "+cart+" "+"isitemavailable: "+isItemAvailable+" "+"appname: "+appName;
       }
       
}
