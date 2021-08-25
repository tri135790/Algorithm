package PracticeAlgorithm;

public class CountPrimes {
    static int i =2;
    public static int countPrimes(int n) {
        if (n <=2) {
            return 0;
        }
        int count = 0;
        for (int j = 3; j < n; j += 2) {
            if (isPrime(j)) {
                count++;
            }
            i=2;
        }
        return count + 1;
    }

    public static int countPrimes2(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }

        return count;
    }

    public static boolean isPrime(int n) {
        if(n == i) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        i++;
        return isPrime(n);
    }

    public static void main(String[] args) {
        System.out.println(countPrimes2(10));
    }

}
