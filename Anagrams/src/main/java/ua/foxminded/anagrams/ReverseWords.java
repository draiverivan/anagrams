package ua.foxminded.anagrams;

/*Java code to illustrate how to reverse a string without affecting special characters.*/

/*Simple Solution: 

Split String in separate words if there are more than one word.
Create a temporary character array say temp[]. 
Copy alphabetic characters from the given array to temp[]. 
Reverse temp[] using standard string reversal algorithm. 
Now traverse input string and temp in a single loop. Wherever there is an alphabetic character 
is input string, replace it with the current character of temp[].*/

import java.util.*;

public class ReverseWords {

	static String SrevStrTemporary;

	public static void rev(char s[], int l, int r) {
		for (int i = l; i < r / 2; i++) {
			char temp = s[i];
			s[i] = s[r - 1 - i];
			s[r - 1 - i] = temp;
		}
	}

	public static void reverse(char s[]) {

		// creating character array of size equal to length of word

		char[] temp = new char[s.length];
		int x = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] >= 'a' && s[i] <= 'z' || s[i] >= 'A' && s[i] <= 'Z') {
				// storing elements in array
				temp[x] = s[i];
				x++;
			}
		}

		// reversing the character array
		rev(temp, 0, x);

		x = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] >= 'a' && s[i] <= 'z' || s[i] >= 'A' && s[i] <= 'Z') {
				// updating the origional word
				s[i] = temp[x];
				x++;
			}
		}

		String revStr = new String(s);
		SrevStrTemporary = revStr;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userInput = scanner.nextLine();

		String inputWords[] = userInput.split(" ");
		String outputWords[] = new String[inputWords.length];

		int i = 0;
		for (String inputWord : inputWords) {
			char[] charArray = inputWord.toCharArray();
			reverse(charArray);
			String reverse = new StringBuilder(SrevStrTemporary).toString();
			outputWords[i] = reverse;
			i++;

		}
		System.out.println("Reversed string is: " + String.join(" ", outputWords));

	}
}
