package PracticeAlgorithm;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int head = 0;
        int tail = nums.length-1;
        int middle;

        while (head <= tail) {
            middle = head + (tail-head)/2;
            if (nums[middle] < target) {
                head = middle + 1;
            } else if (nums[middle] > target) {
                tail = middle - 1;
            } else {
                return middle;
            }
        }

        return head;

    }

    public static void main (String[] args) {
        System.out.println(searchInsert(new int[] {1,3,5,6,9,12}, 13));
    }
}
