package ua.foxminded.anagrams;

import java.util.Scanner;

public class TestReverseWords {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Hi I can reverse each word in Latin alphabet of input String,\n"
				+ "while leaving all non-letter symbols in their original position. \nEnter a string: ");
		String userInput = scanner.nextLine();

		if (!userInput.matches(".*[a-zA-Z].*")) {
			System.out.println("String must have at least 1 Latin alphabetic character. Please try again.");
			Scanner scanner2 = new Scanner(System.in);
			System.out.print("Enter a string: ");
			String userInput2 = scanner.nextLine();

			if (!userInput2.matches(".*[a-zA-Z].*")) {
				System.out.println("String must have at least 1 Latin alphabetic character. "
						+ "Sorry I can't process String without at least 1 Latin alphabetic character");

			} else {
				ReverseWords reverseWords = new ReverseWords();
				reverseWords.splitAndMakeReadyString(userInput2);
			}

		} else {
			ReverseWords reverseWords = new ReverseWords();
			reverseWords.splitAndMakeReadyString(userInput);
		}

	}

}
