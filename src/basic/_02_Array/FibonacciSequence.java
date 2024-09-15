package basic._02_Array;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        fibonacciSequence.solution4(counter);
    }

    private void solution4(int counter) {
        int previous = 1;
        int current = 1;
        int next = 0;

        // 컨셉은 생각했으나, 아래 코딩으로 구현 못했음
        System.out.print(previous + " " + current + " ");

        for (int i = 2; i < counter; i++) {
            next = previous + current;
            System.out.print(next + " ");
            previous = current;
            current = next;
        }

    }

    private Integer[] solution3(int counter) {
        Integer[] numbers = new Integer[counter];

        numbers[0] = 1;
        numbers[1] = 1;

        for (int i = 2; i < counter; i++) {
            numbers[i] = numbers[i-2] + numbers[i-1];
        }
        return numbers;
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
