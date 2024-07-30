package basic;

public class main55 {
    public static void main(String[] args) {
        int num = 11;
        int last = 300;
        findPrimes(num, last);
    }

    // Method to find all primes in the given range [start, end]
    static void findPrimes(int start, int end) {
        for (int n = start; n <= end; n++) {
            if (isPrime(n)) {
                System.out.println("Prime number: " + n);
            }
        }
    }

    // Method to check if a given number is prime
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        // Check divisors up to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
