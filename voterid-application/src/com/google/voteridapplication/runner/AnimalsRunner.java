package com.google.voteridapplication.runner;
import com.gooogle.voteridapplication.constant.Animals;

public class AnimalsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animals animal = Animals.DOG;
        Animals a = Animals.LION;
        System.out.println(animal);
        
        //comparing one enum with other
        System.out.println(animal.compareTo(animal.CAT));
        
        //comapring an enum with itself
        System.out.println(animal.compareTo(animal.DOG));
        
        //checks wether two enums are equal or not and return true or false
        System.out.println(animal.equals(animal.CAT));
        
        System.out.println(animal.equals(animal.DOG));
        
        //prvides the enum name how it is declared in the enum class
        System.out.println(animal.toString());
        
        //gives the index number of the enum in the enum class
        System.out.println(animal.ordinal());
        
        System.out.println(a.ordinal());
	}

}
