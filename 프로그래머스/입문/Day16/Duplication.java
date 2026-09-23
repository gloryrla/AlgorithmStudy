package 프로그래머스.입문.Day16;

public class Duplication {

    static void main() {

    }

    class Solution {
        public int solution(int[] array, int n) {
            int answer = 0;

            for (int i : array) {
                if (i == n) {
                    answer++;
                }
            }
            return answer;
        }
    }


}
