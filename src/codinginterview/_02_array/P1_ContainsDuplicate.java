package codinginterview._02_array;

import java.util.*;

//TODO. list, set, map 기본 오퍼레이션의 알고리즘 복잡도

public class P1_ContainsDuplicate {
    public boolean solution1(int[] numbers) {

        //배열
        /**
         * 질문1. 배열 정렬 여부 ★ > 시간복잡도에 영향을 미치기 때문
         */
        // 시간복잡도 : 0(n^2)
        // 공간복잡도 : O(1)
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean solution2(int[] numbers) {
        // 배열이 정렬되어 있다면? 숫자가 붙어있을 것이다 >> 추론 : 한번만 순회하면 됨
        // 1 2 2 3 3
        // 시간복잡도 : O(NlogN)
        // 시간복잡도 : O(logN) >> 트레이드오프
        Arrays.sort(numbers); // 무조건 Arrays.stream.sorted.toArrays() 로 잡을 필요가 없네;;; >> 단, sorted 사용시 시간복잡도 O(NlogN), 공간복잡도 O(logN)

        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                return true;
            }
        }

        return false;
    }

    // set 중복 허용 X >> 아예 오류 발생 가능성을 없애는건가?, 조회 O(1)
    public boolean solution3(int[] numbers) {
        // 시간복잡도 : O(n)
        // 공간복잡도 : O(n)
        Set<Integer> numbersSet = new HashSet<>();

        for (int num : numbers) {
            if (numbersSet.contains(num)) { // set의 contains operation이 O(1)임 >> 인터페이스가 어떻게 구현되어 있는지에 따라 달렸음.
                return true;
            } else {
                numbersSet.add(num);
            }
        }
        return false;
    }

    // 시간복잡도 : O(n) + O(n) = O(n)
    // 공간복잡도 : O(n)
    public boolean solution4(int[] numbers) {

        Map<Integer, Integer> numbersMap = new HashMap<>();

        for (int num : numbers) {
            numbersMap.put(num, numbersMap.getOrDefault(num, 0) + 1);
        }

        return numbersMap.containsValue(2);
    }

    public static void main(String[] args) {
        P1_ContainsDuplicate containsDuplicate = new P1_ContainsDuplicate();
        System.out.println(containsDuplicate.solution3(new int[]{1,2,3,4,5,6})); // false
        System.out.println(containsDuplicate.solution3(new int[]{1,2,3,1})); // true
    }

}
