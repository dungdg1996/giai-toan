// hình 4
public class SolutionHinh4 {
    public static void main(String[] args) {
        System.out.println(solution(14));
    }

    static int solution(int N) {
        int i = N + 1;
        int sum = sum(N);
        while (true) {
            if (sum(i) / 2 == sum) {
                return i;
            }
            i = i + 1;
        }
    }

    static int sum(int n) {
        int rs = 0;
        while (n > 0) {
            rs = rs + (n % 10);
            n = n / 10;

        }
        return rs;
    }
}