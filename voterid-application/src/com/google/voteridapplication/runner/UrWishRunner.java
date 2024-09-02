package com.google.voteridapplication.runner;
import com.google.voteridapplication.things.UrWish;

public class UrWishRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         UrWish urwish = new UrWish("bindu",24,50.4f,4.9f);
         System.out.println("hashcode of name: "+urwish.name.hashCode());
         //System.out.println("hashcode of age: "+urwish.age.hashcode());
         //System.out.println("hashcode of weight: "+urwish.weight.hashcode());
         //System.out.println("hashcode of weight: "+urwish.height.hashcode());
         System.out.println("hascode of age: "+(urwish.hashCode()));
         System.out.println("the hashcode is: "+urwish.check());
         System.out.println(urwish.name==null? 0 : urwish.name.hashCode());
}
}
