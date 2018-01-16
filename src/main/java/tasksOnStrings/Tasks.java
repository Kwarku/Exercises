package tasksOnStrings;

public class Tasks {


    public char giveMeOneLetter(String text, int index) {
        return text.charAt(index);
    }

    public String changeLetterOnString(String text, String signToChange, String newSign) {
        return text.replaceAll(signToChange, newSign);
    }

    public String changeBigLetterToSmall(String text) {
        return text.toLowerCase();
    }

    public String changeSmallLetterToBig(String text) {
        return text.toUpperCase();
    }

    public String deleteWhiteSign(String text) {
        return text.replaceAll("\\s", "");
    }

    public int showStringLength(String text) {
        return text.length();
    }

    public String concatenateStrings(String text1, String text2) {
        return text1.concat(text2);
    }
}
