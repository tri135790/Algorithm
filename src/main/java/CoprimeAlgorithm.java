import java.io.BufferedReader;
import java.io.InputStreamReader;

class CoprimeAlgorithm {

    public static int findCoprime(int n) {
        boolean found = false;
        int a = n - 2;
        while (!found) {
            for (int i = a; i >= 1; i--) {
                if (a % i == 0 && n % i == 0) {
                    if (i == 1) {
                        found = true;
                    } else {
                        a = a - 1;
                        break;
                    }
                }
            }
        }
        return a;

    }

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(CoprimeAlgorithm.findCoprime(n));

    }
}

