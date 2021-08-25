package PracticeAlgorithm;

import java.util.HashSet;

public class PermutationString {

    public static boolean checkInclusion(String s1, String s2) {
        int[] maps1 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            maps1[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int[] maps2 = new int[26];
            for (int j = 0; j < s1.length(); j++) {
                maps2[s2.charAt(i + j) - 'a']++;
            }
            if (matches(maps1, maps2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean matches(int[] maps1, int[] maps2) {
        for (int i = 0; i < 26; i++) {
            if (maps1[i] != maps2[i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
    }

}
