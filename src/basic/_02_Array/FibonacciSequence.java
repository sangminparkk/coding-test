package basic._02_Array;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        for (int number : fibonacciSequence.solution2(counter)) {
            System.out.print(number + " ");
        }
    }

    private Integer[] solution2(int counter) {
        Integer[] numbers = new Integer[counter];

        int previous = 1;
        int current = 1;
        numbers[0] = previous;
        numbers[1] = current;

        for (int i = 2; i < counter; i++) {
            numbers[i] = previous + current;
            previous = current;
            current = numbers[i];
        }
        return numbers;
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
