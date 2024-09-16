package basic._02_Array;

import java.util.Scanner;

public class PrimeNumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        PrimeNumberCounter primeNumberCounter = new PrimeNumberCounter();
        int result = primeNumberCounter.solution2(counter);
        System.out.println(result);

    }
//
    private int solution2(int counter) {
        int answer = 0;
        int[] ch = new int[counter + 1]; // 해야 n번 index까지 생김
        for (int i = 2; i <= counter; i++) {
            if (ch[i] == 0) {
                answer++;
                // i의 배수를 모두 1로 만듦
                for (int j = i; j <= counter; j=j+i) {
                    ch[j] = 1;
                }
            }
        }

        return answer;
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
