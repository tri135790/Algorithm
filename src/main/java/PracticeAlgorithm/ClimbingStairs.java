package PracticeAlgorithm;

import java.util.ArrayList;
import java.util.HashSet;

public class ClimbingStairs {
  public static int climbStair(int n) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(1);
    arrayList.add(1);
    for (int i = 2; i <= n; i++) {
      arrayList.add(arrayList.get(i-2) + arrayList.get(i-1));
    }
    return arrayList.get(n);
  }

  public static void main(String[] args) {
    System.out.println(climbStair(2));
  }
}
