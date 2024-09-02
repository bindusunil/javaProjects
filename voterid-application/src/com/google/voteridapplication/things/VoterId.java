package com.google.voteridapplication.things;

public class VoterId {
	private String name;
	public VoterId() {
		System.out.println("this is a no args constructor");
	}
	public void setName (String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}

}
