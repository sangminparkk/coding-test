package keesun._03_stack;

import java.util.*;

public class StackIntro {
    public static void main(String[] args) {
        Stack<Character> numbers = new Stack<>(); // synchronized 로 인해 성능 저하가 있지만, 싱글 스레드이기 때문에 그냥 스택으로 합니다! 좀더 직관적이라서!
//        Deque<Integer> numbers = new ArrayDeque<>();

        System.out.println();

        numbers.push('1');
        numbers.push('2');
        numbers.push('3');
        numbers.push('4');

        System.out.println(numbers);
        System.out.println();

        // 이건 센스
        System.out.println('1' - '0');
        System.out.println(Integer.parseInt('1'+""));


        System.out.println();
        System.out.println(numbers.pop()); // 4로 뽑히네?
        System.out.println(numbers.isEmpty());// empty > true

    }



}
