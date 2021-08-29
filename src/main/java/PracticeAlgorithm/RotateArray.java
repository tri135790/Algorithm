package PracticeAlgorithm;



import java.util.Arrays;

public class RotateArray {
  public static void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums,0, nums.length -1);
    reverse(nums,0, k-1);
    reverse(nums, k, nums.length -1);

  }

  public static void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      end--;
      start++;
    }
  }

  public static void rotate2(int[] nums, int k) {
    k  %= nums.length;
    int shift = nums.length - k;

    int[] store = new int[shift];
    for (int i = 0; i < store.length; i++) {
      store[i] = nums[i];
    }

    for (int i=0; i < nums.length; i++) {
      if (i < k) {
        nums[i] = nums[i + shift];
      } else {
        nums[i] = store[i-k];
      }
    }

  }

  public static void main (String[] args) {
    int [] arr = {1,2,3,4,5,6,7};
    rotate2(arr, 3);
    System.out.println(Arrays.toString(arr));
  }

}



//1 2 3 4 5 6 7
// 1 2 3 4 5 6 7
// 1 2 7 4 5 6 3
// 1 2 7 4 5 3 6
// 1 6 7 4 5 3 2
// 1 6 7 4 2 3 5
// 5 6 7 4 2 3 1
// 5 6 7 1 2 3 4
