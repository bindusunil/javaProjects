package com.google.voteridapplication.runner;
import com.google.voteridapplication.things.CrudOperation;
public class CrudOperationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CrudOperation nums = new CrudOperation();
        System.out.println("============saving the array elements============");
        nums.saveElements(10);
        nums.saveElements(20);
        nums.saveElements(30);
        nums.saveElements(40);
        nums.saveElements(50);
        System.out.println("===========reading the array elements===============");
        nums.readElements();
        System.out.println("=============updating the element===================");
        String update = nums.updateElement(10, 100);
        System.out.println(update);
        System.out.println("===========reading the array elements===============");
        nums.readElements();
        System.out.println("=============deleting the array element==============");
        String delete =  nums.deleteElement(100);
        System.out.println(delete);
        System.out.println("===========reading the array elements===============");
        nums.readElements();
        System.out.println("==============searching the array element=============");
        String search = nums.searchElement(100);
        System.out.println(search);
        System.out.println("===========reading the array elements===============");
        nums.readElements();
	}

}
