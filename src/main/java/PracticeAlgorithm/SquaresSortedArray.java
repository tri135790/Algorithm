package PracticeAlgorithm;

import java.util.Arrays;

public class SquaresSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int[] squaredList = new int[nums.length];
        int i = 0, j = nums.length - 1;
        for (int counter = nums.length - 1; counter >= 0; counter--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                squaredList[counter] = nums[i]* nums[i];
                i++;
            } else {
                squaredList[counter] = nums[j]* nums[j];
                j--;
            }
        }
        return squaredList;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }
}
