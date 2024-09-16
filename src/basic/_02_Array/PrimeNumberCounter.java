package basic._02_Array;

import java.util.Scanner;

public class PrimeNumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        PrimeNumberCounter primeNumberCounter = new PrimeNumberCounter();
        int result = primeNumberCounter.solution(counter);
        System.out.println(result);

    }

    private int solution(int counter) {
        boolean[] isPrimes = new boolean[counter];

        for (int i = 1; i <= counter; i++) {
            if (i == 1) {
                isPrimes[i] = false;
            } else {
                int primeCounter = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        primeCounter++;
                    }
                }

                if (primeCounter == 1) { // always 1 except for itself
                    isPrimes[i] = true;
                }
            }
        }

        int count = 0;
        for (boolean prime : isPrimes) {
            if (prime) {
                count++;
            }
        }
        return count;
    }
}
