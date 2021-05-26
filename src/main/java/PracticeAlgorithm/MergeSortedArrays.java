package PracticeAlgorithm;

import java.util.Arrays;

public class MergeSortedArrays {

  public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
    int length = arr1.length + arr2.length;
    int[] result = new int[length];
    int k = 0;
    int i = 0;
    int j = 0;
    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] <= arr2[j]) {
        result[k++] = arr1[i++];
      } else {
        result[k++] = arr2[j++];
      }
    }

    while (i < arr1.length) {
      result[k++] = arr1[i++];
    }

    while (j < arr2.length) {
      result[k++] = arr2[j++];
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr1 = {1, 5, 6, 7, 15, 17, 19, 20};
    int[] arr2 = {2, 4, 5, 8, 12};
    System.out.println(Arrays.toString(MergeSortedArrays.mergeSortedArrays(arr1, arr2)));
  }
}
