package basic._03_TwoPoints;

import java.util.*;

public class AddArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        AddArrays addArrays = new AddArrays();
//        addArrays.solution(arr1, arr2).forEach(i -> System.out.print(i + " "));
        addArrays.solution2(arr1, arr2).forEach(i -> System.out.print(i + " "));
    }

    private List<Integer> solution2(int[] arr1, int[] arr2) {
        /**
         * how to solve the way of O(n) without two nested for loop
         * > I did not think about the while loop at all. it's not comfortable for me.
         */

        List<Integer> answers = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] < arr2[p2]) {
                answers.add(arr1[p1++]);
            } else {
                answers.add(arr2[p2++]);
            }
        }

        // 누가 남았는지 모르니까 둘다 해야된다? ㄷㄷ
        while (p1 < arr1.length) {
            answers.add(arr1[p1++]);
        }

        while (p2 < arr2.length) {
            answers.add(arr2[p2++]);
        }

        return answers;
    }


    private List<Integer> solution(int[] arr1, int[] arr2) {
        List<Integer> answers = new ArrayList<>();

        for (int number : arr1) {
            answers.add(number);
        }

        for (int number : arr2) {
            answers.add(number);
        }

        answers.sort(Comparator.naturalOrder());
        return answers;
    }
}
