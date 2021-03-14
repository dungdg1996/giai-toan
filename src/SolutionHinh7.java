public class SolutionHinh7 {
    public static void main(String[] args) {
        System.out.println(solution(4, 8));
    }

    static int solution(int N, int K) {
        int sum = 0;
        int count = 0;
        for (int i = N; i > 0; i--) {
            if (sum + i <= K) {
                System.out.println(i);
                sum = sum + i;
                count = count + 1;
                if (sum == K) {
                    return count;
                }
            }
        }

        return -1;
    }
}
// a = 7, b = 7, c = 7
// aababc