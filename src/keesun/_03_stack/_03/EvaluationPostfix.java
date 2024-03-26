package keesun._03_stack._03;

import java.util.Stack;

public class EvaluationPostfix {
    public static void main(String[] args) {

        EvaluationPostfix postfix = new EvaluationPostfix();
//        System.out.println(postfix.evaluate("52+") == 7);
//        System.out.println(postfix.evaluate("52-") == 3);
        System.out.println(postfix.evaluate("521+-"));
    }

    public int evaluate(String str) {
        Stack<Character> stack = new Stack<>(); // 여기서 꼬였네. Integer로 받았어야했음
        char[] chars = str.toCharArray();

        for (char c : chars) {
            if (Character.isDigit(c)) {
                stack.push(c);
            } else {
                switch (c) {
                    case '+':
                        int right = stack.pop() - '0';
                        int left = stack.pop() - '0';

                        if (stack.isEmpty()) {
                            return left + right;
                        } else {
                            stack.push((char) (left + right));
                        }
                        break;
                    case '-':
                        right = stack.pop() - '0';
                        left = stack.pop() - '0';

                        // 이렇게 복잡하게 생각하지마 ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ
                        if (stack.isEmpty()) {
                            return left - right;
                        } else {
                            stack.push((char) (left - right));
                        }
                        break;
                }
            }
        }

        return 0;
    }
}

