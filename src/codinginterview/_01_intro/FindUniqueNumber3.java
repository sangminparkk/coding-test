package codinginterview._01_intro;

import java.util.ArrayList;
import java.util.List;

public class FindUniqueNumber3 {
    public int solution(int[] numbers) {

        // XOR 비트연산자 : 서로 다를때 1
        // 시간복잡도 : O(n)
        // 공간복잡도 : O(1)로 획기적으로 낮추는 방법

        // 기준이 필요함
        int uniqueNumber = 0;
        for (int number : numbers) {
            uniqueNumber ^= number; // 지리네.
        }

        return uniqueNumber;
    }

    public static void main(String[] args) {
        FindUniqueNumber3 findUniqueNumber = new FindUniqueNumber3();
        System.out.println(findUniqueNumber.solution(new int[]{2,2,3,3,4,4,1}));;
        System.out.println(findUniqueNumber.solution(new int[]{2,2,3,3,4,4,1,1,5}));;
    }


}
