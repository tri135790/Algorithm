package PracticeAlgorithm;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String s = Integer.valueOf(x).toString();
        StringBuilder sb = new StringBuilder(s);

        return s.equals(sb.reverse().toString());
    }

    public static boolean isPalindrome2(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int rev = 0;
        while ( x > rev) {
            rev = rev*10 + x%10;
            x=x/10;
        }
        return (x == rev || x == rev/10);
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome2(1212));
    }

}
