package 프로그래머스.입문.Day16;

public class Highest {

    static void main() {

    }

    class Solution {
        public int solution(int[] array, int height) {
            int answer = 0;

            for (int i : array) {
                if (i > height) {
                    answer++;
                }
            }
            return answer;
        }
    }

}
