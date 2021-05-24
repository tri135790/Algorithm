package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PikachuAndGameOfStringAlgorithm {
    public static int findGap(int i, String s, String t) {
        int gap = t.charAt(i) - s.charAt(i);
        if (gap < 0) {
            gap = gap + 26;
        }
        return gap;
    }

    public static int convertSingleLetter(int i, String s, String t) {
        int gap = PikachuAndGameOfStringAlgorithm.findGap(i, s, t);
        int dayof13 = (int) Math.floor(gap / 13);
        return dayof13 + gap - dayof13 * 13;
    }

    public static int convertMove(int n, String s, String t) {
        int day = 0;
        for (int i = 0; i < n; i++) {
            day = day + PikachuAndGameOfStringAlgorithm.convertSingleLetter(i, s, t);
        }
        return day;
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String t = br.readLine();
        System.out.println(PikachuAndGameOfStringAlgorithm.convertMove(n, s, t));

    }
}
