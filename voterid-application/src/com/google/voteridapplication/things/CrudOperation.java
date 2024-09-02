package com.google.voteridapplication.things;

public class CrudOperation {
	public int numbers[]= new int[5];
    int index = 0;
    public int getStringLength() {
    	return numbers.length;
    }
    public void saveElements(int number) {
    	if(index<this.getStringLength()) {
    		numbers[index] = number;
    		index++;
    	}else {
    		System.out.println("the array is full");
    	}
    }
    public void readElements() {
    	for(int i=0;i<getStringLength();i++) {
    		System.out.println("the number is: "+numbers[i]);
    	}
    }
    public String updateElement (int oldElement,int newElement) {
    	for(int i=0;i<getStringLength();i++) {
    		if(numbers[i]==oldElement) {
    			numbers[i]=newElement;
    			return "updated the element";
    		}
    	}return "not updated the element";
    }
    public String deleteElement(int element) {
    	for(int i=0;i<getStringLength();i++) {
    		if(numbers[i]==element) {
    			numbers[i]=0;
    			return "deleted the element successfully";
    		}
    	}
    	return "dint found the element";
    }
    public String searchElement(int element) {
    	for(int i=0;i<getStringLength();i++) {
    		if(numbers[i]==element) {
    			System.out.println("found the element");
    		}
    	}
    	return "dint found the element";
    }
}
