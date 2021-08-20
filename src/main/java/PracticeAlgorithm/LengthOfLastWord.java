package PracticeAlgorithm;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int tail = s.length() -1;
        int head = 0;
        int wordLength = 0;

        while (head <= tail) {
            if (Character.isWhitespace(s.charAt(tail))) {
                tail--;
            }else if (!Character.isWhitespace(s.charAt(head))) {
                wordLength++;
                head++;
            } else {
                wordLength = 0;
                head++;
            }
        }
        return wordLength;

    }

    public static void main(String[] args) {
        System.out.println(LengthOfLastWord.lengthOfLastWord("day      "));
    }
}
