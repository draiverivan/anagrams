package ua.foxminded.anagrams;

/*Java code to illustrate how to reverse a string without affecting special characters.*/

/*Simple Solution: 

Split String in separate words if there are more than one word.
Create a temporary character array say temporaryCharacter[]. 
Copy alphabetic characters from the given array to temporaryCharacter[]. 
Reverse temporaryCharacter[] using standard string reversal algorithm. 
Now traverse input string and temp in a single loop. Wherever there is an alphabetic character 
is input string, replace it with the current character of temporaryCharacter[].*/

public class ReverseWords {

	public void reverseAlphabeticCharArray(char inputWordAlphabeticCharArray[], int index, int indexLast) {
		for (int i = index; i < indexLast / 2; i++) {
			char temporaryCharacter = inputWordAlphabeticCharArray[i];
			inputWordAlphabeticCharArray[i] = inputWordAlphabeticCharArray[indexLast - 1 - i];
			inputWordAlphabeticCharArray[indexLast - 1 - i] = temporaryCharacter;
		}
	}

	public String reverse(char inputWordCharArray[]) {

		// creating character array of size equal to length of word

		char[] temporaryCharacter = new char[inputWordCharArray.length];
		int x = 0;
		for (int i = 0; i < inputWordCharArray.length; i++) {
			if (inputWordCharArray[i] >= 'a' && inputWordCharArray[i] <= 'z'
					|| inputWordCharArray[i] >= 'A' && inputWordCharArray[i] <= 'Z') {
				// storing elements in array
				temporaryCharacter[x] = inputWordCharArray[i];
				x++;
			}
		}

		// reversing the character array
		reverseAlphabeticCharArray(temporaryCharacter, 0, x);

		x = 0;
		for (int i = 0; i < inputWordCharArray.length; i++) {
			if (inputWordCharArray[i] >= 'a' && inputWordCharArray[i] <= 'z'
					|| inputWordCharArray[i] >= 'A' && inputWordCharArray[i] <= 'Z') {
				// updating the origional word
				inputWordCharArray[i] = temporaryCharacter[x];
				x++;
			}
		}

		String reversedWord = new String(inputWordCharArray);
		return reversedWord;
	}

	public void splitAndMakeReadyString(String userInput) {

		String inputWords[] = userInput.split(" ");
		String outputWords[] = new String[inputWords.length];

		int i = 0;
		for (String inputWord : inputWords) {
			char[] charArray = inputWord.toCharArray();
			// reverse(charArray);
			String reverse = new StringBuilder(reverse(charArray)).toString();
			outputWords[i] = reverse;
			i++;

		}
		System.out.println("Reversed string is: " + String.join(" ", outputWords));

	}

}
