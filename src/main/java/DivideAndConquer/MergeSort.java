package DivideAndConquer;

import GreedyAlgorithm.PikachuAndGameOfStringAlgorithm;


public class MergeSort {

    void merge(int[] arr, int l, int m, int r) {
        if (l == m) {
            if (arr[r] <= arr[l]) {
                int a =  arr[r];
                arr[r] = arr[l];
                arr[l] = a;
            }
        }
    }

    void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - 1) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }


    public static void main(String args[]) throws Exception {
        int arr[] = {12, 11, 13, 5, 6, 7};
        MergeSort mergeSort = new MergeSort();

    }

}
