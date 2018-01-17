import org.junit.Assert;
import org.junit.Test;
import workingWithStrings.StringOperations;

public class StringOperationsTests {
    @Test
    public void returnOneCharacterFromString() {
        StringOperations so = new StringOperations();
        String text = "Hello World!";
        char letter = so.giveMeOneLetter(text, 7);
        Assert.assertEquals('o', letter);
    }

    @Test
    public void changeLetterOnStringTest() {
        StringOperations so = new StringOperations();
        String text = "beautiful is better than ugly";
        String changedText = so.changeLetterOnString(text, "b", "d");
        Assert.assertEquals("deautiful is detter than ugly", changedText);
    }

    @Test
    public void changeBigLetterToSmallTest() {
        StringOperations so = new StringOperations();
        String text = "HeLLo";
        String changedText = so.changeBigLetterToSmall(text);
        Assert.assertEquals("hello", changedText);
    }

    @Test
    public void changeSmallLetterToBigTest() {
        StringOperations so = new StringOperations();
        String text = "hello";
        String changedText = so.changeSmallLetterToBig(text);
        Assert.assertEquals("HELLO", changedText);
    }

    @Test
    public void deleteWhiteSignTest() {
        StringOperations so = new StringOperations();
        String text = "h e l l o";
        String changedText = so.deleteWhiteSign(text);
        Assert.assertEquals("hello", changedText);
    }

    @Test
    public void showStringLengthTest() {
        StringOperations so = new StringOperations();
        int length = so.showStringLength("hello");
        Assert.assertEquals(5, length);
    }

    @Test
    public void concatenatedTwoStringsTest() {
        StringOperations so = new StringOperations();
        String text = so.concatenateStrings("Hello", "User");
        Assert.assertEquals("HelloUser", text);
    }
}
