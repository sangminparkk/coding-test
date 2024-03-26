package keesun._03_stack._02;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CheckingBrackets_ref {
    public static void main(String[] args) {
        CheckingBrackets_ref checkingBrackets = new CheckingBrackets_ref();
        System.out.println(checkingBrackets.check("[{1 + 2 * (2 + 2)} - (1 - 3)]"));
        System.out.println(checkingBrackets.check("[{1 + 2 * (2 + 2)} - [1 - 3)]"));
        // 테스트 케이스를 위해서 아래와 같이 추가 진행해보면서, 검증하는거야.
        System.out.println(checkingBrackets.check("((()))"));
        System.out.println(checkingBrackets.check("(()))"));
        System.out.println(checkingBrackets.check("((())"));
    }


    public boolean check(String mathExpression) {
        /**
         * 중복 코드 제거
         */

        Stack<Character> brackets = new Stack<>();
        List<Character> openingBrackets = Arrays.asList('(', '{', '[');
        List<Character> closingBrackets = Arrays.asList(')', '}', ']');

        char[] chars = mathExpression.toCharArray();
        for (char c : chars) {
            if (openingBrackets.contains(c)) {
                brackets.push(c);
            } else if (closingBrackets.contains(c)) {
                // 매칭 -> List indexing
                if (brackets.isEmpty()) {
                    return false;
                }

                Character openingBracket = brackets.pop();
                if (closingBrackets.indexOf(c) != openingBrackets.indexOf(openingBracket)) {
                    return false;
                }


            }
        }

        return brackets.isEmpty();
    }
}
