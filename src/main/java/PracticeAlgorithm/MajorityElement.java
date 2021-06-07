package PracticeAlgorithm;

import java.util.HashMap;

public class MajorityElement {
  public static int majorityElement(int[] nums) {
    int max = (int) Math.ceil(nums.length/2);
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        map.put(nums[i],map.get(nums[i]) + 1);

      } else {
        map.put(nums[i], 0);
      }
      if (map.get(nums[i]) > max) {
        return nums[i];
      }
    }
    return 0;
  }

  public static void main (String[] args) {
    int[] arr = {2,2,1,1,1,2,2};
    System.out.println(majorityElement(arr));
  }
}
