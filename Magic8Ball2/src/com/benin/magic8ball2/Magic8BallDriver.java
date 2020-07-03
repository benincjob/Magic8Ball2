package com.benin.magic8ball2;
import java.util.Scanner;
public class Magic8BallDriver {

	public static void main(String[] args) {
		System.out.println("Please enter you question here ...");
		Scanner scan = new Scanner(System.in);
		String question = scan.nextLine();
		System.out.println("Your question is " + question);
	 

	}

}
