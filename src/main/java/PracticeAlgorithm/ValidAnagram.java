package PracticeAlgorithm;

import java.util.Arrays;

public class ValidAnagram {
  public static boolean isAnagram(String s, String t) {
    char[] arrs = s.toCharArray();
    char[] arrt = t.toCharArray();
    Arrays.sort(arrs);
    Arrays.sort(arrt);
    return Arrays.equals(arrs, arrt);

  }

  public static boolean isAnagram2(String s, String t) {
    if (s.length() != t.length()) {
      return  false;
    }
    int[] counter = new int[26];
    for (int i = 0;i < s.length(); i++) {
      counter[s.charAt(i) - 'a']++;
      counter[t.charAt(i) - 'a']--;
    }
    for (int count : counter) {
      if (count != 0) {
        return false;
      }
    }
    return true;
  }
    public static void main (String[] args) {
    String s = "rac";
    String t = "car";
    System.out.println(isAnagram(s,t));
  }
}
