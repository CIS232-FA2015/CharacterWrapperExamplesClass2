package cis232;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Check if the user entered a positive integer
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number");

		String input = keyboard.nextLine();
		keyboard.close();

		if (checkIfPositiveInteger(input)) {
			System.out.println("It's a number!");
		} else {
			System.out.println("Not a number");
		}
	}

	private static boolean checkIfPositiveInteger(String input) {
		// Check each character in the string to ensure it is a digit
		boolean isNumber = true;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (!Character.isDigit(ch)) {
				isNumber = false;
			}
		}
		return isNumber;
	}

}
