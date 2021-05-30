package PracticeAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PlusOne {
  public static int[] plusOne(int[] digits) {
    boolean chainOfNine = true;
    for (int i =digits.length - 1; i >=0; i--) {
      if(chainOfNine && digits[i] == 9) {
        digits[i] = 0;
      } else {
        digits[i] = digits[i] + 1;
        return digits;
      }

    }
    int[] newArr = new int[digits.length + 1];
    newArr[0] = 1;
    for (int i =0; i < digits.length; i++) {
      newArr[i+1] = digits[i];
    }
    return newArr;
  }

  public static void main(String[] args) {
    int[] arr = {0};
    System.out.println(Arrays.toString(plusOne(arr)));
  }

}
