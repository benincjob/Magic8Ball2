package com.benin.magic8ball2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Magic8Ball2 {
	private String question;
	private List<String> answers;
	Random rand = new Random();
	int choice = (int)(Math.random()*6);
	
	public Magic8Ball2() {
		this.question = null;
		answers = new ArrayList<String>();
		answers.add("Without a doubt, Yes");
		answers.add("Most likely");
		answers.add("Cannot predict now");
		answers.add("Outlook not so good");
		answers.add("Please don't ask again");
		answers.add("You may rely on it");
		
	}

	public String getQuestion() {
		return this.question;
	}

	public boolean askQuestion(String question) {
		if(question instanceof String) {
			this.question = question;
			return true;
		}
		else {
			return false;
		}
		
	}

	public String shake() {
		
		String randomElement = answers.get(rand.nextInt(answers.size()));
		//System.out.println(randomElement);
		//System.out.println(choice);
		// Return a random element from the list
		// Use random class to create random number
		// Use random number to get element from array list
		return randomElement;
		
		//return answers.get(choice);
	}

}
