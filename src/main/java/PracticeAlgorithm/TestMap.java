package PracticeAlgorithm;


import java.util.Arrays;

public class TestMap {

    public static void moveZeroes(int[] nums) {
        int countZeroes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countZeroes++;
            } else {
                nums[i-countZeroes] = nums[i];
            }
        }
        while (countZeroes > 0) {
            nums[nums.length -countZeroes] = 0;
            countZeroes--;
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[] {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
