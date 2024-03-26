package keesun._03_stack._02;

import java.util.Stack;

public class CheckingBrackets {
    public static void main(String[] args) {
        CheckingBrackets checkingBrackets = new CheckingBrackets();
        System.out.println(checkingBrackets.check("[{1 + 2 * (2 + 2)} - (1 - 3)]"));
        System.out.println(checkingBrackets.check("[{1 + 2 * (2 + 2)} - [1 - 3)]"));
        // 테스트 케이스를 위해서 아래와 같이 추가 진행해보면서, 검증하는거야.
        System.out.println(checkingBrackets.check("((()))"));
        System.out.println(checkingBrackets.check("(()))"));
        System.out.println(checkingBrackets.check("((())"));
    }


    public boolean check(String mathExpression) {
        // 괄호가 맞으면 true, 아니면 false
        Stack<Character> brackets = new Stack<>(); // 틀림1. String -> Character

        /**
         * 코드가 훨씬 직관적임
         */
        char[] chars = mathExpression.toCharArray();
        for (char c : chars) {
            switch (c) {
                case '(' :
                case '{' :
                case '[' :
                    brackets.push(c);
                    break;
                case ')':
                    if (brackets.isEmpty() || brackets.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (brackets.isEmpty() || brackets.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (brackets.isEmpty() || brackets.pop() != '[') {
                        return false;
                    }
                    break;
//                        Character openingBracket = brackets.pop(); >> 이렇게 했다가, 다양한 테스트 케이스에서 막히니.. 조건 변경함. 왜? 비어있는데 꺼낼 수 없으니까!!
//                        if (openingBracket == null || openingBracket != '[') {
//                            return false;
//                        }
            }
        }

        return brackets.isEmpty();
        // 조건 부합 여부
//        for (int i = 0; i < mathExpression.length(); i++) {
//            if (mathExpression.charAt(i) == '[' || mathExpression.charAt(i) == '{' || mathExpression.charAt(i) == '(') {
//                stack.push(mathExpression.charAt(i));
//            }
//        }
    }
}
