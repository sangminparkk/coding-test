package keesun._00_intro;

import java.lang.reflect.Array;
import java.util.*;

public class FindUniqueNumber {
    public static void main(String[] args) {
        FindUniqueNumber findUniqueNumber = new FindUniqueNumber();
        int result = findUniqueNumber.solution3(new int[]{1, 2, 2, 3, 3});
        System.out.println(result == 1);
    }

    private int solution1(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : numbers) {
            if (list.contains(num)) { // 2. contains 조차도 for loop이 들어있는거임
                list.remove(Integer.valueOf(num));
            } else {
                list.add(num);
            }
        }

        return list.get(0);
    }

    private int solution2(int[] numbers) {
        // 배열에 들어있는 숫자 > key
        // 등장 횟수 > value
        // 최종 : 등장 횟수가 1인 key값을 리턴한다

        HashMap<Integer,Integer> numbersMap = new HashMap<>();

        for (int num : numbers) {
            numbersMap.put(num, numbersMap.getOrDefault(num, 0) + 1); // 전혀 몰랐던 기능 > 해당 키가
        }

        for (int num : numbers) {
            if (numbersMap.get(num) == 1) {
                return num;
            }
        }

        return 0;
    }

    private int solution3(int[] numbers) {
        // XOR 비트 연산자 : 두 값이 다르면 1
        int uniqueNumber = 0;
        for (int num : numbers) {
            uniqueNumber ^= num;
        }
        return uniqueNumber;
    }

}
