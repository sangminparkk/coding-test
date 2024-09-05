package basic._01_string;

import java.util.Scanner;

public class SwapOnlyAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        SwapOnlyAlphabet swapOnlyAlphabet = new SwapOnlyAlphabet();
        System.out.println(swapOnlyAlphabet.solution2(inputString));
    }

    private String solution2(String inputString) {
        char[] array = inputString.toCharArray();
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            if (!Character.isAlphabetic(array[left])) {
                left++;
            } else if (!Character.isAlphabetic(array[right])) {
                right--;
            } else {
                char tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
                left++;
                right--;
            }
        }
        return String.valueOf(array);
    }

    private String solution(String inputString) {
        char[] array = inputString.toCharArray();
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            if (Character.isAlphabetic(array[left])) {
                char tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }

            left++;
            right--;
        }

        return String.valueOf(array);
    }
}