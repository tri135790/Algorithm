package PracticeAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class ReverseInteger {

    public static int reverse(int x) {
        List<Integer> list = new ArrayList<>();
        int a = 0;
        while (x != 0) {
            list.add(x % 10);
            x = x / 10;
        }
        for (int i = 0; i < list.size(); i++) {
            a = (int) (a +list.get(i) * Math.pow(10,list.size() - 1 - i));
        }
        return  (a > -1*Math.pow(2,31) && a < Math.pow(2,31) - 1) ? a : 0;
    }

    public static int reverse2(int x) {
        List<Integer> list = new ArrayList<>();
        int reverse = 0;
        while (x != 0) {
            int pop = x%10;
            x = x / 10;
            if (reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            reverse = reverse * 10 + pop;

        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(ReverseInteger.reverse2(1234567));
    }
}
