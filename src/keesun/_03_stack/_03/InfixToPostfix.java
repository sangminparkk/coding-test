package keesun._03_stack._03;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        String postfix = infixToPostfix.convert("1+2*3");
        System.out.println(postfix.equals("123*+"));
    }

    public String convert(String infix) {
        infix = infix.trim(); // 자기자신으로 변수 잡아줘야함
        String prefix = "";
        Stack<Character> stack = new Stack<>(); // 나는 이걸 잡는걸 못하겠음. 객체 타입 설정 ★★★★★

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isDigit(c)) {
                prefix += c;
            } else {
                if (stack.isEmpty()) {
                    stack.push(c);
                } else {
                    // 우선순위는 어떻게 적용할까? >> 얘도 switch 로 각각 우선순위
                    /**
                     * 여기서 별도의 메소드를 만드셔서 해결하심
                     * >> 복잡해질 것 같으면 걍 함수?
                     */
                    if (precedence(c) > precedence(stack.pop())) { // 내가 부족한것 : 이러한 조건을 while문을 통해서 내가 원하는 종료조건까지 루프돌리고.. 처리하기~
                        stack.push(c);
                    } else {
                        Character temp = stack.pop();
                        stack.push(c);
                        stack.push(temp);
                    }
                }
            }
        }

        System.out.println(stack);
        System.out.println(prefix);
        return prefix;
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
