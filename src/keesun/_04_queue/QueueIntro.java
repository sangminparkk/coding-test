package keesun._04_queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueIntro {
    public static void main(String[] args) {
        Queue<Integer> numbers = new ArrayDeque<>(); // new LinkedList도 가능

        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        numbers.offer(4);
        numbers.offer(5);
        numbers.offer(6);
        System.out.println(numbers);

//        System.out.println("==after poll==");
//        System.out.println(numbers.poll());
//        System.out.println(numbers);
//
//        System.out.println("==peek==");
//        System.out.println(numbers.peek());

        System.out.println(numbers.remove(7)); // O(n) -> 3을 삭제하라는 것.
        System.out.println(numbers);




    }
}
