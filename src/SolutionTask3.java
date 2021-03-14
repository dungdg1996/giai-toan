import java.util.HashSet;
import java.util.Set;
// hình 1
public class SolutionTask3 {

    public static void main(String[] args) {
        System.out.println(new SolutionTask3().solution("23"));
    }

    public int solution(String s) {
        StringBuilder builder = new StringBuilder(s);
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length() ; i++) {
            String temp = "" + builder.charAt(i);
            for (int j = 0; j <= 9; j++) {
                builder.replace(i, i + 1, String.valueOf(j));
                if (Integer.parseInt(builder.toString()) % 3 == 0) {
                    set.add(builder.toString());

                }
            }
            builder.replace(i, i + 1, temp);

        }

        return set.size();
    }
}
