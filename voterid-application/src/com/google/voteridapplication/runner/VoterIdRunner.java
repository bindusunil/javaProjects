package com.google.voteridapplication.runner;
import com.google.voteridapplication.things.VoterId;
public class VoterIdRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        VoterId voterid = new VoterId();
        voterid.setName("BINDU");
        String name = voterid.getName();
        System.out.println("name: "+name);
	}

}
