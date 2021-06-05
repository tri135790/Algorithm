package PracticeAlgorithm;

import java.util.Arrays;

public class SortTest {
  public static void bubbleSort(int[] arr) {
    for (int m : arr) {
      for (int i =0; i< arr.length-1; i++) {
        if(arr[i] > arr[i+1]) {
          int x = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = x;
        }
      }
    }
  }
  public static void selectionSort(int[] arr) {
    for (int i=0; i< arr.length; i++) {
      int min = i;
      for(int j=i+1; j < arr.length; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      int x = arr[i];
      arr[i] = arr[min];
      arr[min] = x;
    }
  }

  public static void insertionSort(int[] arr) {
    for (int i = 1; i< arr.length; i++) {
      int j = i-1;
      int key = arr[i];
      while(j >=0 && arr[j] > key) {
        arr[j+1]= arr[j];
        j--;
      }
      arr[j+1]= key;
    }
  }

  public static int[] mergedSort(int[] arr) {
    if (arr.length == 1) {
      return arr;
    }
    int[] leftArr = Arrays.copyOfRange(arr, 0, arr.length/2);
    int[] rightArr = Arrays.copyOfRange(arr, arr.length/2, arr.length);
    return MergeSortedArrays.mergeSortedArrays(mergedSort(leftArr),mergedSort(rightArr));
  }

  public static void main(String[] args) {
    int[] arr = {1,2,65,77,4,6,3,98,2};

    System.out.println(Arrays.toString(mergedSort(arr)));
  }
}
