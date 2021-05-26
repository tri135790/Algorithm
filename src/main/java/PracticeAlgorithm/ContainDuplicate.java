package PracticeAlgorithm;

import java.util.ArrayList;
import java.util.HashSet;

public class ContainDuplicate {
  public static boolean containsDuplicate(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          return true;
        }
      }
    }
    return false;
  }
  public static boolean containsDuplicate2(int[] nums) {
    HashSet<Integer> set = new HashSet<Integer>();
    for (int i = 0; i< nums.length; i++) {
      if ( set.contains(nums[i])) {
        return true;
      }
      set.add(nums[i]);
    }
    return false;
  }


  public static void main (String[] args) {
    int [] arr = {1,2,3,4,5,6,7,8,9,10};
    System.out.println(containsDuplicate2(arr));
  }
}
