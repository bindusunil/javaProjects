package com.google.voteridapplication.runner;
import com.google.voteridapplication.things.OnlineShoppingApp;
import com.google.voteridapplication.things.Amazon;
import com.google.voteridapplication.things.Flipcart;
import com.google.voteridapplication.things.Myntra;

public class OnlineShoppingAppRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//const
        OnlineShoppingApp shoppingapp = new OnlineShoppingApp();
        shoppingapp.appName = "Amazon";
        shoppingapp.cart = "has 2 items in the cart";
        shoppingapp.isItemAvailable = true;
        shoppingapp.searchItem = "footwear";
        shoppingapp.display();
        
        //const
        Amazon amazon = new Amazon();
        System.out.println(amazon.toString());
        //System.out.println(amazon.display());
        
        Flipcart flipcart = new Flipcart();
        flipcart.appName = "Flipcart";
        flipcart.cart = "your cart is empty";
        flipcart.isItemAvailable = false;
        flipcart.searchItem = "earpods";
        System.out.println(flipcart.display());
        
        Myntra myntra = new Myntra();
        myntra.appName = "Myntra";
        myntra.cart = "your cart is full start shopping now";
        myntra.isItemAvailable = true;
        myntra.searchItem = "earpods";
        System.out.println(myntra.display());
	}

}
