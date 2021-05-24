package PracticeAlgorithm;

import java.util.ArrayList;

public class PairWithSUm {
  public static boolean hasPairWithSum(int[] arr, int sum) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    int length = arr.length;
    for (int i =0; i < length; i++ ) {
      if ( list.contains(arr[i])) {
        return true;
      }
      list.add(sum - arr[i]);
    }
    return false;
  }

  public static void main(String[] args) {
    int[] arr1 = {1,2,3,4,3};
    System.out.println(PairWithSUm.hasPairWithSum(arr1, 9));
  }

}
