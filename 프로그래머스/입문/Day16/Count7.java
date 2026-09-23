package 프로그래머스.입문.Day16;


import java.util.ArrayList;

public class Count7 {

    static void main() {
        ArrayList<Object> arr = new ArrayList<>();
        int[] list = new int[]{7, 77, 17};
        System.out.println(Solution.solution(list));
    }

    class Solution {
        public static int solution(int[] array) {
            int answer = 0;
            for (int i : array) {
                String s = String.valueOf(i);
                answer += s.length() - s.replace("7", "").length();

            }
            return answer;
        }
    }
}
