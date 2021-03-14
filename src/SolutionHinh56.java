public class SolutionHinh56 {
    public static void main(String[] args) {
        String s = "name,age\ndung,-20\ntrieu,-25";

        System.out.println(solution(s, "age"));
    }

    static int solution(String s, String C) {
        String[] rows = s.split("\n");

        String[] titles = rows[0].split(",");
        int vitri = 0;

        for (int i = 0; i < titles.length; i++) {
            if (titles[i].equals(C)) {
                vitri = i;
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < rows.length; i++) {
            String value = rows[i].split(",")[vitri];
            int n = Integer.parseInt(value);
            if (max < n) {
                max = n;
            }
        }

        return max;
    }
}
