import org.junit.Test;
import workingWithStrings.StringOperations;

import static junit.framework.TestCase.assertEquals;

public class StringOperationsTests {
    StringOperations so = new StringOperations();

    @Test
    public void returnOneCharacterFromString() {
        String text = "Hello World!";
        char letter = so.giveMeOneLetter(text, 7);
        assertEquals('o', letter);
    }

    @Test
    public void changeLetterOnStringTest() {
        String text = "beautiful is better than ugly";
        String changedText = so.changeLetterOnString(text, "b", "d");
        assertEquals("deautiful is detter than ugly", changedText);
    }

    @Test
    public void changeBigLetterToSmallTest() {
        String text = "HeLLo";
        String changedText = so.changeBigLetterToSmall(text);
        assertEquals("hello", changedText);
    }

    @Test
    public void changeSmallLetterToBigTest() {
        String text = "hello";
        String changedText = so.changeSmallLetterToBig(text);
        assertEquals("HELLO", changedText);
    }

    @Test
    public void deleteWhiteSignTest() {
        String text = "h e l l o";
        String changedText = so.deleteWhiteSign(text);
        assertEquals("hello", changedText);
    }

    @Test
    public void showStringLengthTest() {
        int length = so.showStringLength("hello");
        assertEquals(5, length);
    }

    @Test
    public void concatenatedTwoStringsTest() {
        String text = so.concatenateStrings("Hello", "User");
        assertEquals("HelloUser", text);
    }

    @Test
    public void countLastLetterTest() {
        //GIVEN
        String text = "Abrakadabra";
        //WHEN
        int letters = so.countMultiplyLastLetter(text);
        //THEN
        assertEquals(4, letters);

    }

    @Test
    public void reverseStringTest() {
        //GIVEN
        String text = "Cat";
        //WHEN
        String reverseText = so.reverseString(text);
        //THEN
        assertEquals("taC", reverseText);
    }

    @Test
    public void checkIfTheWordIsPalindromeTest() {
        //GIVEN
        String text = "madam";
        //WHEN
        boolean isPalindrome = so.checkIfTheWordIsPalindrome(text);
        //THEN
        assertEquals(true, isPalindrome);

    }
}
