package basic._01_string;

import java.util.Scanner;

public class FindCharacter {

    public static void main(String[] args) {
        FindCharacter findCharacter = new FindCharacter();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next().toUpperCase(); // nextLine > next
        char c = scanner.next().toUpperCase().charAt(0);

        int result = findCharacter.solution1(str, c);
        System.out.println(result);
    }

    private int solution1(String str, char c) {
        int count = 0;
        for (char t : str.toCharArray()) {
            if (t == c) {
                count++;
            }
        }
        return count;
    }

}
