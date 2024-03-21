package keesun._01_array;

import java.util.Arrays;
import java.util.Random;

public class _P4_SortByArray {
    public static void main(String[] args) {
        _P4_SortByArray sortByArray = new _P4_SortByArray();
        System.out.println(Arrays.toString(sortByArray.solution1(new int[]{3,1,2,5,6,7,9})));
    }

    public int[] solution1(int[] numbers) {
        boolean[] booleans = new boolean[100];

        for (int num : numbers) {
            booleans[num] = true; // 값을 바꾸면서 없어진거 아님?
        }

        int index = 0;
        for (int i = 0; i < booleans.length; i++) {
            if (booleans[i]) {
                numbers[index++] = i; // boolean index를 넣어줘야함
            }
        }

        return numbers;
    }


}
