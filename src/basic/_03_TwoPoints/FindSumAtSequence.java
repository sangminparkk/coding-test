package basic._03_TwoPoints;

public class FindSumAtSequence {

    public static void main(String[] args) {

        int n = 0, m = 0;
        int[] arr = new int[n];
        FindSumAtSequence findSumAtSequence = new FindSumAtSequence();
        System.out.println(findSumAtSequence.solution(n, m, arr));;
    }

    private int solution(int n, int m, int[] arr) {
        int answer = 0, sum =0, lt = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) {
                answer++;
            }

            while (sum >= m) { // 여러번 빼야하는 경우가 생길 수 있음
                sum -= arr[lt++];
                if (sum == m) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
