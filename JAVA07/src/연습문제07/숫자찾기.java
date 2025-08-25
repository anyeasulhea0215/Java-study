package 연습문제07;

public class 숫자찾기 {
    public int solution(int num, int k) {
        String numstr = String.valueOf(num);

        int index = numstr.indexOf(String.valueOf(k));

        if (index != -1) {
            return index + 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        숫자찾기 sol = new 숫자찾기();

        System.out.println(sol.solution(291831, 1));
    }
}
