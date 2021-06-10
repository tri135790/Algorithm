package PracticeAlgorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubstring {
  public static int lengthOfLongestSubstring(String s) {
    if(s.length() == 0) {
      return 1;
    }
    String[] arr = s.split("");
    int max = 1;
    HashSet< String> set = new HashSet<>();
    for ( int i =0; i< arr.length; i++) {
      set.add(arr[i]);
      int count = 1;
      for (int j = i + 1; j < arr.length; j++) {
        if (!set.contains(arr[j])) {
          count++;
          set.add(arr[j]);
        } else {
          break;
        }
      }
      max = Math.max(count,max);
      set.clear();
    }
    return max;
  }

  public static int lengthOfLongestSubstring2(String s) {
    Map<Character, Integer> visited = new HashMap<>();
    String output = "";
    for (int start = 0, end = 0; end < s.length(); end++) {
      char currChar = s.charAt(end);
      if (visited.containsKey(currChar)) {
        start = Math.max(visited.get(currChar)+1, start);
      }
      if (output.length() < end - start + 1) {
        output = s.substring(start, end + 1);
      }
      visited.put(currChar, end);
    }
    return output.length();
  }

  public static int lengthOfLongestSubstring3(String s) {
    int start = 0;
    int end = 0;
    int max = 0;

    HashSet<Character> set = new HashSet<>();

    while (end < s.length()) {
      if (set.contains(s.charAt(end))) {
        set.remove(s.charAt(start));
        start++;
      } else {
        set.add(s.charAt(end));
        end++;
        max = Math.max(set.size(),max);
      }
    }

    return max;
  }


  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring3("tmmzuxt"));
  }
}
