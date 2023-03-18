package ua.foxminded.anagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ReverseWordsTest {

	@ParameterizedTest
	@CsvSource({ "t,t", "T,T", "J,J", "a,a", "s,s", "D,D", "c,c" })
	void splitAndMakeReadyString_shouldReturnSingleCharacter(String input, String expected) {
		ReverseWords reverseWords = new ReverseWords();
		String actualValue = reverseWords.splitAndMakeReadyString(input);
		assertEquals(expected, actualValue);
	}

	@ParameterizedTest
	@CsvSource({ "smart,trams", "BIG,GIB", "SmAll,llAmS", "AAAA,AAAA", "ssss,ssss", "agfdj,jdfga", "ASFGJCV,VCJGFSA" })
	void splitAndMakeReadyString_shouldReturnWordReversed(String input, String expected) {
		ReverseWords reverseWords = new ReverseWords();
		String actualValue = reverseWords.splitAndMakeReadyString(input);
		assertEquals(expected, actualValue);
	}

	@ParameterizedTest
	@CsvSource({ "smart boy,trams yob", "BIG CAR,GIB RAC", "SmAll dOG,llAmS GOd", "AA BB,AA BB", "ss dd,ss dd",
			"agfdj sdgjh,jdfga hjgds", "ASFGJCV SFDGFA,VCJGFSA AFGDFS" })
	void splitAndMakeReadyString_shouldReturnEachWordReversed(String input, String expected) {
		ReverseWords reverseWords = new ReverseWords();
		String actualValue = reverseWords.splitAndMakeReadyString(input);
		assertEquals(expected, actualValue);
	}

	@ParameterizedTest
	@CsvSource({ "sm12art,tr12ams", "BI34AG,GA34IB", "@3SmAll,@3llAmS", "a1bcd,d1cba", "efg!h,hgf!e", "ag@#SDF,FD@#Sga",
			"AS65FGJCV6,VC65JGFSA6" })
	void splitAndMakeReadyString_shouldReturnWorReverseddWhileNonLettersSymbolStayAtOldPosition(String input,
			String expected) {
		ReverseWords reverseWords = new ReverseWords();
		String actualValue = reverseWords.splitAndMakeReadyString(input);
		assertEquals(expected, actualValue);
	}

	@ParameterizedTest
	@CsvSource({ "sm@art b1oy,tr@ams y1ob", "BI$G CAR1,GI$B RAC1", "S!!mAll dOG,l!!lAmS GOd", "AA33 !BB,AA33 !BB",
			"1ss @dd,1ss @dd", "1agfdj sd#gjh,1jdfga hj#gds", "AS4FGJCV SFD!2GFA,VC4JGFSA AFG!2DFS",
			"a1bcd efg!h,d1cba hgf!e" })
	void splitAndMakeReadyString_shouldReturnEachWordReversedWhileNonLettersSymbolStayAtOldPosition(String input,
			String expected) {
		ReverseWords reverseWords = new ReverseWords();
		String actualValue = reverseWords.splitAndMakeReadyString(input);
		assertEquals(expected, actualValue);
	}

}