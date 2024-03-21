package keesun._01_array;

import javax.xml.stream.events.StartDocument;
import java.util.*;

public class _P3_TwoSumSolutions {
    public static void main(String[] args) {
        _P3_TwoSumSolutions twoSumSolutions = new _P3_TwoSumSolutions(); // 클래스명 findTargetIndex -> twoSumSolutions
        System.out.println(Arrays.toString(twoSumSolutions.solution2_ref(new int[]{2,3,5,7}, 9))); // 한줄로 출력하는 방법
    }

    // 1. 가장 단순한 방법
    public int[] solution1(int[] numbers, int target) {
        int[] targetIndex = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    targetIndex[0] = i; // 배열에 해당되는 값을 어떻게 넣지?
                    targetIndex[1] = j;
                }
            }
        }
        return targetIndex;
    }

    public int[] solution1_ref(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null; // 면접관과 상의 필요 : null or throw new Exception;
    }

    // 2.
    public int[] solution2(int[] numbers, int target) {
        Map<Integer, Integer> targetMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            targetMap.put(numbers[i], i); // 일단 넣는다
        }

        // 따로 구현하셨음 >> 나는 하나의 루프로 다 처리하려고 했었다.. >> 문제점 : 기존에 값들이 없어서 수행을 못함
        for (int i = 0; i < numbers.length; i++) {
            int numberToFind = target - numbers[i];
            if (targetMap.containsKey(numberToFind) && targetMap.get(numberToFind) != i) { // 중복 제거 추가됨
//            if (targetMap.containsKey(numberToFind)) { // 중복 제거 추가됨
                return new int[]{i, targetMap.get(numberToFind)};
            }
        }
        return null;
    }

    public int[] solution2_ref(int[] numbers, int target) {
        Map<Integer, Integer> targetMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int numberToFind = target - numbers[i];
            if (targetMap.containsKey(numberToFind) && targetMap.get(numberToFind) != i) {
                return new int[]{i, targetMap.get(numberToFind)};
            }

            // 한번에 할경우에는 1) 먼저 조건 검증 2)그다음에 넣는다. >> 내가 계속해서 틀리는 부분.
            targetMap.put(numbers[i], i);
        }
        return null;
    }



}
