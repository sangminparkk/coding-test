package keesun._01_array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.*;

public class _P2_SwapString {
    public static void main(String[] args) {
        _P2_SwapString swapString = new _P2_SwapString();
        char[] result = swapString.solution3("hello".toCharArray()); // 입력값을 배열로 받고 싶은경우!!!!!! ★★★
        System.out.println(result);
    }

    // 1. 가장 단순한 방법
    public char[] solution1(char[] message) {
        char[] reverseMessage = new char[message.length];
        for (int i = 0; i < message.length; i++) {
            reverseMessage[message.length - i - 1] = message[i];
        }
        return reverseMessage;
    }

     // 2. 스왑
    public char[] solution2(char[] message) {
        for (int i = 0; i < message.length/2 ; i++) {
            char temp = message[i];
            message[i] = message[message.length - 1 - i];
            message[message.length - 1 - i] = temp;
        }
        return message;
    }

    // 3.StringBuilder
    public char[] solution3(char[] message) {
        StringBuilder reversed = new StringBuilder();
        reversed.append(message).reverse();
        return reversed.toString().toCharArray();
    }

}
