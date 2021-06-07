package PracticeAlgorithm;

import java.util.Arrays;
import java.util.HashSet;

//review
public class MissingNumber {
  public static int missingNumber(int[] nums) {
    Arrays.sort(nums);
    for ( int i = 0; i < nums.length; i++) {
      if( i != nums[i]) {
        return i;
      }
    }
    return nums.length;
  }

  public static int missingNumber2(int[] nums) {
    int sum = 0;
    int sumMax = 0;
    for (int i = 0; i < nums.length; i++) {
      sum = sum + nums[i];
      sumMax = sumMax + i;
    }
    sumMax = sumMax + nums.length;
    return sumMax - sum;
  }

  public static void main (String[] args) {
    int[] nums = {9,6,4,2,3,5,7,0,1};
    System.out.println(missingNumber(nums));
    System.out.println(missingNumber2(nums));
  }
}
