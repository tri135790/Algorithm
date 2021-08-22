package PracticeAlgorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class TestMap {

    public static int findFactorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * findFactorial(number-1);
    }
    public static void main(String[] args) {
        System.out.println(findFactorial(4));
        int[] nums = new int[] {1,2,3,4,345,12,5,124,6,2};
        Arrays.stream(nums).sorted().forEach(s -> System.out.println());
    }
}
