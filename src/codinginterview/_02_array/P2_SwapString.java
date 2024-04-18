package codinginterview._02_array;

public class P2_SwapString {
    public char[] solution1(char[] message) {
        // 시간복잡도 : O(n)
        // 공간복잡도 : O(n)
        char[] reversed = new char[message.length];
        // int idx = 0 없이 구현하려면?

        // 규칙 : 합이 4
        // 4 > 0
        // 3 > 1
        // 2 > 2
        // 1 > 3
        // 0 > 4
        for (int i = message.length-1; i >= 0; i--) {
            reversed[message.length-1-i] = message[i];
        }

        return reversed;
    }


    // h e l l o
    // 0 1 2 3 4

    public char[] solution2(char[] message) {
        // 시간복잡도 : O(n) >> 배열이 엄청나게 크면 어차피 n임.
        // 공간복잡도 : O(n) > O(1)?
        /**
         * O(1)인 이유
         * 1. 별다른 Array 정의하지 않고, 기존 Array 사용
         * 2. char temp 로, 변수 1개만 만들어놓았기 때문
         */
        for (int i = 0; i < message.length/2; i++) {
            char temp = message[i];
            message[i] = message[message.length-1-i];
            message[message.length -1 - i] = temp;
        }

        return message;
    }


    public static void main(String[] args) {
        P2_SwapString swapString = new P2_SwapString();
        System.out.println(swapString.solution2("hello".toCharArray()));;
        System.out.println(swapString.solution2("happy new year".toCharArray()));;
    }
}
