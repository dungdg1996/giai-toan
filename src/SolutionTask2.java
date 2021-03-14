import java.util.Map;
import java.util.TreeMap;
// hình 2

public class SolutionTask2 {
    public static void main(String[] args) {
        String[] A = new String[] {"z", "a"};
        String[] B = new String[] {"777777778", "8888888000"};
        String P = "8";


        System.out.println(new SolutionTask2().solution(A, B, P));
    }


    public String solution(String[] A, String[] B, String P) {
        Map<String, String> map = new TreeMap<>();

        for (int i = 0; i < A.length; i++) {
            map.put(A[i], B[i]);
        }

        for (String key : map.keySet()) {
            if (map.get("a").contains(P))
                return key;
        }

        return "NO CONTACT";
    }
}
