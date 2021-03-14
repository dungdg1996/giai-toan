import java.util.Arrays;
import java.util.List;
// hình 3

public class SolutionTask1 {

    public static void main(String[] args) {
        System.out.println(solution(1, 8, 3, 2));
    }


    static int solution(int A, int B, int C, int D) {
        int[] array = new int[]{A, B, C, D};
        hoanvi(array, new int[4], 0);
        return rs;
    }

    static boolean[] flags = new boolean[4];
    static int rs = 0;

    static void hoanvi(int[] array, int[] kq, int k) {
        if (k == array.length) {
            if (kq[0] * 10 + kq[1] < 24 && kq[2] * 10 + kq[3] < 60) {
                rs++;
            }
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (!flags[i]) {
                kq[k] = array[i];
                flags[i] = true;
                hoanvi(array, kq, k + 1);
                flags[i] = false;
            }
        }
    }
}

//    2   kq[0]    k = 0

// k[0] = 8
// k[1] = 1
// k[2] = 4
// k[3] = 2
// k =4