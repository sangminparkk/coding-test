package keesun._01_array;

import java.util.*;

public class _P1_ContainsDuplicate { // 클래스명 분명히 할 것 : isDuplicateNumber -> ContainsDuplicate

    /**
     * 시간 : O(n) > 순회
     * 공간 : O(1) > 변수 하나
     */
    public static void main(String[] args) {
        _P1_ContainsDuplicate containsDuplicate = new _P1_ContainsDuplicate();
        boolean result = containsDuplicate.solution3(new int[]{1,2,3,4,5,1});
        System.out.println(result);
    }

    // 1. 가장 단순한 버전 / 시간 : O(n2) / 공간 : O(1)
    public boolean solution1(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) { // idx -> i + 1
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // 2. 배열 정렬 가정 : 시간 : O(NlogN), 공간 : O(logN) >> trade off 성질에 따라 공간 복잡도는 높아졌음
    public boolean solution2(int[] numbers) {

        // 정렬 조건 추가
//        Arrays.stream(numbers).sorted().toArray(); // stream 사용하지 않는 게 메모리 사용 측면에서 좋죠. 새로운 변수를 생성하면 X
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                return true;
            }
        }
        return false;
    }


    // 3. set 사용
    public boolean solution3(int[] numbers) {
        Set<Integer> numberSet = new HashSet<>(); // result -> numberSet 변경
        for (int num : numbers) {
            if (numberSet.contains(num)) {
                return true;
            } else {
                numberSet.add(num);
            }
        }
        return false;
    }



}
