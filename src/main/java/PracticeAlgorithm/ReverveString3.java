package PracticeAlgorithm;

public class ReverveString3 {

    //solution 1
    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int spaceindex = 0;
        for (int i =0; i < chars.length; i++) {
            if (Character.isWhitespace(chars[i])) {
                reverse(chars,spaceindex,i-1);
                spaceindex = i + 1;
            }
            if (i == chars.length - 1) {
                reverse(chars,spaceindex,i);
            }
        }
        return String.valueOf(chars);
    }

    public static void reverse(char[] chars, int start, int end) {
        char temp;
        while ( start < end) {
            temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverseWords( "Let's take LeetCode contest"));
//        char[] chars = new char[] {'l','e','t','s',' ','t'};
//        reverse(chars,0,3);
//        System.out.println(chars);
    }
}
