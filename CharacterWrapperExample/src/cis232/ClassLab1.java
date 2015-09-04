package cis232;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ClassLab1 {

	public static void main(String[] args) {
		// Check if the user entered a positive integer
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an ID (RN-NN-LLL)");

		String input = keyboard.nextLine();

		boolean isValid = true;
		// Check if the # of characters is correct
		if (input.length() != 9) {
			isValid = false;
		}

		if (isValid && input.charAt(0) != 'R') {
			isValid = false;
		}

		if (isValid && !Character.isDigit(input.charAt(1))) {
			isValid = false;
		}

		if (isValid && input.charAt(2) != '-') {
			isValid = false;
		}

		if (isValid && !Character.isDigit(input.charAt(3))) {
			isValid = false;
		}

		if (isValid && !Character.isDigit(input.charAt(4))) {
			isValid = false;
		}

		if (isValid && input.charAt(5) != '-') {
			isValid = false;
		}

		if (isValid && !Character.isLetter(input.charAt(6))) {
			isValid = false;
		}
		if (isValid && !Character.isLetter(input.charAt(7))) {
			isValid = false;
		}
		if (isValid && !Character.isLetter(input.charAt(8))) {
			isValid = false;
		}

		if (isValid) {
			System.out.println("Valid ID!");
		} else {
			System.out.println("Invalid ID!");
		}

		
		
	}

}
