package PracticeAlgorithm;
//[a,b,c,b,a]
//[a,b,c,c,b,a]
//[0,1,2,3,4]
//0 vs 5-1-0
//1 vs 5-1-1
//2 vs 5-1-2

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        s= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] list = s.toCharArray();
        int counter = 0;
        int length = list.length;
        while ( counter < length/2) {
            if (list[counter] == list[length-1-counter]) {
                counter++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int head = 0;
        int tail = s.length() - 1;

        char charHead,charTail;

        while (head <= tail) {
            charHead = s.charAt(head);
            charTail = s.charAt(tail);

            if (!Character.isLetterOrDigit(charHead)) {
                head++;
            } else if (!Character.isLetterOrDigit(charTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(charHead) != Character.toLowerCase(charTail)) {
                    return false;
                }
                head++;
                tail--;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome2("A man, a plan, a canal: Panama"));
    }
}
