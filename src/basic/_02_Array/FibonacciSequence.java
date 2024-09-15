package basic._02_Array;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        for (int number : fibonacciSequence.solution(counter)) {
            System.out.print(number + " ");
        }
    }

    private Integer[] solution(int counter) {
        Integer[] numbers = new Integer[counter];

        int previous = 0;
        int current = 1;
        numbers[0] = current;

        for (int i = 1; i < counter; i++) {
            numbers[i] = previous + current;
            previous = current;
            current = numbers[i];
        }
        return numbers;
    }

}
