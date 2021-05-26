package PracticeAlgorithm;

public class MaximumSubarray {
  public static int maxSubArray(int[] nums) {
    int maxSum  ;
    int sum ;
    maxSum = nums[0];
    for (int i = 0; i < nums.length; i++) {
      sum = nums[i];
      if ( sum > maxSum) {
        maxSum = sum;
      }
      for ( int j = i + 1; j < nums.length; j++) {
        sum += nums[j];
        if ( sum > maxSum) {
          maxSum = sum;
        }
      }

    }
    return maxSum;
  }

  public static void main (String[] args) {
    int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(MaximumSubarray.maxSubArray(arr));
  }
}
