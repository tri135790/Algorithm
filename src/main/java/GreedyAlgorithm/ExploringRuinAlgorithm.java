package GreedyAlgorithm;

import org.codehaus.plexus.util.StringUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExploringRuinAlgorithm {

    public static String exploringRuin(String s) {
        for (int i = 0; i < s.length(); i++) {
            if ("?".equals(Character.toString(s.charAt(i)))) {
                if (!"a".equals(StringUtils.substring(s, i - 1, i)) && !"a".equals(StringUtils.substring(s, i + 1, i + 2))) {
                    s = s.substring(0, i) + "a" + s.substring(i + 1);
                } else {
                    s = s.substring(0, i) + "b" + s.substring(i + 1);
                }
            }
        }
        return s;
    }
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(ExploringRuinAlgorithm.exploringRuin(s));

    }
}
