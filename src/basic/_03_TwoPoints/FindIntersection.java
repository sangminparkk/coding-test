package basic._03_TwoPoints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        for (int num : findIntersection.solution2(num1, num2, arr1, arr2)) {
            System.out.print(num + " ");
        }

    }

    private List<Integer> solution2(int num1, int num2, int[] arr1, int[] arr2) {
        List<Integer> answer = new ArrayList<>();
        // 전처리
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int p1 = 0, p2 = 0;

        while (p1 < num1 && p2 < num2) {
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1++]);
//                p1++;
                p2++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        return answer;
    }

    private int[] solution(int num1, int num2, int[] arr1, int[] arr2) {
        // two points

        return null;
    }
}
