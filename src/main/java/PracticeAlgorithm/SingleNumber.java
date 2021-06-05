package PracticeAlgorithm;

import java.util.ArrayList;
import java.util.HashSet;

public class SingleNumber {
  public static int singleNumber(int[] nums) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i< nums.length; i++) {
      if ( list.contains(nums[i])) {
        list.remove(list.get(list.indexOf(nums[i])));
      } else {
        list.add(nums[i]);
      }
    }
    return list.get(0);
  }

  public static int singleNumber3(int[] nums) {
    int a = 0;
    for (int i : nums) {
      a ^= i;
    }
    return a;
  }

  public static int singleNumber2(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i< nums.length; i++) {
      if (set.contains(nums[i])) {
        set.remove(nums[i]);
      } else {
        set.add(nums[i]);
      }
    }
    Integer[] arr = set.toArray(new Integer[set.size()]);
    return  arr[0];
  }


  public static void main(String[] args) {
    int[] arr = {4,1,2,1,2};
    System.out.println(singleNumber3(arr));
  }
}
