package ua.foxminded.anagrams;

/*Class with one method for validation user input,
if user input has at least 1 Latin alphabet character*/

public class InputValidator {

	public boolean isInputValid(String userInput) {

		if (userInput == null) {
			return false;
		}
		return userInput.matches(".*[a-zA-Z].*");

	}
}
