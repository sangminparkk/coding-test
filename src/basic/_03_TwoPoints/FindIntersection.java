package basic._03_TwoPoints;

import java.util.Scanner;

public class FindIntersection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int[] arr1 = new int[num1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int num2 = sc.nextInt();
        int[] arr2 = new int[num2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        FindIntersection findIntersection = new FindIntersection();
        for (int num : findIntersection.solution(num1, num2, arr1, arr2)) {
            System.out.print(num + " ");
        }

    }

    private int[] solution(int num1, int num2, int[] arr1, int[] arr2) {
        // two points

        return null;
    }
}
