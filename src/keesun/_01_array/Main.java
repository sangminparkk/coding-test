package keesun._01_array;

import java.net.Inet4Address;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // P1
        int[] arr = {1, 2, 3, 1};
        Arrays.stream(arr).sorted().toArray();
        Arrays.sort(arr);


        //P2
        char[] charArr = {'a', 'b', 'c'};
        System.out.println(charArr); // 그냥 문자열로 출력이 됨 ★
        System.out.println(Arrays.toString(charArr)); // [a, b, c]

        System.out.println();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(1, 3);
        System.out.println(map.values());


        System.out.println();
        int num = new Random().nextInt(0, 5);
        System.out.println("num = " + num);
    }
}
