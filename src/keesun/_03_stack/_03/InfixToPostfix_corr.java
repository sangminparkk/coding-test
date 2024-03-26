package keesun._03_stack._03;

import java.util.Stack;

public class InfixToPostfix_corr {
    public static void main(String[] args) {
        InfixToPostfix_corr infixToPostfix = new InfixToPostfix_corr();
        String postfix = infixToPostfix.convert("(1+2)*3");
        System.out.println(postfix.equals("123*+"));
    }

    public String convert(String infix) {
        infix = infix.trim(); // 자기자신으로 변수 잡아줘야함
        StringBuilder postfix = new StringBuilder(); // StringBuilder를 사용해야하는 이유.. > append
        Stack<Character> stack = new Stack<>(); // 나는 이걸 잡는걸 못하겠음. 객체 타입 설정 ★★★★★

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);
            if (Character.isDigit(c)) {
                postfix.append(c); // append
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (stack.peek() != '(' && !stack.isEmpty()) {
                    postfix.append(stack.pop());
                }
                // 만나면
                stack.pop(); // 날리고
            } else { // 연산자
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }


        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    private int precedence(char c) {
        // 우선순위를 숫자로..ㄷㄷ
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '*' || c == '/') {
            return 2;
        } else {
            return 0;
        }
    }
}
