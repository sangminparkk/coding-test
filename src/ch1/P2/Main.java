package ch1.P2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            if (Character.isLowerCase(c)) c = Character.toUpperCase(c);
            else c = Character.toLowerCase(c);
            System.out.print(c);
        }
    }
}



