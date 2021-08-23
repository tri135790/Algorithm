package PracticeAlgorithm;

import java.util.Arrays;
import java.util.HashSet;

public class TwoSum2 {

    public static int[] twoSum(int[] numbers, int target) {
        int[] results = new int[2];
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i< numbers.length; i++) {
            if (set.contains(numbers[i])) {
                results[1] = i + 1;
                break;
            } else {
                set.add(target - numbers[i]);
            }
        }
        for (int i =0; i < results[1]-1; i++) {
            if (numbers[i] == target - numbers[results[1] - 1]) {
                results[0] = i + 1;
            }
        }

        return results;
    }

    public static int[] twoSum2(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        while(start < end){
            if(numbers[start] + numbers[end] == target) break;
            if(numbers[start] + numbers[end] < target) start++;
            else end--;
        }
        return new int[]{start + 1, end + 1};
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2,7,11,15};
        System.out.println(Arrays.toString(twoSum2(nums,9)));
    }
}
