package ua.foxminded.anagrams;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class InputValidatorTest {

	@ParameterizedTest
	@ValueSource(strings = { "Hello", "eta", "CaSTle", "ASFCVX", "qqqqqqq", "AAAAAA" })
	void isInputValid_ShouldReturnTrueForOnlyLatinAlphabetLowerAndUpperCharactersInString(String userInput) {
		InputValidator inputValidator = new InputValidator();
		assertTrue(inputValidator.isInputValid(userInput));
	}

	@ParameterizedTest
	@ValueSource(strings = { "H#$13", "1@$a", "C1", "!!!A", "q1234", "a ", " W", "r1", "123456y74" })
	void isInputValid_ShouldReturnTrueForAtLeastOneLatinAlphabetCharacterInString(String userInput) {
		InputValidator inputValidator = new InputValidator();
		assertTrue(inputValidator.isInputValid(userInput));
	}

	@ParameterizedTest
	@ValueSource(strings = { "H", "a", "C", "A", "q", "w", "G", "r", "m" })
	void isInputValid_ShouldReturnTrueForOnlyOneLatinAlphabetCharacterInString(String userInput) {
		InputValidator inputValidator = new InputValidator();
		assertTrue(inputValidator.isInputValid(userInput));
	}

	@ParameterizedTest
	@ValueSource(strings = { "Hello World", "eta AXA", "CaSTle Is StRonG", "ASFCVX SDZ", "quick start",
			"red FAST Car" })
	void isInputValid_ShouldReturnTrueForMultipleWordsOnlyLatinAlphabetCharactersInString(String userInput) {
		InputValidator inputValidator = new InputValidator();
		assertTrue(inputValidator.isInputValid(userInput));
	}

	@ParameterizedTest
	@ValueSource(strings = { "Hello світ!", "вау AXA1", "CaSTle !4жж StRonG", "ASиииFCVX 22SDZ", "3ццquick st№;:art",
			"red FAST Car" })
	void isInputValid_ShouldReturnTrueForMultipleWordsLatinAlphabeAndNonLatinCharacters(String userInput) {
		InputValidator inputValidator = new InputValidator();
		assertTrue(inputValidator.isInputValid(userInput));
	}

	@ParameterizedTest
	@EmptySource
	@ValueSource(strings = { "", " ", "      ", "\t", "\n", "   ", "    ", "   ", "   " })
	void isInputValid_ShouldReturnFalseForEmptyAndOnlySpacesInput(String userInput) {
		InputValidator inputValidator = new InputValidator();
		assertFalse(inputValidator.isInputValid(userInput));
	}

	@ParameterizedTest
	@ValueSource(strings = { "1312", "131 455", "!", "№₴ ?:1", "356!", "!345 %456", "ф23", "цк23 фй!", "мя23 фф фв" })
	void isInputValid_ShouldReturnFalseForOnlyNonLatinLetterSymbolsInput(String userInput) {
		InputValidator inputValidator = new InputValidator();
		assertFalse(inputValidator.isInputValid(userInput));
	}

}
