package basic._02_Array;

import java.util.*;

public class RPSGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roundCounter = scanner.nextInt();

        Integer[] playerA = new Integer[roundCounter];
        Integer[] playerB = new Integer[roundCounter];

        for (int i = 0; i < roundCounter; i++) {
            playerA[i] = scanner.nextInt();
        }

        for (int i = 0; i < roundCounter; i++) {
            playerB[i] = scanner.nextInt();
        }

        RPSGame rpsGame = new RPSGame();

        for (Character c : rpsGame.solution2(roundCounter, playerA, playerB).toCharArray()) {
            System.out.println(c);
        }
    }

    private String solution2(int roundCounter, Integer[] playerA, Integer[] playerB) {
        String answer = "";
        for (int i = 0; i < roundCounter; i++) {
            if (playerA[i].equals(playerB[i])) {
                answer += "D";
            } else if (playerA[i].equals(1) && playerB[i].equals(2) || playerA[i].equals(2) && playerB[i].equals(3) || playerA[i].equals(3) && playerB[i].equals(1)) {
                answer += "B";
            } else {
                answer += "A";
            }
        }

        return answer;
    }

    private List<Character> solution(int roundCounter, Integer[] playerA, Integer[] playerB) {
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < roundCounter; i++) {
            if (playerA[i].equals(playerB[i])) {
                result.add('D');
            } else {
                // 다른 걸 낸 상황 > 단순 반복 작업 > 좀더 간단하게 처리하는 방법?
                if (playerA[i].equals(1) && playerB[i].equals(2) || playerA[i].equals(2) && playerB[i].equals(3) || playerA[i].equals(3) && playerB[i].equals(1)) {
                    result.add('B');
                } else if (playerA[i].equals(2) && playerB[i].equals(1) || playerA[i].equals(1) && playerB[i].equals(3) || playerA[i].equals(3) && playerB[i].equals(2)) {
                    result.add('A');
                }
            }
        }

        return result;
    }
}


