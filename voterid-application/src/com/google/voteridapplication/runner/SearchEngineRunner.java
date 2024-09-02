package com.google.voteridapplication.runner;
import com.google.voteridapplication.things.SearchEngine;
import com.google.voteridapplication.things.Google;
import com.google.voteridapplication.things.Gmail;

public class SearchEngineRunner {

	public static void main(String[] args) {
		SearchEngine searchengine = new SearchEngine();
		Google google = new Google();
		Gmail gmail = new Gmail();
		searchengine.someMessage();
		google.someMessage();
		gmail.someMessage();
	}

}
