package PracticeAlgorithm;


//PENDING

import java.util.Arrays;

public class RotateArray {
  public static void rotate(int[] nums, int k) {
    if (nums.length > k) {
      int[] arr = new int[k];
      int count = 0;
      for (int i = nums.length - k; i < nums.length; i++) {
        arr[count++] = nums[i];
      }
      for (int i = nums.length - 1; i >= 0; i--) {
        if (i >= k) {
          nums[i] = nums[i - k];
        } else {
          nums[i] = arr[i];
        }
      }
    }
  }

  public static void main (String[] args) {
    int [] arr = {1,2,3,4,5,6,7};
    rotate(arr, 3);
    System.out.println(Arrays.toString(arr));
  }
}
