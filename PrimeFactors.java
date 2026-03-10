import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactors {

    /**
     * Calculates the prime factors of a given integer.
     *
     * @param number The number for which to find prime factors.
     * @return A list containing all the prime factors (including duplicates).
     */
    public static List<Integer> primeFactors(int number) {
        int n = number;
        List<Integer> factors = new ArrayList<>();

        // Handle factor 2
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }

        // Handle odd factors
        // Loop from 3 to the square root of n, incrementing by 2
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        // If n is a prime number greater than 2, the remaining n is a prime factor
        if (n > 2) {
            factors.add(n);
        }

        return factors;
    }

    public static void main(String[] args) {
        int num =60;
        List<Integer> factors = primeFactors(num);

        System.out.println("Prime factors of " + num + ": " + factors);
       int num1 = 44;
        factors = primeFactors(num);
        System.out.println("Prime factors of " + num1 + ": " + factors);

        num = 17;
        factors = primeFactors(num);
        System.out.println("Prime factors of " + num + ": " + factors);
    }
}