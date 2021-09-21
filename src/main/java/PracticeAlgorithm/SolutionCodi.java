package PracticeAlgorithm;

import java.util.*;

public class SolutionCodi {

    public static int solution(int[] A) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(A[0] + A[1], 1);
        for (int i =1; i< A.length - 1; i++) {
            if (A[i] + A[i+1] != A[i-1] + A[i]) {
                if (hashMap.containsKey(A[i] + A[i+1])) {
                    hashMap.put(A[i] + A[i+1], hashMap.get(A[i]+A[i+1]) + 1);
                } else {
                    hashMap.put(A[i] + A[i+1], 1);
                }
            }
        }

        return Collections.max(hashMap.values());
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {9,9,9,9,9}));
    }
}
