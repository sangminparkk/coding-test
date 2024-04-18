package codinginterview._01_intro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindUniqueNumber {

    public int solution(int[] numbers) {
        // Set : key 중복이 안됨
        // Map : key 중복될 수 있다? > value 값은 바뀔수 있다.
        Map<Integer, Integer> maps = new HashMap<>();

        // 시간복잡도 : O(n) + O(n) > O(2n) > O(n) ==> for loop 2번
        // 공간복잡도 : O(n) > map의 사이즈
        for (int num : numbers) {
            maps.put(num, maps.getOrDefault(num, 0)+1);
        }

        for (int number : numbers) {
            if (maps.get(number) == 1) {
                return number;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        FindUniqueNumber findUniqueNumber = new FindUniqueNumber();
        System.out.println(findUniqueNumber.solution(new int[]{2,2,3,3,4,4,1}));;
        System.out.println(findUniqueNumber.solution(new int[]{2,2,3,3,4,4,1,1,5}));;
    }


}
