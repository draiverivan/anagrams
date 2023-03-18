package ua.foxminded.anagrams;

import java.util.Scanner;

public class StartReverseWords {

	public static void main(String[] args) {

		ReverseWords reverseWords = new ReverseWords();
		InputValidator inputValidator = new InputValidator();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hi I can reverse each word in Latin alphabet of input String,\n"
				+ "while leaving all non-letter symbols in their original position. \nEnter a string: ");
		String userInput = scanner.nextLine();

		while (!inputValidator.isInputValid(userInput)) {
			System.out.println(
					"String must have at least 1 Latin alphabetic character. Please try again." + "\nEnter a string: ");
			userInput = scanner.nextLine();
		}

		System.out.println("Reversed string is: " + reverseWords.splitAndMakeReadyString(userInput));
	}

}
