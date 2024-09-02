package com.google.voteridapplication.things;

public class UrWish extends Object {
      public String name;
      public int age;
      public float weight;
      public double height;
      public UrWish(String name,int age,float weight,float height) {
    	  this.name =name;
    	  this.age =age;
    	  this.weight = weight;
    	  this.height = height;
      }
      public int hascode() {
    	  return this.age*31;
      }
      public int check() {
    	  if(this.name==null) {
     	 return 0;
      }
      else {
     	 return this.name.hashCode();
      }
}
      
}
