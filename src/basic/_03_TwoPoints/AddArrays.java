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
        addArrays.solution(arr1, arr2).forEach(i -> System.out.print(i + " "));
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
