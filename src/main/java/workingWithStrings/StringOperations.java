package workingWithStrings;

public class StringOperations {


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


    public int countMultiplyLastLetter(String text) {
        char lastLetter;
        int multiplyLetter = 0;
        lastLetter = text.charAt(text.length() - 1);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == lastLetter) {
                multiplyLetter++;
            }
        }
        return multiplyLetter;
    }

    public String reverseString(String text) {
        String reverseText = "";
        for (int i = 0; i < text.length(); i++) {
            reverseText += text.charAt(text.length() - i - 1);
        }
        return reverseText;
    }

    public boolean checkIfTheWordIsPalindrome(String text) {
        String reverseText = reverseString(text).toLowerCase();
        if (reverseText.equals(text.toLowerCase())) {
            return true;
        }
        return false;
    }
}
