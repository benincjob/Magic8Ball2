package com.benin.magic8ball2;
import java.util.Scanner;
public class Magic8BallDriver {

	public static void main(String[] args) {
		Magic8Ball2 magic = new Magic8Ball2();
		System.out.println("Please enter you question here ...");
		Scanner scan = new Scanner(System.in);
		String question = scan.nextLine();
		String answer = magic.shake();
		System.out.println("The answer to your question -" + question + " is: " + answer);
	 

	}

}
