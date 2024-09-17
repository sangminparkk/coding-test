package basic._02_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversePrimeNumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        int[] toReverse = new int[counter];
        for (int i = 0; i < counter; i++) {
            toReverse[i] = scanner.nextInt();
        }

        ReversePrimeNumberCounter primeNumberCounter = new ReversePrimeNumberCounter();

        for (int prime : primeNumberCounter.solution(counter, toReverse)) {
            System.out.print(prime + " ");
        }
    }

    private List<Integer> solution(int counter, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        //9
        //32 55 62 20 250 370 200 30 100



        return null;
    }
}
