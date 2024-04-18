package codinginterview._01_intro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindUniqueNumber2 {
    public int solution(int[] numbers) {
        //list 구현
        List<Integer> list = new ArrayList<>();

        // 시간복잡도 : List 내부 순회 포함 > O(n) * O(n) = O(n^2)
        // 공간복잡도 : List 갯수만큼 > O(n)
        for (int number : numbers) {
            if (list.contains(number)) {
                list.remove((Integer) number); // Object 구현 : (Integer) number ★★
            } else { // else 처리해야했음.
                list.add(number);
            }
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        FindUniqueNumber2 findUniqueNumber = new FindUniqueNumber2();
        System.out.println(findUniqueNumber.solution(new int[]{2,2,3,3,4,4,1}));;
        System.out.println(findUniqueNumber.solution(new int[]{2,2,3,3,4,4,1,1,5}));;
    }


}
