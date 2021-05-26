package PracticeAlgorithm;

import java.util.Arrays;

public class MoveZeroes {

  public static void moveZeroes(int[] nums) {
    int countZeroes = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[i - countZeroes] = nums[i];
        if (countZeroes != 0) {
          nums[i] = 0;
        }
      } else {
         countZeroes++;
      }
    }
  }

  public static void main(String[] args) {
    int [] arr = {0,1,0,3,0,0,12,0};
    moveZeroes(arr);
    System.out.println(Arrays.toString(arr));

  }
}
