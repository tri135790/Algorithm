package PracticeAlgorithm;

public class HouseRobber {
  public static int rob(int[] nums) {
    if(nums == null || nums.length ==0) {
      return 0;
    }
    if (nums.length == 1) {
      return nums[0];
    }
    if (nums.length == 2) {
      return Math.max(nums[0],nums[1]);
    }

    int[] dp = new int[nums.length];
    dp[0] = nums[0];
    dp[1] = Math.max(nums[0],nums[1]);
    for(int i = 2; i < dp.length; i++) {
      dp[i] = Math.max(nums[i] + dp[i-2], dp[i-1]);
    }
    return dp[dp.length-1];
  }

  public static void main (String[] args) {
    int[] arr1 = {2,7,9,3,1};
    System.out.println(rob(arr1));
  }
}
