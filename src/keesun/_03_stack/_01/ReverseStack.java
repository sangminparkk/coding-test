package keesun._03_stack._01;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {

        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);
        numbers.push(5);

        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println();

        ReverseStack reverseStack = new ReverseStack();
//        Stack<Integer> reversed = reverseStack.solution(numbers);
        reverseStack.solution(numbers);
        System.out.println(numbers);
    }

    private Stack<Integer> solution(Stack<Integer> stack) {
//        int count = stack.size();
        Stack<Integer> reversed = new Stack<>();

        // 내가 한거
//        for (int i = 0; i < count; i++) {
//            Integer item = stack.pop();
//            reversed.push(item);
//        }

        // 좀더 자료구조를 이해하고 있다면 아래와 같이 표현하는게 맞네.
        while (!stack.isEmpty()) {
            reversed.push(stack.pop()); // 걍 한줄 처리 ㄷㄷ
        }

        return reversed;
    }

    private void solution1(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int temp = stack.pop();
        solution1(stack);
        insertAtBottom(stack, temp);
    }

    private void insertAtBottom(Stack<Integer> stack, int number) {
        if (stack.isEmpty()) {
            stack.push(number);
            return; // else대신에 사용함
        }

        // 재귀자체가 반복이니 while문을 사용할 필요가 없네
        int temp = stack.pop();

//        stack.push(number); // 위의 if문에서 걸리겠죠
        stack.push(temp);
    }


}
