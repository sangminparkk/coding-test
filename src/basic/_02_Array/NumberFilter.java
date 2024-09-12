package basic._02_Array;

import java.util.*;

public class NumberFilter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        NumberFilter numberFilter = new NumberFilter();
        Integer[] numbers = new Integer[number];

        for (int i = 0; i < number; i++) {
            numbers[i] = sc.nextInt();
        }

        for (Integer i : numberFilter.solution(numbers)) {
            System.out.print(i + " ");
        }
    }

    private List<Integer> solution(Integer[] numbers) {
        List<Integer> list = new ArrayList<>();
        list.add(numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i-1] < numbers[i]) {
                list.add(numbers[i]);
            }
        }

        return list;
    }

}
