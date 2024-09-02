package com.sunil.practice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Project {
		
	
	public int id;
	public String name;
	
	public Project() {
		System.out.println("constructor");
		return ;
	}
	
	public static void main(String[] args) {
		
		Project pr = new Project();
		pr.setId(1);
		pr.setName("sunil");
		System.out.println(pr.getId());
		System.out.println(pr.getName());
	}
}
