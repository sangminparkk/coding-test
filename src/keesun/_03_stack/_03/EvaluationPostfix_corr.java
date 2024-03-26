package keesun._03_stack._03;

import keesun._03_stack._02.CheckingBrackets_ref;

import java.util.LinkedList;
import java.util.Stack;

public class EvaluationPostfix_corr {
    public static void main(String[] args) {

        EvaluationPostfix_corr postfix = new EvaluationPostfix_corr();
        System.out.println(postfix.evaluate("52+") == 7);
        System.out.println(postfix.evaluate("52-") == 3);
        System.out.println(postfix.evaluate("52*") == 10);
        System.out.println(postfix.evaluate("52/") == 2);
        System.out.println(postfix.evaluate("521+-9*") == 18);
    }

    public int evaluate(String postfix) {
        postfix.trim();
        LinkedList<Integer> numbers = new LinkedList<>(); // 자바에서 제공하는 LinkedList 를 사용해도 됨

        // 이렇게 순회할 수도 있음
        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            if (Character.isDigit(c)) {
                numbers.push(c - '0'); // 자바에 얼마나 익숙한가?!!
            } else { // 괄호없어서 산술식
                int right = numbers.pop();
                int left = numbers.pop();

                // 뽑고나서 필터구나
                switch (c) {
                    case '+':
                        numbers.push(left + right);
                        break;
                    case '-':
                        numbers.push(left - right);
                        break;
                    case '/':
                        numbers.push(left / right);
                        break;
                    case '*':
                        numbers.push(left * right);
                        break;
                }
            }

        }

        return numbers.pop(); //이게 또...왜 생각이 안나냐ㅋ
    }
}

