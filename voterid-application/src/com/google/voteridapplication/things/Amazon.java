package com.google.voteridapplication.things;

public class Amazon extends OnlineShoppingApp {
	
	public Amazon() {
		System.out.println("this is a no args constructor of amazon");
	}
	public String toString() {
 	   return "onlineshoppingapp-> "+" "+"searchItem: "+searchItem+" "+"cart: "+cart+" "+"isitemavailable: "+isItemAvailable+" "+"appname: "+appName;
    }
}
