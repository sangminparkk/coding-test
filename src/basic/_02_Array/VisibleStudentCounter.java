package basic._02_Array;

import java.util.Scanner;

public class VisibleStudentCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentNumber = scanner.nextInt();
        Integer[] students = new Integer[studentNumber];

        for (int i = 0; i < studentNumber; i++) {
            students[i] = scanner.nextInt();
        }

        VisibleStudentCounter visibleStudentCounter = new VisibleStudentCounter();
        System.out.println(visibleStudentCounter.solution(studentNumber, students));;
    }

    private int solution(int studentNumber, Integer[] students) {
        int count = 1;
        // max 를 계속 갱신해야하는구나
        int max_height = students[0];
        for (int i = 1; i < studentNumber; i++) {
            if (students[i] > max_height) {
                max_height = students[i];
                count++;
            }
        }
        return count;
    }
}
