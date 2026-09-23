package 프로그래머스.입문.Day16;

public class Split {

    static void main() {
        System.out.println(Solution.solution("abcdef123", 5));

    }

    static class Solution {
        public static String[] solution(String my_str, int n) {
            int mass = my_str.length() / n;
            if (my_str.length() % n != 0) {
                mass++;
            }

            String[] answer = new String[mass];

            int plus = 0;
            for (int i = 0; i < mass; i++) {

                if (plus + n > my_str.length()) {
                    answer[i] = my_str.substring(plus);
                    break;
                }
                answer[i] = my_str.substring(plus, plus+n);
                plus = plus + n;

            }

            return answer;
        }
    }

}
