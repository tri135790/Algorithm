package PracticeAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class PairWithSUm {
  public static int[] hasPairWithSum(int[] nums, int target) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    int[] result = new int[2];
    int length = nums.length;
    for ( int i = 0; i < length; i++) {
      if ( list.contains(nums[i])) {
        result[0] = list.indexOf(nums[i]);
        result[1] = i;
      }
      list.add(target - nums[i]);
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr1 = {1,2,5,4,3};
    System.out.println(Arrays.toString(PairWithSUm.hasPairWithSum(arr1, 9)));
  }

}
