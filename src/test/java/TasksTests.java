import org.junit.Assert;
import org.junit.Test;
import tasksOnStrings.Tasks;

public class TasksTests {
    @Test
    public void returnOneCharacterFromString() {
        Tasks tasks = new Tasks();
        String text = "Hello World!";
        char letter = tasks.giveMeOneLetter(text, 7);
        Assert.assertEquals('o', letter);
    }

    @Test
    public void changeLetterOnStringTest() {
        Tasks tasks = new Tasks();
        String text = "beautiful is better than ugly";
        String changedText = tasks.changeLetterOnString(text, "b", "d");
        Assert.assertEquals("deautiful is detter than ugly", changedText);
    }

    @Test
    public void changeBigLetterToSmallTest() {
        Tasks tasks = new Tasks();
        String text = "HeLLo";
        String changedText = tasks.changeBigLetterToSmall(text);
        Assert.assertEquals("hello", changedText);
    }

    @Test
    public void changeSmallLetterToBigTest() {
        Tasks tasks = new Tasks();
        String text = "hello";
        String changedText = tasks.changeSmallLetterToBig(text);
        Assert.assertEquals("HELLO", changedText);
    }

    @Test
    public void deleteWhiteSignTest() {
        Tasks tasks = new Tasks();
        String text = "h e l l o";
        String changedText = tasks.deleteWhiteSign(text);
        Assert.assertEquals("hello", changedText);
    }

    @Test
    public void showStringLengthTest() {
        Tasks tasks = new Tasks();
        int length = tasks.showStringLength("hello");
        Assert.assertEquals(5, length);
    }

    @Test
    public void concatenatedTwoStringsTest() {
        Tasks tasks = new Tasks();
        String text = tasks.concatenateStrings("Hello", "User");
        Assert.assertEquals("HelloUser", text);
    }
}
